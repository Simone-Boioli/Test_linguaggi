import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("unused")  //per togliere il warning
class AscoltatoreBottone implements ActionListener{
	
	Finestra fin;
	
	AscoltatoreBottone(){
	}
	
	
	public void actionPerformed(ActionEvent e){	//metodo che viene azionato dopo aver premuto il bottone
		try{
			Client.mandaMail("out.virgilio.it",25,fin.from.getText(),fin.to.getText(),fin.subject.getText(),fin.body.getText());
			
			}
		catch(Exception a){
			System.out.println(a);
		}
	}
}