package RubricaGUI;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import RubricaGUI.FinestraCerca.AscoltatoreFinestra;

public class FinestraCancella extends Frame{
	Label titolo;
	
	public FinestraCancella(){
		pack();
		setVisible(true);
		setBounds(300,300,400,400);
		
		titolo = new Label("ELIMINA UTENTE");
		
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
