import java.awt.Font;

import javax.swing.*;
@SuppressWarnings("serial")
public class Finestra extends JFrame{
	
	JTextField valore1;
	JTextField valore2;
	JButton buttonMCD_mcm;
	JLabel textValore1;
	JLabel textValore2;
	JLabel textResultMCD;
	JLabel textResultMcm;
	Ascoltatore operazione;
	Finestra(){
		
	}
	
	public Finestra(Ascoltatore asc){
		valore1 = new JTextField();
		valore1.setBounds(100,10,150,25);
		this.add(valore1);
		
		valore2 = new JTextField();
		valore2.setBounds(300,10,150,25);
		this.add(valore2);
		
		
		textValore1 = new JLabel("Valore 1");
		textValore1.setBounds(150,40,150,25);
		this.add(textValore1);
		
		textValore2 = new JLabel("Valore 2");
		textValore2.setBounds(350,40,150,25);
		this.add(textValore2);
		
		buttonMCD_mcm = new JButton("CALCOLA MCD E mcm");
		buttonMCD_mcm.setBounds(180,80,200,50);
		this.add(buttonMCD_mcm);
		
		operazione = new Ascoltatore(this.valore1, this.valore2);
		buttonMCD_mcm.addActionListener(operazione);
		
		
		this.setLayout(null);
		this.setSize(600,500);
		this.setVisible(true);
		
	}
	public void addMCD(long MCD){
		Font f = new Font("Dialog", Font.PLAIN, 30);
		textResultMCD = new JLabel("MCD = " + MCD);
		textResultMCD.setBounds(150,200,400,40);
		textResultMCD.setFont(f);
		this.add(textResultMCD);
	}
	
	public void addMcm(long MCM){
		Font f = new Font("Dialog", Font.PLAIN, 30);
		textResultMcm = new JLabel("mcm = " + MCM);
		textResultMcm.setBounds(150,240,400,40);
		textResultMcm.setFont(f);
		this.add(textResultMcm);
	}
	
}
