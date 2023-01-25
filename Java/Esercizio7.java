/*Scrivere un programma Java composto dai seguenti metodi:


-Metodo trovaVocali Riceve come parametro una stringa s e restituisce una stringa che contiene
tutte le vocali in s nello stesso ordine in cui appaiono in s. Ad esempio se s e' "ciao", deve essere restituita
la stringa "iao". Se s e' "catena", deve essere restituita la stringa "aea". Se s e' "CDL" deve essere restituita
la stringa vuota, dato che s non contiene vocali.


- Metodo piuLunga Riceve in parametro due stringhe a e b e restituisce un valore booleano. 
Il valore restituito deve essere true se a e' piu' lunga di b (cioe'composta da un numero maggiore di 
caratteri) o se a e b sono della stessa lunghezza e false altrimenti.


- Metodo main Legge due stringhe s e t con l'apposito metodo della classe Scanner e stampa a video 
la stringa che contiene piu' vocali, chiamando i metodi trovaVocali e piuLunga.


import java.util.*;

public class Esercizio7{
		public static void main(String[]args){
			Scanner string = new Scanner (System.in);
			System.out.println("Inserisci una stringa");
			String s= string.next();
			System.out.println("Inserisci una stringa");
			String t = string.next();
			System.out.println("La stringa piu' lunga e':");
			if(piuLunga(trovaVocali(s),trovaVocali(t))){
					System.out.println(s);
			}else
					System.out.println(t);
		}
		
		public static boolean piuLunga(String s, String t){
			return(s.length()>=t.length());
			}
		
		public static String trovaVocali(String s){
			String v="";	
			for(int i=0; i<s.length();i++){
						if((s.charAt(i)=='a')||
						    (s.charAt(i)=='e')||
						    (s.charAt(i)=='i')||
						    (s.charAt(i)=='o')||
						    (s.charAt(i)=='i'))
							v=v+s.charAt(i);
	
			}
			return v;
		}
}
*/

public class Esercizio {
   public static String trovaVocali(String s) {
      String res = "";
      for (int i = 0; i < s.length(); i++) {
         if ( (s.charAt(i) == 'a') ||
              (s.charAt(i) == 'e') ||
              (s.charAt(i) == 'i') ||
              (s.charAt(i) == 'o') ||
              (s.charAt(i) == 'u') ) {
                 res = res + s.charAt(i);
        }
      return res;
   }
   public static boolean piuLunga (String a, String b) {
      return (a.length() >= b.length());
   }
   public static void main (String[] args) {
      System.out.println("Inserisci la prima stringa");
      String s = SavitchIn.readLine();
      System.out.println("Inserisci la seconda stringa");
      String t = SavitchIn.readLine();
      System.out.print("La stringa che contiene più vocali è: ");
      if (piuLunga(trovaVocali(s), trovaVocali(t)) {
          System.out.println(s);
      }
      else {
         System.out.println(t);
      }
   }
}
}