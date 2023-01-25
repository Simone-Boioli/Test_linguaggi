import java.awt.*;
import java.awt.event.*;

public class NClick extends Frame{
	Button cliccami = new Button("Cliccami");
	Label cliccato = new Label ("Non mi hai mai cliccato");
	
	public NClick(){
		cliccami.addActionListener(new Ascoltatore());
		cliccami.setActionCommand("CLICK");
		
		add(cliccami, BorderLayout.NORTH);
		add(cliccato, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
		setSize(600, 100);
		setLocation(300, 300);
	}	
	
	public static void main(String []args){
		new NClick();
	}	
	
	//ascoltatore
	int volte = 2;
	public class Ascoltatore implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String comando = e.getActionCommand();
			if(comando.compareTo("CLICK") == 0){
				cliccato.setText("Mi hai cliccato");
				cliccami.setLabel("Ricliccami");
				cliccami.setActionCommand("RECLICK");
			}
			if(volte == 50){
				cliccato.setText("HAI ROTTO!!!!!");
				System.exit(-1);
			}
			
			if(comando.compareTo("RECLICK") == 0){
				cliccato.setText("Mi hai cliccato " + volte + " volte");
				volte ++;
			}
		}
	}
	
}