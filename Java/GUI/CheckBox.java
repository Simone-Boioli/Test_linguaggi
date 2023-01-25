import java.awt.*;
import java.awt.event.*;

public class CheckBox extends Frame{
	Label r = new Label ("Reddito annuo");
	Label i = new Label ("Interessi");
	
	Button chiudi = new Button("Chiudi Applicazione");
	
	CheckboxGroup reddito = new CheckboxGroup();
	
	Checkbox r1 = new Checkbox("Da 0 a 10");
	Checkbox r2 = new Checkbox("Da 11 a 30");
	Checkbox r3 = new Checkbox("Da 31 a 70");
	Checkbox r4 = new Checkbox("Da 71 a 100");
	Checkbox r5 = new Checkbox("Da 101 a 200");
	Checkbox r6 = new Checkbox("Da 201 a 500");
	Checkbox r7 = new Checkbox("Sono ricco sfondato");
	
	Checkbox i1 = new Checkbox("Sport");
	Checkbox i2 = new Checkbox("Informatica");
	Checkbox i3 = new Checkbox("Lettura");
	Checkbox i4 = new Checkbox("Cinema");
	Checkbox i5 = new Checkbox("Animali");
	Checkbox i6 = new Checkbox("Fumetti");
	Checkbox i7 = new Checkbox("Lotterie");
	Checkbox i8 = new Checkbox("Donne Nude");
	Checkbox i9 = new Checkbox("Uomini Nudi");
	
	public CheckBox(){
		chiudi.addActionListener(new Ascoltatore());
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		p1.add(r);
		p1.add(r1);
		p1.add(r2);
		p1.add(r3);
		p1.add(r4);
		p1.add(r5);
		p1.add(r6);
		p1.add(r7);
		
		r1.setCheckboxGroup(reddito);
		r2.setCheckboxGroup(reddito);
		r3.setCheckboxGroup(reddito);
		r4.setCheckboxGroup(reddito);
		r5.setCheckboxGroup(reddito);
		r6.setCheckboxGroup(reddito);
		r7.setCheckboxGroup(reddito);
		
		add(p1, BorderLayout.NORTH);
		
		p2.add(i);
		p2.add(i1);
		p2.add(i2);
		p2.add(i3);
		p2.add(i4);
		p2.add(i5);
		p2.add(i6);
		p2.add(i7);
		p2.add(i8);
		p2.add(i9);
		
		add(p2, BorderLayout.CENTER);
		add(chiudi, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[]args){
		new CheckBox();
	}
	
	public class Ascoltatore implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Iscrizione al sito www.ciao.it");
			System.out.println("Guadagno Annuo: ");
			if(r1.getState()){
				System.out.println(r1.getLabel());
			}else if(r2.getState()){
				System.out.println(r2.getLabel());
			}else if(r3.getState()){
				System.out.println(r3.getLabel());
			}else if(r4.getState()){
				System.out.println(r4.getLabel());
			}else if(r5.getState()){
				System.out.println(r5.getLabel());
			}else if(r6.getState()){
				System.out.println(r6.getLabel());
			}else if(r7.getState()){
				System.out.println(r7.getLabel() + "(Beato te)");
			}else{
				System.out.println("NON DICHIARATO");
			}
			
			System.out.println("Interessi Dichiarati: ");
			if( i1.getState()) System.out.println(i1.getLabel());
			if( i2.getState()) System.out.println(i2.getLabel());
			if( i3.getState()) System.out.println(i3.getLabel());
			if( i4.getState()) System.out.println(i4.getLabel());
			if( i5.getState()) System.out.println(i5.getLabel());
			if( i6.getState()) System.out.println(i6.getLabel());
			if( i7.getState()) System.out.println(i7.getLabel());
			if( i8.getState()) System.out.println(i8.getLabel());
			if( i9.getState()) System.out.println(i9.getLabel());
			System.exit(0);
		}
	}
	
}