/* Scrivere un programma java che:
*   1) legge un numero intero positivo n tramite savitchin (finchè il n° scritto dall'utente non è postivo
*      continua a chiedere un n° positivo a leggere un nuovo numero)
*   2) legge n numeri double tramite savitchin e ne stampa a video la somma
*/

class Esercizio2{
  public static void main(String[]args){

    System.out.println("SCrivi un n°positivo");
    int N=SavitchIn.readLineInt();
    while(N<=0){
      System.out.println("Il numero non è positivo");
      N=SavitchIn.readLineInt();
    }

    double somma=0,0;
    double valore=0,0;
    for(int i=1;i<=0;i++){
      valore=SavitchIn.readLineDouble();
      somma=somma+valore;
    }
    System.out.println(somma);
  }
}
