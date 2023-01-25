
public class Dvd {
	private int regionCode; //codice dvd
	private String titolo;
	private int durata;

	public Dvd(int cod, String titolo, int durata){
		regionCode = cod;
		this.titolo = titolo;
		this.durata = durata;
	}

	public String toString() {
		return titolo + " di durata " + durata + "min, region code " + regionCode; 
	}

	public int getRegionCode() {
		return regionCode;
	}
	
	
	
	
}
