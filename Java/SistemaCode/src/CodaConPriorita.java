
public class CodaConPriorita extends Coda{
	
	
	//costruttore
	public CodaConPriorita(){
		super();  //invoca i costruttori della superclasse (Coda)
		
	}
	
	//metodo che sovrascrive il metodo restituisciProssimo
	public Persona restituisciPersona(){
		for(int i = 0;i < this.personeInCoda.size(); i++){   //cerca se nella coda ci sono persona con et� maggiore di 60 e se le trova le restituisce 
			Persona p = this.personeInCoda.get(i);  
			if(p.getEta() >= 60) 
				return this.personeInCoda.remove(i);  //restituisce e rimuove dalla coda la persona non pi� di 60 anni
		}
		return super.restituisciPersona();   //se non ci sono persone con piu di 60 anni restituisce la prima persona in coda
	}

}
