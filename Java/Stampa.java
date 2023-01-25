/* Scrivere un programma Java che legge un numero intero n
tramite l'apposito metodo della classe SavitchIn e stampa n volte "Ciao" */

class Stampa {
  public static void main(String[]args){
    System.out.println("Scrivi un numero");
     int n=SavitchIn.readLineInt();

     int i=1;
     while (i<=n) {System.out.println("Ciao");
                     i++;}
  }
}