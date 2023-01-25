/* Scrivere un programma che:
   1)Assega un valore ad una variabile intera x con SavitchIn,
   2)Assegna un valore ad una variabile intera n con SavitchIn,
   3)Calcola e stampa in video il valore dell'espressione:
         1+x+((x^2)/2)+((x^3)/3)+....((x^n)/n)

*/

public class Potenza1{
 public static void main(String[]args){

  int x=SavitchIn.readLineInt();
  int n=SavitchIn.readLineInt();

  int somma=1;

  for(int i=1; i<=n; i++){
    somma=somma+(int)(Math.pow(x,i)/i);      //Math pow è la libreria per la potenza e resitituisce una valore double che noi castizziamo a int
  }
 System.out.println(somma);
 }
}