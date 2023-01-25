import java.awt.*;
import java.awt.event.*;


public class Finestra extends Frame{
	Label l1;
	Label l2;
	Label l3; // provvisorio
	Button b1;
	int crediti = 0;
	
	public Finestra(){
		super("Slot Machine");
		setSize(500,500);
		setVisible(true);
		setLayout(new GridLayout(4,1));
		
		l1 = new Label("Slot-Machine");
		add(l1);
		
		l2 = new Label("Provvisorio");
		add(l2);
		
		b1 = new Button("Gioca");
		add(b1);
		b1.addActionListener(new AscoltatoreBottone());
		
		l3 = new Label(crediti + " crediti");
		add(l3);
		
		addWindowListener(new AscoltatoreFinestra());
	}
	
}

 class AscoltatoreFinestra implements WindowListener{

	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(-1);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

 class AscoltatoreBottone implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}


