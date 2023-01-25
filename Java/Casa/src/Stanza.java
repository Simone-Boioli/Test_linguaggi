public class Stanza {
	public int larghezza;
	public int lunghezza;
	public Finestra[]vet;
	
	public Stanza(int numerofinestre){
		vet=new Finestra[numerofinestre];
	}
	
	public Stanza(int largh, int lungh, Finestra[]vett){
		larghezza=largh;
		lunghezza=lungh;
		vet=vett;
	}
	
	public double calcolaSuperficieStanza(){
		double mq=lunghezza*larghezza;
		return mq;
	}
	public double supFinestre(){
		double tot=0;
		for(int i=0; i<vet.length; i++){
			if(vet[i]!=null)
				tot=tot+vet[i].calcolaSuperficieFin();
		}
		return tot;
	}
	
	public double calcolaRappIlluminazione(){
		double rai=calcolaSuperficieStanza()/supFinestre();
		return rai;	
	}
}
