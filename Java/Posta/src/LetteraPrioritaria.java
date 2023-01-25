
public class LetteraPrioritaria extends Lettera {  //eredita tutti gli attributi di Lettera
	private int priorita;
	
	//costruttore
	public LetteraPrioritaria(String mitt, String dest, int priorita){
		super(mitt, dest);   //prende i valori del costruttore della classe superiore (Lettera)
		if(priorita > 1) this.priorita = priorita;
		else this.priorita = 1;   //detto dal testo
	}
	
	//metodo get
	public int getPriorita(){
		if(this.getRitornoAlMittente()) return 0;       //controlla il senso di marcia
		else return this.priorita;
	}
}

