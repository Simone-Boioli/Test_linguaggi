/* Scrivere un programma che:
    1.assegna un valore ad una variabile intera n con il comando savitchIn
    2.calcolare e stampa a video il fattoriale
*/

class Fattoriale{
 public static void main(String[]args){

  System.out.println("Scrivi un numero: ");
  int N=SavitchIn.readLineInt();

  while(N<=0){                                               //
    System.out.println("Il numero non è maggiore di 0");      //  In caso l'utente metta un valore non > di 0
    N=SavitchIn.readLineInt();                               //
  }

  int fattoriale=1;

  for (;N>=1;N=N-1){                //   ciclo che sviluppa il fattoriale
    fattoriale=fattoriale*N;        //
  }

  System.out.println(fattoriale);
 }
}