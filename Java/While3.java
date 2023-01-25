/*Scrivere un programma Java composto dai seguenti metodi:

    * Metodo pari: riceve come parametro un numero intero e restituisce un booleano che vale 
      vero se esso e' pari e false altrimenti.
    * Metodo main: legge una sequenza di numeri interi tramite l'apposito metodo della classe SavitchIn 
      e, per ognuno di essi scrive se e' pari o dispari usando il metodo pari. Si supponga che la sequenza  
      termini quando viene letto il numero -1. 
*/

public class While3 {

    public static void main (String[] args) {
        System.out.println("Scrivi un numero (-1 per terminare)");
        int k = SavitchIn.readLineInt();
        while (k != -1) {
        if (pari(k)) System.out.println("numero pari");
        else System.out.println("numero dispari");
        k = SavitchIn.readLineInt();
        }
    }
    
	static boolean pari (int N) {
        return ( N % 2 == 0);
       }
}