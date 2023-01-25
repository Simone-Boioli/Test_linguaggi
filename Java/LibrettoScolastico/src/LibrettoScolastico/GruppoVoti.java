package LibrettoScolastico;

import java.io.*;
import java.util.*;

public class GruppoVoti implements Serializable{
	private static final long seralVersionUID = 3L;
	private Voto.Tipo tipo;  //tipo d voto
	private ArrayList<Voto> arrayVoti;
	private double media; //indica la media 
	private double rec;  // indica il voto per poter recuperare
	
	public GruppoVoti(Voto.Tipo t){
		this.tipo = t;
		this.arrayVoti = new ArrayList<Voto>();
		this.media = this.rec = 0;
	}
	
	public int size(){
		return this.arrayVoti.size();
	}
	
	public Voto get(int j){
		return this.arrayVoti.get(j);
	}
	
	//metodo che ritorna la media
	public double getMedia(){
		return this.media;
	}
	
	public double getRec(){
		return this.rec;
	}
}
