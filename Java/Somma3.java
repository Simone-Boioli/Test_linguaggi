/* Scrivere un programma java che legge una serie di numeri interi tramite l'apposito metodo della classe
   savithIn, e ne stampa a video la somma.
   Si supponga che la serie termini quando viene letto il numero 0. */

public class Somma3 {
  public static void main (String arg []){
  
  int n=SavitchIn.readLineInt();
  int somma=0;
   while(n!=0){
         somma=somma+n;
         n=SavitchIn.readLineInt();
   }
   System.out.println(somma);
 }
}