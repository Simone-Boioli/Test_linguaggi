import java.util.ArrayList;


public class Coda {
	protected ArrayList<Persona> personeInCoda;   //array di persone che � come private ma � visibile alla gerarchia delle classi
	
	//costruttore per creare una coda
	public Coda(){  //non ci vogliono parametri
		this.personeInCoda = new ArrayList<Persona>();  //crea la coda...per ora vuota
		
	}
	
	//metodo per aggiungere le persone
	public void aggiungiPersona(Persona p){
		this.personeInCoda.add(p);  //aggiunge la persona alla coda
	}
	
	//metodo cbe retsituisce una persona
	public Persona restituisciPersona(){
		if(this.personeInCoda.isEmpty()) return null;    //controlla se c'� coda
		else return this.personeInCoda.remove(0); //restituisce l'oggetto in posizione 0
	}
}
