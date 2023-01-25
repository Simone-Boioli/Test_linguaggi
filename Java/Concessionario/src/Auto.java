public class Auto {

	private int larghezza;
	private int altezza;
	private String targa;
	
	//costruttore
	public Auto (int largh, int alt, String targa){
		this.larghezza=largh;
		this.altezza=alt;
		this.targa=targa;
	}
	
	public String toString(){
		return(""+larghezza+ " "+altezza+ " "+targa );
	}

	public int getLarghezza() {
		return larghezza;
	}

	public int getAltezza() {
		return altezza;
	}

	public String getTarga() {
		return targa;
	}
	
	
	
	
}
