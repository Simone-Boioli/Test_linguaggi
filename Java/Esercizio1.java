/* Scrivere un programma Java composto dai seguenti metodi:
*   1)metodo CERCA:
*     a)riceve come parametri 2 numeri interi N e K
*     b)legge N valori tramite l'apposito metodo delle classe SavitchIn
*     c)restituisce come risultato il n° di valori letti uguale a k
*   2)metodo MAIN
*     a)legge 2 valori interi tramite SavitchIn
*     b)chiama il metodo cerca passando quei 2 valori come parametro
*    c)se il risultato restituito dal metodo cerca è uguale a 0, scrive "Nessuno" altrimenti scrive il numero
*        restituito dal metodo cerca
*/


class Esercizio1{
  static int cerca(int N,int K){   //intestazione metodo CERCA
   int risultato=0;
   int valore=0;
   int i=1;
   while (i<=N){ valore=SavitchIn.readLineInt();
     if (valore==k)risultato++;
     i++;
   }
   return risultato;
  }

public static void main(String[]args){
  int N=SavitchIn.readLineInt();
  int K=SavitchIn.readLineInt();
  int R=cerca(N,K);
  if(R==0){
    SavitchIn.readLineInt("Nessuno");
  }
  else {
    SavitchIn.readLineInt(R);
  }
}
}