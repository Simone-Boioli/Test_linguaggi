/* Scrivere un programma che:
*   -assegna un valore letto tramite savitchin ad una variabile int x
*   -assegna un valore letto tramite savitchin ad una cariabile int y
*   -stampa a video il valore si x^y moltiplicano x per se stesso y volte
*/


class Potenza{
  public static void main(String[]args){
    int x=SavitchIn.readLineInt();
    int y=SavitchIn.readLineInt();
    int prodotto=1;
    for(int i=1;i<=y;i++){
      prodotto=prodotto*x;
    }
    System.out.println(prodotto);
  }
}