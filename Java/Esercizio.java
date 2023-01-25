/* Scrivere un programma Java Composto dai seguenti metodi:
*   1) metodo VERIFICA
*      a) chiede all'utente di inserire un numero intero positivo e lo legge tramite SavitchIn
*      b) finchè il n° inserito dall'utente non è positivo, continua a ciclare chiedendo di inserire un nuovo
*        numero.
*      c) restituire come risultato il primo numero positivo inserito dall'utente.
*   2) metodo MAIN
*     a)chiama il metodo verifica e memorizza il valore restituito in una variabile N
*     b)stampa a video la somma dei primi N numeri interi
*/


class Esercizio {

   static int verifica(){    //metodo VERIFICA
     System.out.println("Inserisci un numero");  //Chiesta dell'utente  (a)
      int N=SavitchIn.readLineInt();     //Salva il n° inserito in N
        while (N<=0){
          System.out.println("Il Numero non è positivo");
          N=SavitchIn.readLineInt();
        }
        return N;
   }

public static void main (String[]args){    //metodo MAIN
  int N=verifica();
  int somma=0;    //variabile accomulatore
  int i=1;
  while (i<=N){
    somma=somma+i;
    i++;
  }
  System.out.println(somma);
}
}
