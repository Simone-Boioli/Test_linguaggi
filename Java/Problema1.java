/*Un supermercato assegna ai suoi clienti 3 punti ogni 15 euro di spesa a partire da un minimo di 60 euro
*  di spesa. Calcolare i punti totalizzatida un cliente conoscendo la spesa e i punti che aveva prima della spesa
*/

public class Problema1{
 public static void main(String[]args){
   System.out.println("Il costo della spesa e'di: ");
   double costo=SavitchIn.readLineDouble();

   System.out.println("I punti che aveva in precedenza sono: ");
   int suoiPunti=SavitchIn.readLineInt();

   int punti=3;
   int minSpesa=60;
   int soldi=15;

   int totPunti=0;

   if(costo>minSpesa){

     totPunti=(int)(costo/soldi);
     System.out.println("Il totale dei punti di oggi sono: "+totPunti);
   }
   else System.out.println ("La spesa è minore di quella per aumentare i propri numeri.");

   double totalePunti=suoiPunti+totPunti;
   System.out.println("Il totale dei punti e' di: "+totalePunti+"punti");

 }
}