import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Ascoltatore implements ActionListener{
	JTextField field1;
	JTextField field2;
	Finestra finestra;
	
	public Ascoltatore(){
		
	}
	public Ascoltatore(JTextField field1, JTextField field2){
		this.field1 = field1;
		this.field2 = field2;
	}
	
	public void actionPerformed(ActionEvent e){
		long mcd = MCD.calcoloMCD(Long.parseLong(field1.getText()), Long.parseLong(field2.getText()));
		Finestra fin = new Finestra();
		fin.addMCD(mcd);
		
		long mincm = mcm.calcolaMcm(Long.parseLong(field1.getText()), Long.parseLong(field2.getText()));
		fin.addMcm(mincm);
	}
}
