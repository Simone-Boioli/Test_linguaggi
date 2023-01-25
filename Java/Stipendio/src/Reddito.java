
public class Reddito {
	private String cognome;
	private int stipendioAnnuo;
	private int anniAnzianita;
	
	public Reddito(String cogn, int stip, int anni){
		cognome = cogn;
		stipendioAnnuo = stip;
		anniAnzianita = anni;
	}
	
	public boolean aggiornaStipendio(){
		int stipendioAnnuoAgg = 1000+(50*anniAnzianita);
		if(stipendioAnnuoAgg != stipendioAnnuo){
			stipendioAnnuo=stipendioAnnuoAgg;
			return true;
		}
		else{
			return false;
		}
	}

	
	public String toString() {
		return "Reddito [cognome=" + cognome + ", stipendioAnnuo="
				+ stipendioAnnuo + ", anniAnzianita=" + anniAnzianita + "]";
	}

	public int getStipendioAnnuo() {
		return stipendioAnnuo;
	}

	public void setStipendioAnnuo(int stipendioAnnuo) {
		this.stipendioAnnuo = stipendioAnnuo;
	}
	
	
	
	
}
