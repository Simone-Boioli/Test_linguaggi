//Calcolare l'area e il perimetro di un rettangolo dati i lati

public class Esercizio3 {
  public static void main (String[]args){
  
  System.out.println("Inserisci la base del rettangolo: ");
  int base=SavitchIn.readLineInt();

  System.out.println("Inserisci l'altezza del rettangono: ");
  int altezza=SavitchIn.readLineInt();
  
  int area=base*altezza;
  int perimetro=(base*2)+(altezza*2);

  System.out.println("L'area del rettangolo e': "+area);
  System.out.println("Il perimetro del rettangolo e': "+perimetro);


  }
}