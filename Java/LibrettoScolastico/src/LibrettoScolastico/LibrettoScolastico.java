package LibrettoScolastico;

import java.io.*;
import java.util.*;

import javax.swing.*;

public class LibrettoScolastico implements Serializable{
	private static final long serialVersionUID = 1L;  //?????????
	private ArrayList<Materia> arrayMaterie; //array delle materie inserite
	private int materia; //indice della materia su cui operare
	private final String nomeFile = "Libretto_Scolastico.sav";
	
	//costruttore
	public LibrettoScolastico(){
		if(leggiFile())
			return;
		this.arrayMaterie = new ArrayList<Materia>();
		this.materia = -1; //indice nullo
	}
	
	//main
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 375);
		frame.setVisible(true);
		frame.setResizable(false);  //non è ridimensionabile
		frame.setLocationRelativeTo(null);  // se è null la finestra è centrata nello schermo
	}
	
	//riepilogo dei voti e materie nel libretto
	public String riepilogo(){
		if(this.size() == 0){
			return "Nessuna Materia Inserita";
		}
		String s = "";
		for(int j = 0; j < this.arrayMaterie.size(); j++){
			double rec;
			s = s + "\n" + this.arrayMaterie.get(j).getNome() + ":\n"; //restituisce il nome della materia
			
			if(this.arrayMaterie.get(j).getNumVoti() == 0){
				s+=("Nessun Voto Presente");
				s = s + "\n-----------------\n";
				continue;
			}
			
			//riepilogo voti scritti
			if(this.arrayMaterie.get(j).getGVS().size() != 0){
				s = s + "  Scritto: Voti: " + this.arrayMaterie.get(j).getVotiScritto() + String.format("Media : %.2f", 
						Math.round(this.arrayMaterie.get(j).getMediaScritto()*100.0)/100.0);
				rec = this.arrayMaterie.get(j).getRecScritto();
				
				if(rec != 0){
					s = s + "\n          " + (rec == -1 ? "impossibile recuperare con un voto" : "Recupero con:" + rec);
				}
				s = s + "\n";
			}
			
			
			//riepilogo voti orali
			if(this.arrayMaterie.get(j).getGVO().size() != 0){
				s = s + "  Orale: Voti: " + this.arrayMaterie.get(j).getVotiOrale() + String.format("Media : %.2f", 
						Math.round(this.arrayMaterie.get(j).getMediaOrale()*100.0)/100.0);
				rec = this.arrayMaterie.get(j).getRecOrale();
				
				if(rec != 0){
					s = s + "\n          " + (rec == -1 ? "impossibile recuperare con un voto" : "Recupero con:" + rec);
				}
				s = s + "\n";
			}
			
			//riepilogo voti laboratorio
			if(this.arrayMaterie.get(j).getGVL().size() != 0){
				s = s + "  Laboratorio: Voti: " + this.arrayMaterie.get(j).getVotiLaboratorio() + String.format("Media : %.2f", 
						Math.round(this.arrayMaterie.get(j).getMediaLaboratorio()*100.0)/100.0);
				rec = this.arrayMaterie.get(j).getRecLaboratorio();
				
				if(rec != 0){
					s = s + "\n          " + (rec == -1 ? "impossibile recuperare con un voto" : "Recupero con:" + rec);
				}
				s = s + "\n-----------------\n";
			}		
		}
		return s;
	}
	
	//metodo che ritona la lunghezza dell'array delle materie (0 se non ci sono materie)
	public int size(){
		return (this.arrayMaterie.size());
	}
	
	//metodo che aggiunge un materia all'array delle materie
	public void addMateria(String nome){
		Materia mat = new Materia();
		mat.setNome(nome);
		this.arrayMaterie.add(mat);
		salvaFile();
	}
	
	//metodo che ritorna La materia in una certa posizione passata
	public Materia get(int i){
		return this.arrayMaterie.get(i);
	}
	
	//metodo che ritorna l'array delle materie
	public ArrayList<Materia> getArrayListMat(){
		return this.arrayMaterie;
	}
	
	
	//metodo che salva tutto su un file
	public void salvaFile(){
		try{
			FileOutputStream out = new FileOutputStream(nomeFile); //creo uno stream di output 
			ObjectOutputStream oout = new ObjectOutputStream(out); //creo un output steram di oggetti
			oout.writeObject(this);
			oout.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Salvataggio non riuscito\n\n"+e, "Errore", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//metodo per leggere i dati da un file
	public boolean leggiFile(){
		try{
			File file = new File(nomeFile);
			if(!file.exists()){
				return false;
			}
			FileInputStream input = new FileInputStream(nomeFile);
			ObjectInputStream oinput = new ObjectInputStream(input);
			
			LibrettoScolastico tmp = (LibrettoScolastico)(oinput.readObject());
			this.arrayMaterie = tmp.getArrayListMat();
			
			oinput.close();
			return true;
		}catch(Exception e){
			int risp = JOptionPane.showConfirmDialog(null,
					        "Errore, continuare creando un nuovo libretto?",
					        "Creare un nuovo libretto?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(risp == JOptionPane.NO_OPTION){
				System.exit(0);
			}
			return false;
		}
	}
}
