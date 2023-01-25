package RubricaGUI;
/**
 * Finestra principale con i 3 bottoni per inserire, cercare e elimanre un contatto
 */
import java.awt.*;
import java.awt.event.*;

public class FinestraPrincipale extends Frame {
	Button cerca;
	Button insert;
	Button delete;
	/**
	 * Costruttore che "costruisce" la finestra principale
	 */
	public FinestraPrincipale(){
	
		cerca = new Button("Cerca Contatto");
		insert = new Button("Inserisci Contatto");
		delete = new Button("Elimina Contatto");
		
		cerca.addActionListener(new Ascoltatore1());
		insert.addActionListener(new Ascoltatore2());
		delete.addActionListener(new Ascoltatore3());
		
		setLayout(new FlowLayout());
		add(cerca);
		add(insert);
		add(delete);
		addWindowListener(new AscoltatoreFinestra());
		
		
		this.setBounds(400, 400, 300, 400);
		this.setTitle("Rubrica");
		this.pack();
		this.setVisible(true);
	}	
	/**
	 *Ascoltatore del bottone per cercare un'utente
	 */
	public class Ascoltatore1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new FinestraCerca();
		}
	}
	/**
	 *Ascoltatore del bottone per inserire un'utente
	 */
	public class Ascoltatore2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new FinestraInserisci();
		}
	}
	/**
	 *Ascoltatore del bottone per eliminare un'utente
	 */
	public class Ascoltatore3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new FinestraCancella();
		}
	}
	/**
	 *	Ascoltatore della finestra
	 */
	public class AscoltatoreFinestra implements WindowListener{
		public void windowActivated(WindowEvent arg0) {
		}
		public void windowClosed(WindowEvent arg0) {
		}
		public void windowClosing(WindowEvent arg0) {
			System.exit(0);
		}
		public void windowDeactivated(WindowEvent arg0) {
		}
		public void windowDeiconified(WindowEvent arg0) {	
		}
		public void windowIconified(WindowEvent arg0) {
		}
		public void windowOpened(WindowEvent arg0) {
		}
		
	}
	
	
	
	
}
