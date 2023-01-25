//Leggere un numero e dire se è pari o dispari

public class PariDispari{
  public static void main (String[]args){
   
   System.out.println("Inserisci un numero intero: ");
   int num=SavitchIn.readLineInt();
   
   if (num%2==0)
       System.out.println("In numero e' pari");
   else
       System.out.println("Il numero e' dispari");


  }
}