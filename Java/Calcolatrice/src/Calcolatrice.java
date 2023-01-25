import javax.swing.*; //libreria GUI
import java.awt.*; //libreria eventi

public class Calcolatrice{
	public static void main(String[] args){
		CalcolatriceFinestra calcolatriceFinestra = new CalcolatriceFinestra("Calcolatrice"); //creo una nuova finestra con titolo "Calcolatrice"
		calcolatriceFinestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // chiude la finestra premendo X
		calcolatriceFinestra.setSize(300,300); // dimensioni finestra
		calcolatriceFinestra.setVisible(true); //finestra visibile
	}
}