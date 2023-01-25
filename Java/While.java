/*Scrivere un programma che legge una sequenza di numeri interi tramite l'apposito metodo della classe SavitchIn.
  Il programma deve contare quante volte, in questa sequenza, è contenuto il numero 10 e stampare questa informazione
  a video.
  Si supponga che la sequenza termini quando viene letto il numero 0.
*/


public class While{
       public static void main(String[]args){
              
              int cont=0;
              int n=1;

              while(n!=0){
                    System.out.println("Inserisci il numero:");
                    n=SavitchIn.readLineInt();
                    
                    if(n==10){
                              cont++;
                    }
              }
              
              System.out.println(cont);
       }
}