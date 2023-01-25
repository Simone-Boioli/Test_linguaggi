import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ascoltatore implements ActionListener{

	JTextField field;
	JTextField field1;
	JTextField field2;
	JTextField field3;
	JTextField field4;
	JTextField field5;
	JTextField field6;
	JTextField field7;
	JTextField field8;
	JTextField field9;
	JTextField field10;
	JTextField field11;
	JTextField field12;
	
	
	Ascoltatore(){
		
	}
	/*Ascoltatore(JTextField field, JTextField field1){
		this.field = field;
		this.field1 = field1;
		
	}
	*/
	Ascoltatore(JTextField field2, JTextField field3){
		this.field2 = field2;
		this.field3 = field3;
	}
	Ascoltatore(JTextField field4, JTextField field5, JTextField field6, JTextField field7, 
			    JTextField field8, JTextField field9, JTextField field10, JTextField field11,
			    JTextField field12){
		this.field4 = field4;
		this.field5 = field5;
		this.field6 = field6;
		this.field7 = field7;
		this.field8 = field8;
		this.field9 = field9;
		this.field10 = field10;
		this.field11 = field11;
		this.field12 = field12;
		
	}
	
	public void actionPerformed(ActionEvent e){
		Rubrica.cercaUtente(field2.getText(), field3.getText());
		//Rubrica.eliminaUtente(field2.getText(), field3.getText());
		
		/*Rubrica.inserisciUtente(field4.getText(), field5.getText(), field6.getText(), field7.getText(),
				               field8.getText(), field9.getText(), field10.getText(), field11.getText(),
				               field12.getText());
		*/
	}
}
