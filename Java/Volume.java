//Calcolare il volume di un parallelpipedo note le lunghezze dei 3 spigoli.

public class Volume{
 public static void main(String[]args){
  
  System.out.println("Inserisci la larghezza del parallelpipedo: ");
  int larghezza=SavitchIn.readLineInt();
  
  System.out.println("Inserisci la lunghezza del parallelpipedo: ");
  int lunghezza=SavitchIn.readLineInt();
  
  System.out.println("Inserisci l'altezza del parallelpipedo: ");
  int altezza=SavitchIn.readLineInt();

  int volume=larghezza*lunghezza*altezza;

  System.out.println("Il volume del parallelpipedo e' di: "+volume+"cm2");
 }
}