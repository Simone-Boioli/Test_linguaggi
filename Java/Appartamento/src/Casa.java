
public class Casa {
	Stanza [] stanze;
	
	public Casa(int nStanze){
		stanze = new Stanza[nStanze];
	}
	public double calcolaSuperficie(){
		double supTot = 0;
		for(int i=0; i<stanze.length; i++){
			supTot = supTot + stanze[i].calcolaArea();
		}
		return supTot;
	}
	
	public double calcolaSuperficieFinestre(){
		double supTotFin = 0;
		for(int i=0; i<stanze.length; i++){
			supTotFin = supTotFin + stanze[i].calcolaSuperficieFinestra();
		}
		return supTotFin;
	}
	
	public double calcolaRapportoIlluminazione(){
		return calcolaSuperficie()/calcolaSuperficieFinestre();
	}
	
	public double calcolaRapportoIlluminazioneMedio(){
		double raiMedio = 0;
		for(int i=0; i<stanze.length; i++){
			raiMedio = raiMedio + stanze[i].calcolaRapportoIlluminazione();
		}
		return raiMedio/stanze.length;
	}
}
