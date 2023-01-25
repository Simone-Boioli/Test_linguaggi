import java.awt.*;
import java.awt.event.*;

public class liste extends Frame{
	List lista=new List(0,true);
	Label text=new Label("Bellezze che possono essere visitate nella località scelta");
	
	public liste(){
		super("Scelta itinerario");

		lista.add("Benevento");
		lista.add("Foiano di Val Fortore");
		lista.add("Baselice");
		lista.add("San Bartolomeo in Galdo");
		lista.add("San Marco dei Cavoti");
		lista.add("Montefalcone in Val Fortore");
		lista.add("Pesco Sannita");
		lista.add("Colle Sannita");
		lista.add("Castelvetere in Val Fortore");
		lista.add("Castelfranco in Miscano");
		lista.add("Ginestra degli Schiavoni");
		lista.add("San Giorgio la Molara");
		lista.add("Molinara");
		lista.add("Pietrelcina");
		lista.add("Fragneto Monforte");
		lista.add("Circello");
		lista.add("Campolattaro");
		
		add(lista,BorderLayout.CENTER);
		add(text,BorderLayout.SOUTH);
		addWindowListener(new listeWindowListener());
		lista.addItemListener(new ascoltaLista());

		setSize(350,100);
		setResizable(false);
		show();
	}
	
	public static void main(String [] arg){
		new liste();
	}
	
	class listeWindowListener implements WindowListener{
		public void windowActivated(WindowEvent e){}
		public void windowClosed(WindowEvent e){}
		public void windowClosing(WindowEvent e){
			String[] s=lista.getSelectedItems();
			int i=0;
			System.out.println("Itinerario selezionato");
			try{
				while (true){
					System.out.println(s[i++]);
				}
			}catch (ArrayIndexOutOfBoundsException er){
				System.out.println("Buon divertimento...");
			}
			System.exit(0);
		}
		public void windowDeactivated(WindowEvent e){}
		public void windowDeiconified(WindowEvent e){}
		public void windowIconified(WindowEvent e){}
		public void windowOpened(WindowEvent e){}
	}
	
	class ascoltaLista implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			int indice=((Integer) e.getItem()).intValue();
			if (indice==0) text.setText("Rocca dei Rettori, arco di traiano, anfiteatro Romano, città spettacolo");
			if (indice==1) text.setText("località San Giovanni, Campanile, via Roma, lago, festa S.Giovanni, festa dell'emigrante");
			if (indice==2) text.setText("oasi di San Leonardo");
			if (indice==3) text.setText("centro storico");
			if (indice==4) text.setText("centro storico");
			if (indice==5) text.setText("centro storico");
			if (indice==6) text.setText("centro storico");
			if (indice==7) text.setText("centro storico");
			if (indice==8) text.setText("centro storico");
			if (indice==9) text.setText("Bosco");
			if (indice==10) text.setText("centro storico");
			if (indice==11) text.setText("Lago di San Giorgio");
			if (indice==12) text.setText("centro storico");
			if (indice==13) text.setText("Piana Romana, centro storico, case di Padre Pio");
			if (indice==14) text.setText("Raduno internazionale di mongolfiere, palazzo Ducale");
			if (indice==15) text.setText("centro storico");
			if (indice==16) text.setText("Diga di Campolattaro");
		}
	}
} 