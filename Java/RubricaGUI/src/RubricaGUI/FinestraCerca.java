package RubricaGUI;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import RubricaGUI.FinestraPrincipale.AscoltatoreFinestra;

public class FinestraCerca extends Frame{
	Label titolo;
	public FinestraCerca(){
		pack();
		setVisible(true);
		setBounds(300,300,50,50);
		
		titolo = new Label("CERCA UTENTE");
		
		add(titolo, BorderLayout.NORTH);
		addWindowListener(new AscoltatoreFinestra());
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
