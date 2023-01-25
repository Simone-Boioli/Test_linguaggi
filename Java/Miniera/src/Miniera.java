
abstract class Miniera {
	private int riserva; //quantita estraibile
	
	
	public Miniera(int riserva){
		this.riserva = riserva;
	}
	
	int valore;
	
	public int getValore(){
		return valore;
	}
		
	
	public int estraiEVendi(int materiale){
		int daVendere=0;
		if(materiale>riserva){
			daVendere=riserva;
		}
		else
			daVendere=materiale;
		return(daVendere*getValore());
	}
}
