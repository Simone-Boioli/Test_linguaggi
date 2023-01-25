import javax.swing.*;
import java.awt.*;


@SuppressWarnings({ "serial", "unused" })  //per togliere il warning
class Finestra extends JFrame{
	

	
	JPanel tutto=new JPanel();
	JTextField from=new JTextField("");
	JTextField to=new JTextField("");
	JTextField subject=new JTextField("");
	JTextField body=new JTextField("");
	JButton sub=new JButton("submit");
	
	Finestra(AscoltatoreBottone asc){
		
		sub.addActionListener(asc);
		
		//Frame
		setSize(800,600);
		setVisible(true);
		
		//tutto
		add(tutto);
		tutto.setLayout(null);
		
		//from
		JLabel da=new JLabel("DA:");
		da.setBounds(120,20,30,25);
		from.setBounds(150,20,500,25);
		tutto.add(from);
		tutto.add(da);
		
		//to
		JLabel a=new JLabel("A:");
		a.setBounds(120,50,30,25);
		to.setBounds(150,50,500,25);
		tutto.add(to);
		tutto.add(a);
		
		//subject
		JLabel soggetto=new JLabel("Soggetto:");
		soggetto.setBounds(90,80,70,25);
		subject.setBounds(150,80,500,25);
		tutto.add(subject);
		tutto.add(soggetto);
		
		//body
		JLabel messaggio=new JLabel("Messaggio:");
		messaggio.setBounds(350,150,100,25);
		body.setBounds(50,180,700,275);
		tutto.add(messaggio);
		tutto.add(body);
		
		//submit
		sub.setBounds(300,480,200,50);
		tutto.add(sub);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
}