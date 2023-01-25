package LibrettoScolastico;

import java.io.*;

public class Voto implements Serializable{
	private static final long serialVersionUID = 4L;
	private Tipo tipo = Tipo.Scritto;
	private double valore; //indica il valore del voto

	//costruttore
	public Voto(){
		this.valore = 0;
	}
	
	//metodo che restituisce il valore del voto
	public double getValore(){
		return this.valore;
	}
	//enumerazione
	public enum Tipo{  
		Scritto,
		Orale, 
		Laboratorio
	};
}
