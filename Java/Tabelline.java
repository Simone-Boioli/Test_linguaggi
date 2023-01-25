/*Stampare tutte le tabelline di tutti i numeri da 1 a k, con k numero intero maggiore di 1 letto con l'apposito
 metodo della classe SavitchIn*/

 public class Tabelline {
   public static void main (String args[]) {
     
     int k= SavitchIn.readLineInt();
     int i=1;
     while (i<=k) {
           int j=1;
           while (j<=10){
           System.out.println(i+"*"+j+"="+(i*j));
           j++;
           }
     i++;
     }
   }
 }