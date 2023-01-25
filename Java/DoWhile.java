/*Scrivere un programma Java che:

Scrivere un programma Java che:

    * legge una sequenza non vuota di numeri naturali non negativi, scritti uno per riga su input standard, e terminata dal numero 0, usando il metodo opportuno della classe SavitchIn,
    * assegna valore true ad una variabile booleana b se tutti i numeri della sequenza (tranne 0) sono dispari, altrimenti assegna false a b,
    * scrive su output standard il valore della variabile b.  
*/

public class WhileDoWhileEsercizio1 {

  public static void main(String[] args) {
    // Variabile per memorizzare ciascun numero della sequenza
    int num;
    // Variabile che memorizza se i numeri
    // finora letti sono tutti dispari
    boolean b= true;

    do {
      // Legge un numero intero da standard input finche' non
      // trova un numero non negativo
      do {
        num= SavitchIn.readInt();
      } while (num<0);
      // Se il numero e' pari ed e' diverso da zero allora
      // la sequenza contiene un numero non dispari e la variabile
      // b deve essere assegnata a false
      if (num!=0 && num%2==0) {
        b= false;
      }
      /* Una soluzione alternativa prevedeva l'istruzione
       * b= b && ((num==0) || (num%2==1));
       * al posto del costrutto if
       **/
      // Esce quando legge il numero 0
    } while (num!=0);

    // Stampa il risultato
    System.out.println(b);

  }

}
