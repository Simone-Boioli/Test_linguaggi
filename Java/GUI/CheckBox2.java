import java.awt.*;
import java.awt.event.*;

public class CheckBox2 extends Frame{
	Button chiudi=new Button("Chiudi Applicazione");

	Checkbox i1=new Checkbox("primi 3");
	Checkbox i2=new Checkbox("secondi 4");
	Checkbox ii1=new Checkbox("uno");
	Checkbox ii2=new Checkbox("due");
	Checkbox ii3=new Checkbox("tre");
	Checkbox ii4=new Checkbox("quattro");
	Checkbox ii5=new Checkbox("cinque");
	Checkbox ii6=new Checkbox("sei");
	Checkbox ii7=new Checkbox("sette");
	
	public CheckBox2(){
		chiudi.addActionListener(new Ascoltatore());
		Panel p1=new Panel();
		Panel p2=new Panel();
		
		p1.add(ii1);
		p1.add(ii2);
		p1.add(ii3);
		p1.add(ii4);
		p1.add(ii5);
		p1.add(ii6);
		p1.add(ii7);
		
		ii1.addItemListener(new AItem1());
		ii2.addItemListener(new AItem1());
		ii3.addItemListener(new AItem1());
		ii4.addItemListener(new AItem1());
		ii5.addItemListener(new AItem1());
		ii6.addItemListener(new AItem1());
		ii7.addItemListener(new AItem1());
		i1.addItemListener(new AItem2());
		i2.addItemListener(new AItem2());
		
		add(p1,BorderLayout.NORTH);

		p2.add(i1);
		p2.add(i2);
		
		add(p2,BorderLayout.CENTER);
		add(chiudi,BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	public static void main (String [] arg){
		new CheckBox2();
	}

	public class Ascoltatore implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.exit(0);
		}
	}			

	public class AItem1 implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			i1.setState(ii1.getState()&&ii2.getState()&&ii3.getState());
			i2.setState(ii4.getState()&&ii5.getState()&&ii6.getState()&&ii7.getState());
		}
	}
	
	public class AItem2 implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			ii1.setState(i1.getState());
			ii2.setState(i1.getState());
			ii3.setState(i1.getState());
			ii4.setState(i2.getState());
			ii5.setState(i2.getState());
			ii6.setState(i2.getState());
			ii7.setState(i2.getState());
		}
	}
}