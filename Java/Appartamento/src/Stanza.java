
public class Stanza {
	public double larghezza;
	public double lunghezza;
	public Finestra[]finestre;
	
	public Stanza(double largh, double lungh, int nFin){
		larghezza = largh;
		lunghezza = lungh;
		finestre = new Finestra[nFin];
	}
	
	public double calcolaArea(){
		return larghezza*lunghezza;
	}
	
	public double calcolaSuperficieFinestra(){
		double supTot = 0;
		for(int i = 0; i<finestre.length; i++){
			supTot = supTot + finestre[i].calcoloSup();
		}
		return supTot;
	}
	
	public double calcolaRapportoIlluminazione(){
		return calcolaArea()/calcolaSuperficieFinestra();	
	}
}
