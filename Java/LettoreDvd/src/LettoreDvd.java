
public class LettoreDvd {
	private int regionCode;
	private boolean inVisione;  
	private Dvd dvd;
	
	public LettoreDvd(int cod){
		regionCode = cod;
		dvd = null;        //non ci sono dvd inseriti
		inVisione = false; 
	}
	
	public boolean inserisciDvd(Dvd disco){
		if(this.dvd == null && disco != null){
			this.dvd = disco;
			return true;
		}else{
			return false;
		}
	}
	
	public Dvd rimuoviDvd(){
		Dvd dvdEstratto = dvd;
		return dvdEstratto;
	}
	
	public boolean play(){
		if(!inVisione && dvd != null && dvd.getRegionCode() == regionCode ){
			inVisione = true;
		}
		return inVisione;
	}
	
	public boolean stop(){
		if(inVisione){
			inVisione = false;
			return true;
		}else{
			return false;
		}
	}

	
	public String toString() {
		if(dvd == null){
			return "Region Code: " + regionCode + " Dvd: none In Visione: "+inVisione;
		}else{
			return "Region Code: " + regionCode + " Dvd: " + dvd.toString() + " In visione: " + inVisione;
		}
	}
	
	
	
}
