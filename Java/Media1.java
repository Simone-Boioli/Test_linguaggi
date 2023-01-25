// Eseguire la media di 5 voti inseriti dall'utente

public class Media1{
  public static void main(String[]args){
    System.out.println("Inserisci il primo voto:");
    double a=SavitchIn.readLineDouble();

    System.out.println("Inserisci il secondo voto:");
    double b=SavitchIn.readLineDouble();

    System.out.println("Inserisci il terzo voto:");
    double c=SavitchIn.readLineDouble();

    System.out.println("Inserisci il quarto voto:");
    double d=SavitchIn.readLineDouble();

    System.out.println("Inserisci il quinto voto:");
    double e=SavitchIn.readLineDouble();

    double media=(a+b+c+d+e)/5;
    System.out.println("La media e':"+media);
  }
}