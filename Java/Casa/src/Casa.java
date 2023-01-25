public class Casa {
	public Stanza[]vettore;
	
	
	public Casa(int capacità){
		vettore=new Stanza[capacità];
	}
	
		
	public double calcolaSuperficie(){
		double sup=0;
		for(int i=0; i<vettore.length; i++){
			if(vettore[i]!=null)
			sup=sup+vettore[i].calcolaSuperficieStanza();
		}
		return sup;
	}
	
	public double calcolaSuperficieFinestre(){
		double sup=0;
		for(int i=0; i<vettore.length; i++){
			sup=sup+vettore[i].supFinestre();
		}
		return sup;
	}
	
	public double calcolaRappIlluminazione(){
		double rapp=calcolaSuperficie()/calcolaSuperficieFinestre();
		return rapp;
	}
	
	public double calcolaRappIlluminazioneMed(){
		double rappmed=calcolaRappIlluminazione()/vettore.length;
		return rappmed;
	}
	
	
}
