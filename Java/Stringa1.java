/* Scrivere un programma che :
   - Assegna un valore ad una variabile s di tipo String
   -Stampa a video la stringa s letta da destra a sinistra
   Esempio: s=ciao   stampa oaic
*/

class Stringa1{
  public static void main (String[]args){

   System.out.println("Inserisci una stringa: ");
   String s=SavitchIn.readLine();
   String t="";   // Dichiara la stringa vuota
   for(int i=s.length()-1;i>=0;i--){
      t=t+s.charAt(i);          //il + concatena 2 sringhe
   }
   System.out.println(t);
  }
}