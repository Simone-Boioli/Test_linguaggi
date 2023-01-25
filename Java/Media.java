/* Scrivere un programma java che legge una serie di numeri interi tramite l'apposito metodo della classe
   savithIn, e ne stampa a video la media.
   Si supponga che la serie termini quando viene letto il numero 0. */

public class Media {
  public static void main (String arg []){

  int n= SavitchIn.readLineInt();
  int somma=0; int k=1;
   while(n!=0){                     // Quando si inserisce 0 esce dal ciclo
         somma=somma+n;
         n=SavitchIn.readLineInt();
         if (n!=0) k++;
   }
   System.out.println((double)somma/k);
 }
}