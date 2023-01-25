
public class Lettera {
	@SuppressWarnings("unused")    // per togliere il warning 
	private String mittente;                   //
	@SuppressWarnings("unused")    //per togliere il warning
	private String destinatario;               //Attributi
	private boolean ritornoAlMittente;         //
	
	//costruttore
	public Lettera(String mitt, String dest){
		this.mittente = mitt;              //
		this.destinatario = dest;          //inizializzazioni
		this.ritornoAlMittente = false;    //
	}
	
	//metodo set che prende il nuovo valore e lo imposta nella nuava variabile
	public void setRitornoAlMittente(boolean val){
		this.ritornoAlMittente = val;
	}
	
	public boolean getRitornoAlMittente(){
		return this.ritornoAlMittente;
	}
}

