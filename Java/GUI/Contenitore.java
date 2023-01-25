import java.awt.*;

public class Contenitore extends Frame{
	Label l1 = new Label("lab1");
	Label l2 = new Label("lab2");
	Label l3 = new Label("lab3");
	
	public Contenitore(){
		add(l1);
		add(l2);
		add(l3);
		
		doLayout();
		pack();
		setVisible(true);
	}
	
	public static void main(String [] args){
		new Contenitore();
	}
}