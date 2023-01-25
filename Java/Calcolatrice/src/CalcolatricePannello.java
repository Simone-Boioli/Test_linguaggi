/**
 * Pannello pulsanti della finestra
 */

import javax.swing.*; //libreria GUI
import java.awt.*; //libreria eventi
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcolatricePannello extends JPanel{ 
	private JButton[] bottoni = {  //array di bottoni
			new JButton("1"),
			new JButton("2"),
			new JButton("3"),
			new JButton("4"),
			new JButton("5"),
			new JButton("6"),
			new JButton("7"),
			new JButton("8"),
			new JButton("9"),
			new JButton("0"),
			new JButton("."),
			new JButton("+"),
			new JButton("-"),
			new JButton("/"),
			new JButton("*"),
			new JButton("=")
	};
	private CalcolatriceFinestra mainFrame;  
	
	//costruttore
	public CalcolatricePannello(CalcolatriceFinestra calcFin){
		mainFrame = calcFin; // prendo la finestra principale
		setLayout(new GridLayout(4,4));  //creo na griglia 4x4
		BottoniListener listenerBottoni = new BottoniListener();  //oggetto per ricevere gli eventi(pressione dei bottoni)
		for(int i = 0; i < bottoni.length; ++i){ //for che inserisce i bottoni nella griglia
			bottoni[i].setBackground(Color.WHITE); //imposto il colore di fondo del bottone
			add(bottoni[i]); //aggiunge il bottone
			bottoni[i].addActionListener(listenerBottoni);
		}
	}
	
	
	//inner class di ascoltatore
	private class BottoniListener implements ActionListener {
		
		public void actionPerformed(ActionEvent ev) {
			JButton pressed = (JButton)ev.getSource(); //inserisco in un bottone l'evento che si è verificato(clic del mouse)
			char c = pressed.getText().charAt(0); // inserisco in c il valore del tast premuto
			if((c >= '0') && (c <= '9')){   //se c è un numero
				mainFrame.inserisciCifra(c); //chiamo la funzione di calcolo (CalcolatriceFinestra)
			
			}else if(c == '.'){  //se c è il punto
				mainFrame.inserisciPunto();  //chiamo la funzione insersici punto
			}else{   //se c è un operatore
				mainFrame.inserisciOperatore(c); //chiamo la funzione che inserisce l'operatore
			}
			
		}

		
	}
}



