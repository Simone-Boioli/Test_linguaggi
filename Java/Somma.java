public class Somma {
  public static void main (String[]args){

    System.out.println ("Inserisci il primo numero: ");
    int a=SavitchIn.readLineInt();
    System.out.println ("Inserisci il secondo numero: ");
    int b=SavitchIn.readLineInt();

    int espressione= (a+b);

    System.out.println ("La somma e' di: "+espressione);
  }
}