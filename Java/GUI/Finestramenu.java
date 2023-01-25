import java.awt.*;
import java.awt.event.*;

public class Finestramenu extends Frame{
	MenuItem apri=new MenuItem("Apri");
	MenuItem chiudi=new MenuItem("Chiudi");
	MenuItem salva=new MenuItem("Salva");
	MenuItem esci=new MenuItem("Esci");
	MenuItem taglia=new MenuItem("Taglia");
	MenuItem copia=new MenuItem("Copia");
	MenuItem incolla=new MenuItem("Incolla");
	MenuItem cancella=new MenuItem("Cancella");
	MenuItem cerca=new MenuItem("Cerca");
	MenuItem rimpiazza=new MenuItem("Rimpiazza");
	MenuItem aiuto=new MenuItem("Indice");

	Menu file= new Menu("File");
	Menu edit= new Menu("Edit");
	Menu help= new Menu("Help");

	MenuBar barra = new MenuBar();

	Label risultato=new Label("Nessuna voce di menu cliccata");

	public Finestramenu(){
		setupEventi();

		file.add(apri);
		file.add(salva);
		file.add(chiudi);
		file.addSeparator();
		file.add("Menu Uscita");
		file.addSeparator();
		file.add(esci);
		
		edit.add(taglia);
		edit.add(copia);
		edit.add(incolla);
		edit.add(cancella);
		edit.addSeparator();
		edit.add(cerca);
		edit.add(rimpiazza);

		help.add(aiuto);
		
		barra.add(file);
		barra.add(edit);
		barra.setHelpMenu(help);

		setMenuBar(barra);
		add(risultato);

		pack();
		setVisible(true);

		addWindowListener(new FinestramenuWindowListener());
	}

	public void setupEventi(){
		apri.addActionListener(new AscoltatoreMenu());
		salva.addActionListener(new AscoltatoreMenu());
		chiudi.addActionListener(new AscoltatoreMenu());
		esci.addActionListener(new AscoltatoreMenu());
		taglia.addActionListener(new AscoltatoreMenu());
		copia.addActionListener(new AscoltatoreMenu());
		incolla.addActionListener(new AscoltatoreMenu());
		cancella.addActionListener(new AscoltatoreMenu());
		cerca.addActionListener(new AscoltatoreMenu());
		rimpiazza.addActionListener(new AscoltatoreMenu());
		aiuto.addActionListener(new AscoltatoreMenu());
	}
	
	public static void main(String[] arg){
		new Finestramenu();
	}

	
	public class AscoltatoreMenu implements ActionListener{
		public void actionPerformed (ActionEvent e){
			risultato.setText(" Cliccato "+e.getActionCommand());
			if (e.getActionCommand().compareTo("Esci")==0) {
				System.exit(0);
			}
		}
	}	
	
	
	public class FinestramenuWindowListener implements WindowListener{
		public void windowActivated(WindowEvent e){
			System.out.println("Sentito un Window Activated");
		}
		
		public void windowClosed(WindowEvent e){
			System.out.println("Sentito un Window Closed");
		}
		public void windowClosing(WindowEvent e){
			System.out.println("Sentito un Window Closing");
			System.exit(0);
		}
		public void windowDeactivated(WindowEvent e){
			System.out.println("Sentito un Window Deactivaded");
		}
		public void windowDeiconified(WindowEvent e){
			System.out.println("Sentito un Window Deiconified");
		}
		public void windowIconified(WindowEvent e){
			System.out.println("Sentito un Window Iconified");
		}
		public void windowOpened(WindowEvent e){
			System.out.println("Sentito un Window Opened");
		}
}
}