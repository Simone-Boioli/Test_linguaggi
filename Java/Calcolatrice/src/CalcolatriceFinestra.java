/**
 * Finestra con i pulsanti e il display
 */

import javax.swing.*; //libreria GUI
import java.awt.*; //libreria eventi

public class CalcolatriceFinestra extends JFrame {  //useremo la classe JFrame
	private JTextField display; // campo testo per il display
	private CalcolatricePannello bottoniera; // tasti della calcolatrice
	
	private double operandoCorrente = 0.0; //tiene traccia del numero che stiamo trattando
	private char operatoreCorrente = '?'; //tiene traccia dell'operatore cliccato
	private boolean resetDisplay = true; // per vedere se il display è stato resettato
	
	public CalcolatriceFinestra(String titolo){
		super(titolo);  // inserisco un  titolo alla finestra
		display = new JTextField();  //creo il display
		bottoniera = new CalcolatricePannello(this);  //creo la parte dei tasti
		
		add(display, BorderLayout.NORTH);   //aggiungo alla finestra il display in alto
		add(bottoniera, BorderLayout.CENTER); //aggiungo i tast alla finestra in centro
		
		display.setEditable(false); //l'utente non può scrivere all'interno
		display.setFont(new Font("SansSerif", Font.ITALIC, 22)); //formato caratteri sul display
		display.setHorizontalAlignment(JTextField.RIGHT); //allineamento caratteri
		display.setBackground(Color.LIGHT_GRAY); //colore sfondo
		display.setSize(300, 50);
	}
	
	/**
	 *  metodo inserisci cifra, che per prima cosa verifica se il display è vuoto
	 */
	public void inserisciCifra(char c){
		display.setText(""+c);
		/*
		if(resetDisplay){ //guardo se il display è vuoto
			display.setText(" "); //insersico sul diplay uno spazio vuoto
			resetDisplay = false;  //display occupato
		}
		display.setText(display.getText() + c);  //scrivo sul diplay la cifra
		*/
	}
	
	
	/**
	 *  metodo inserisci punto
	 */
	public void inserisciPunto(){
		if(resetDisplay){ //guardo se il display è vuoto
			display.setText(" "); //insersico sul diplay uno spazio vuoto
			resetDisplay = false;  //display occupato
		}
		display.setText(display.getText() + '.');  //scrivo sul display il punto
	}
	
	/**
	 *  metodo insersici operatore, che distingue i diversi operatori
	 */
	public void inserisciOperatore(char c){
		if(c == '='){  // se premo uguale
			display.setText(" = ");
			/*
			double operando = Double.parseDouble(display.getText()); //inserisco in operando il valore
			double risultato = calcolaRisultato (operandoCorrente, operando, operatoreCorrente); //calcolo il risultato
			display.setText(String.valueOf(risultato));  // scrivo sul display il risulato
			operatoreCorrente = '?'; //cancello l'operatore corrente
			resetDisplay = true;  // cancello il display
			*/
		}else{  //gestisco l'operatore
			if(operatoreCorrente == '?'){  // se non c'è nessun operatore
				operandoCorrente = Double.parseDouble(display.getText()); //prendo il valore
			}else{
				double operando = Double.parseDouble(display.getText());
				operandoCorrente = calcolaRisultato(operandoCorrente, operando, operatoreCorrente);
				display.setText(String.valueOf(operandoCorrente));
			}
		}
		operandoCorrente = c;
		resetDisplay = true;
	}

	private double calcolaRisultato(double op1, double op2,	char oper) {
		switch (oper){
			case '+' :
				return (op1+op2);
			case '-' :
				return (op1-op2);
			case '*' :
				return (op1*op2);
			case '/' :
				return (op1/op2);
			default :
				return 0.0;
		}
	}
}
