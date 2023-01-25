/*Scrivere un programma Java che legge una stringa s con l'apposito metodo della classe SavitchIn e 
stampa a video un'altra stringa uguale a s ad eccezione del fatto che la stringa stampata deve avere il 
carattere 'b' al posto del carattere 'a'.

Esempio

Se la stringa s letta con la SavitchIn è "banana", occorrerà stampare "bbnbnb".

Se la stringa s letta con la SavitchIn è "mare", occorrerà stampare "mbre".

Se la stringa s letta con la SavitchIn è "miele", occorrerà stampare "miele" (
cioè se la stringa s non contiene caratteri uguali ad 'a', verrà stampata senza modifiche).
*/

class Stringa5{
      public static void main (String[]args){

      System.out.println("Inserisci una stringa:");
      String s=SavitchIn.readLine();
      String t="";

      for(int i=0;i<s.length();i++){
               if(s.charAt(i)=='a'){
                    t=t+'b';
               }else{
                     t=t+s.charAt(i);
               }
      }

       System.out.println(t);
      }
}






