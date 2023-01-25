import java.awt.*;
import java.awt.event.*;


public class CounterControl implements ActionListener {
	private Counter contatore;
	private CounterInterfaceView contatoreVista;
	public CounterControl(Counter cont, CounterInterfaceView contVista){   
		contatore = cont;
		contatoreVista = contVista;
	}
	public void actionPerformed(ActionEvent e){  
		Button source = (Button)e.getSource();   // il cast !!
		if (source.getLabel().equals("Decrementa")) contatore.decr();       
		else if (source.getLabel().equals("Incrementa")) contatore.incr();
		else contatore.init(0);        
		contatoreVista.updateView();
	}
}






























