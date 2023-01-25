package LibrettoScolastico;

import java.io.*;

public class Materia implements Serializable{
	private static final long serialVersionUID = 2L; //???????????
	private String nome;  //nome materia
	private int vS;  //numero voti scritto
	private int vO;  //numero voti orale
	private int vL;  // numero voti laboratorio
	
	private GruppoVoti gvS; //gruppo di voti Scritti
	private GruppoVoti gvO; //Gruppo di voti Orali
	private GruppoVoti gvL; //gruppo di voti Laboratorio
	
	public Materia(){
		nome = new String();
		this.vS = this.vO = this.vL = 2;
		this.gvS = new GruppoVoti(Voto.Tipo.Scritto);
		this.gvO = new GruppoVoti(Voto.Tipo.Orale);
		this.gvL = new GruppoVoti(Voto.Tipo.Laboratorio);
	}
	
	public int size(){
	
		return arrayMaterie.size();
		aggiorna();
		return this.vS + this.vO + this.vL;		
	}
	//metodo che aggiorna i dati
	public void aggiorna(){
		this.vS = this.gvS.size();
		this.vO = this.gvO.size();
		this.vL = this.gvL.size();
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public GruppoVoti getGVS(){
		return this.gvS;
	}
	
	public GruppoVoti getGVO(){
		return this.gvO;
	}
	
	public GruppoVoti getGVL(){
		return this.gvL;
	}
	
	//ritorna il numero di voti scritti
	public int getVotiScritto(){
		aggiorna();
		return this.vS;
	}
	
	//ritorna il numero di voti orali
	public int getVotiOrale(){
		aggiorna();
		return this.vO;
	}
		
	//ritorna il numero di voti laboratorio
	public int getVotiLaboratorio(){
		aggiorna();
		return this.vL;
	}
	
	//metodo che ritorna il numero di voti
	public int getNumVoti(){
		//aggiorna();
		return vS + vO + vL;
	}
	
	//metodo che ritorna la media dei voti scritti
	public double getMediaScritto(){
		return this.gvS.getMedia();
	}
	
	//metodo che ritorna la media dei voti orali
	public double getMediaOrale(){
		return this.gvS.getMedia();
	}
	
	//metodo che ritorna la media dei voti laboratorio
	public double getMediaLaboratorio(){
		return this.gvS.getMedia();
	}
	
	//metodo che ritorna la media
	public double getMedia(){
		aggiorna();
		return (double)getSomma() / (double)getNumVoti();
	}
	
	//metodo che fa la somma dei voti
	public double getSomma(){
		double somma = 0;
		for(int i = 0; i < this.gvS.size(); i++){
			somma = somma + this.gvS.get(i).getValore();
		}
		for(int i = 0; i < this.gvO.size(); i++){
			somma = somma + this.gvO.get(i).getValore();
		}
		for(int i = 0; i < this.gvL.size(); i++){
			somma = somma + this.gvL.get(i).getValore();
		}
		return somma;
	}
	
	public double getRecScritto(){
		return this.gvS.getRec();
	}
	
	public double getRecOrale(){
		return this.gvO.getRec();
	}
	
	public double getRecLaboratorio(){
		return this.gvL.getRec();
	}
}
