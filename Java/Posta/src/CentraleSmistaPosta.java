import java.util.ArrayList;


public class CentraleSmistaPosta {
	@SuppressWarnings("unused")  //per togliere il warning
	private String codice;
	private ArrayList<Lettera> lettere;      //Attributo lettere che � un arreyList 
	
	//costruttore
	public CentraleSmistaPosta(String codice){
		this.codice = codice;
		lettere = new ArrayList<Lettera>();   //Si crea un arrayList vuoto
	}
	
	public void riceviLettera(Lettera l){
		if (l != null) this.lettere.add(l);    //Aggiunge una lettera l all'arreyList
	}
	
	public Lettera smistaLettera(){     //elimina dall'arreyList la lettera con priorit� pi� alta
		if (this.lettere.isEmpty())  return null;   //controllo se ci sono lettere
		
		int indiceLetteraMaxPriorita = 0;
		int maxPriorita;
		if(this.lettere.get(0) instanceof LetteraPrioritaria)
			maxPriorita = ((LetteraPrioritaria)this.lettere.get(0)).getPriorita();
		else maxPriorita = 0;
		
		for(int i = 1; i < this.lettere.size(); i++){
			Lettera l = this.lettere.get(i);
			int p_i;
			if(l instanceof LetteraPrioritaria)
				p_i = ((LetteraPrioritaria)l).getPriorita();
			else p_i = 0;
			
			if(p_i > maxPriorita){
				indiceLetteraMaxPriorita = i;
				maxPriorita = p_i;
			}
		}
		return this.lettere.remove(indiceLetteraMaxPriorita);
	}
}
