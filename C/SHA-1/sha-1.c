/*
     sha-1.c (compatto) - Versione 1.10 - (2003) by Alberto Leporati
*/


#include <stdio.h>


// Definizione dei tipi "byte" e "word"

typedef unsigned char byte;
typedef unsigned int  word;


// Variabili globali

byte StringaInput[256];      // Messaggio di cui si vuole calcolare l'hash
word IndiceStringa;          // Indice su StringaInput
byte letti;                  // Numero di caratteri letti da LeggiBuffer()
byte X[64];                  // Blocco di 16 word attualmente elaborato
unsigned long LunghezzaMessaggio;      // Lunghezza del messaggio, in byte
word A, B, C, D, E;                    // Primo buffer
word H0, H1, H2, H3, H4;               // Secondo buffer
word W[16];                            // Sequenza derivata dal blocco X
word temp;


// Prototipi delle funzioni

byte LeggiBuffer                (void);
void AggiungiLunghezzaMessaggio (void);
void GeneraSequenzaW            (void);
void Pad                        (byte *, byte, byte);
word F                          (word, word, word);
word G                          (word, word, word);
word H                          (word, word, word);
void StampaMessageDigest        (void);



int main (void)
{
   byte finito, BloccoFinale, t, s;

   finito = 0;
   BloccoFinale = 0;
   LunghezzaMessaggio = 0;
   IndiceStringa = 0;

   // Inizializzazione dei registri H0, H1, H2, H3, H4
   H0 = 0x67452301;
   H1 = 0xefcdab89;
   H2 = 0x98badcfe;
   H3 = 0x10325476;
   H4 = 0xc3d2e1f0;

   printf("SHA-1 - Versione 1.10 - (2003) by Alberto Leporati\n\n");
   printf("Inserisci una stringa:\n");

   // Attenzione: fgets conta anche il newline finale come carattere dato
   // in input. Allora per noi la stringa sara` terminata da un newline.
   // Nell'implementazione in assembler, invece, sara` terminata da '\0'.
   fgets(StringaInput, 256, stdin);

   while (!finito) {
      if (BloccoFinale) {
	 Pad (X, 56, 0);
         AggiungiLunghezzaMessaggio();
         finito = 1;
      }
      else {
         letti = LeggiBuffer();
         // Conta il numero di byte letti fino a questo momento
         LunghezzaMessaggio += letti;

         // Se il buffer non e` pieno fa il padding
         if (letti < 64) {
            // Primo caso: sono stati letti meno di 56 byte
            if (letti < 56) {
               Pad (X+letti, 55 - letti, 1);
               AggiungiLunghezzaMessaggio();
               finito = 1;
            }
            else {
               Pad (X+letti, 63 - letti, 1);
               // Indica che occorre ancora un blocco per finire
               BloccoFinale = 1;
            }
         }
      }

      GeneraSequenzaW();

      A = H0;
      B = H1;
      C = H2;
      D = H3;
      E = H4;

      for (t = 0; t < 80; t++) {
         // Nota: fare "and 0x0F" equivale a fare "mod 16"
         s = t & 0x0F;
         if (t >= 16) {
            W[s] = W[(s + 13) & 0x0F] ^ W[(s + 8) & 0x0F] ^
                   W[(s +  2) & 0x0F] ^ W[s];

            // Ruota W[s] verso sinistra di una posizione
            W[s] = (W[s] << 1) | (W[s] >> 31);
         }

         // Pone in temp il valore S^5(A)
         temp = (A << 5) | (A >> 27);

         temp += E + W[s];

         // Aggiunge la costante e la funzione giusta
         if (t < 20)
            temp += F(B, C, D) + 0x5a827999;
	 else if (t < 40)
            temp += G(B, C, D) + 0x6ed9eba1;
         else if (t < 60)
            temp += H(B, C, D) + 0x8f1bbcdc;
         else
            temp += G(B, C, D) + 0xca62c1d6;

         E = D;
         D = C;
         C = (B << 30) | (B >> 2);
         B = A;
         A = temp;
      }

      H0 += A;
      H1 += B;
      H2 += C;
      H3 += D;
      H4 += E;
   }

   StampaMessageDigest();

   return 0;
}


// --- LeggiBuffer ------------------------------------------------------------

byte LeggiBuffer (void)
{
   byte i;

   for (i = 0; i < 64; i++) {
      if (StringaInput[IndiceStringa] == '\n')  break;
      X[i] = StringaInput[IndiceStringa];
      IndiceStringa++;
   }
   return i;
}

// --- AggiungiLunghezzaMessaggio ---------------------------------------------

void AggiungiLunghezzaMessaggio (void)
{
   LunghezzaMessaggio <<= 3;

   X[63] = (byte) (LunghezzaMessaggio & 0xFF);
   LunghezzaMessaggio >>= 8;
   X[62] = (byte) (LunghezzaMessaggio & 0xFF);
   LunghezzaMessaggio >>=8;
   X[61] = (byte) (LunghezzaMessaggio & 0xFF);
   LunghezzaMessaggio >>=8;
   X[60] = (byte) (LunghezzaMessaggio & 0xFF);
   LunghezzaMessaggio >>=8;
   X[59] = (byte) (LunghezzaMessaggio & 0xFF);
   LunghezzaMessaggio >>=8;
   X[58] = (byte) (LunghezzaMessaggio & 0xFF);
   LunghezzaMessaggio >>=8;
   X[57] = (byte) (LunghezzaMessaggio & 0xFF);
   LunghezzaMessaggio >>=8;
   X[56] = (byte) (LunghezzaMessaggio & 0xFF);
}

// --- StampaMessageDigest ----------------------------------------------------

void StampaMessageDigest (void)
{
   printf("Message digest: ");
   printf("%08x%08x%08x%08x%08x\n", H0, H1, H2, H3, H4);
}

// --- GeneraSequenzaW --------------------------------------------------------

void GeneraSequenzaW (void)
{
   byte t;

   for (t = 0; t < 16; t++)
      W[t] = ((word) X[4*t+3]) | ((word) X[4*t+2] << 8) |
             ((word) X[4*t+1] << 16) | ((word) X[4*t] << 24);
}

// --- Pad --------------------------------------------------------------------

void Pad (byte *p, byte quanti, byte MettiUno)
{
   if (MettiUno) {
      *p = 0x80;
      p++;
   }
   
   while (quanti > 0) {
      *p = 0x00;
      p++;
      quanti--;
   }
}

// --- F ----------------------------------------------------------------------

word F (word x, word y, word z)
{
   return (x & y) | (~x & z);
}

// --- G ----------------------------------------------------------------------

word G (word x, word y, word z)
{
   return x ^ y ^ z;
}

// --- H ----------------------------------------------------------------------

word H (word x, word y, word z)
{
   return (x & y) | (x & z) | (y & z);
}

// --- Fine del sorgente ------------------------------------------------------
