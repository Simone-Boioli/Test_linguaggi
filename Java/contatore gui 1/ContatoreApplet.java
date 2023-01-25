import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ContatoreApplet extends Applet {  
	public void init(){
		contatoreModello = new Counter(0);     
		contatoreVista = new CounterView(contatoreModello);
		setLayout(new BorderLayout()); 
		add(contatoreVista, BorderLayout.CENTER);
	}
	private Counter contatoreModello;
	private CounterView contatoreVista;
} 










