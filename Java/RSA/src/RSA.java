# import java.util.*;
#  
# import java.math.BigInteger;
# import java.security.SecureRandom;
#  
# public class RSA {
#     private int keyLength, blockSize;
#     private BigInteger privateKey, publicKey, n;
#     
#     /**
#      * Genera una coppia di chiavi pubblica/privata. La chiave privata avra'
#      * una lunghezza in bit pari al valore keyLength, quella pubblica la meta'.
#      */
#     public void generateKeys() {
#         BigInteger p = BigInteger.probablePrime(keyLength/2, new SecureRandom());
#         BigInteger q = BigInteger.probablePrime(keyLength/2, new SecureRandom());
#  
#         BigInteger n = p.multiply(q);
#         BigInteger phi = p.subtract(new BigInteger("1")).multiply(q.subtract(new BigInteger("1")));
#         
#         this.publicKey = p.nextProbablePrime();
#         this.privateKey = publicKey.modInverse(phi);
#         this.n = n;
#     }
#     
#     /**
#      * Costruttore della classe. Prende come argomento la lunghezza in bit
#      * della chiave privata che sara' generata.
#      */
#     public RSA(int keyLength) {
#         this.keyLength = keyLength;
#         //generateKeys();
#         
#         this.blockSize = (keyLength/2) / 8;
#     }
#     
#     /**
#      * Restituisce la chiave pubblica
#      * @return    Un BigInteger contenente la chiave pubblica.
#      */
#     public BigInteger getPublicKey() {
#         return publicKey;
#     }
#     
#     /**
#      * Restituisce la chiave privata
#      * @return    Un BigInteger contenente la chiave privata.
#      */
#     public BigInteger getPrivateKey() {
#         return privateKey;
#     }
#     
#     /**
#      * Restituisce il modulo (n)
#      * @return    Un BigInteger contenente il modulo
#      */
#     public BigInteger getModulus() {
#         return n;
#     }
#     
#     /**
#      * Imposta il valore della chiave pubblica. La stringa
#      * deve contenere un numero in formato esadecimale.
#      */
#     public void setPublicKey(String k) {
#         this.publicKey = new BigInteger(k, 16);
#     }
#     
#     /**
#      * Imposta il valore della chiave privata. La stringa
#      * deve contenere un numero in formato esadecimale.
#      */
#     public void setPrivateKey(String k) {
#         this.privateKey = new BigInteger(k, 16);
#     }
#     
#     public void setModulus(String k) {
#         this.n = new BigInteger(k, 16);
#     }
#     
#     /**
#      * Cripta un numero. E' principalmente un funzione ausiliaria.
#      */    
#     public BigInteger encrypt(BigInteger m) {
#         return m.modPow(publicKey, n);
#     }
#  
#     /**
#      * Decripta un numero. E' principalmente un funzione ausiliaria.
#      */    
#     public BigInteger decrypt(BigInteger m) {
#         return m.modPow(privateKey, n);
#     }
#     
#     /**
#      * Cripta una stringa e restituisce una stringa contenente il messaggio
#      * criptato in formato esadecimale.
#      * @param    Il messaggio da criptare
#      * @return    Il messaggio criptato
#      */    
#     public String encrypt(String m) {
#         String mHex = "";
#         for (int i = 0; i < m.length(); i++) {
#             mHex += Integer.toHexString(m.charAt(i));
#         }
#  
#         int padding = blockSize - (mHex.length()/2)%blockSize;
#         for (int i = 0; i < padding-1; i++) {
#             int randomPadding = (int)(10*Math.random());
#             mHex += randomPadding < 10 ? "0" + Integer.toHexString(randomPadding) : Integer.toHexString(randomPadding);
#         }
#         mHex += padding < 10 ? "0" + Integer.toHexString(padding) : Integer.toHexString(padding);
#         
#         int numBlocks = (mHex.length()/2)/blockSize;
#  
#         String result = "", currentBlock = "";
#         for (int b = 0; b < numBlocks; b++) {
#             currentBlock = mHex.substring(b*blockSize*2, (b+1)*blockSize*2);
#             BigInteger r = encrypt(new BigInteger(currentBlock, 16));
#  
#             if (r.toString(16).length() == blockSize*4) {
#                 result += r.toString(16);
#             } else {
#                 result += ("0" + r.toString(16));
#             }
#         }
#         return result;
#     }
#     
#     /**
#      * Decripta una stringa e restituisce una stringa contenente il messaggio
#      * in chiaro. L'argomento deve essere un messaggio criptato in formato esadecimale
#      * come restituito dalla funzione encrypt(String k)
#      * @param    Il messaggio da decriptare
#      * @return    Il messaggio in chiaro
#      */    
#     public String decrypt(String m) {
#         int numBlocks = (m.length()/2)/(blockSize*2);
#  
#         String temp = "", currentBlock = "";
#         for (int b = 0; b < numBlocks; b++) {
#             currentBlock = m.substring(b*blockSize*4, (b+1)*blockSize*4);
#             BigInteger r = decrypt(new BigInteger(currentBlock, 16));
#             temp += r.toString(16);
#         }
#  
#         int padding = Integer.parseInt(temp.substring(temp.length()-2), 16);
#         int actualLength = temp.length() - padding*2;
#  
#         temp = temp.substring(0, actualLength);
#  
#         String result = "";
#         for (int i = 0; i < temp.length(); i+=2) {
#             result += (char)Integer.parseInt(temp.substring(i,i+2), 16);
#         }
#         return result;
#     }
#     
# } 