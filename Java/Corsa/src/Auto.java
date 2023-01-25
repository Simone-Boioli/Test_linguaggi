
public class Auto {
	private String scuderia;
	private Pilota pilota;
	
	public Auto(String scuderia, Pilota pilota){
		setScuderia(scuderia);
		setPilota(pilota);
	}
	
	public String dammiDettagli(){
		return(getPilota().getNome()+" della "+getScuderia());
	}
	
	public String getScuderia() {
		return scuderia;
	}
	public void setScuderia(String scuderia) {
		this.scuderia = scuderia;
	}
	public Pilota getPilota() {
		return pilota;
	}
	public void setPilota(Pilota pilota) {
		this.pilota = pilota;
	}
	
	
}
