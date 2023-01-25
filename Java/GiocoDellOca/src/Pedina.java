public class Pedina {
	private String colore;
	private int casellaCorrente;
	public Pedina(String colore){
		this.colore = colore;
		this.casellaCorrente = 1;
	}
	public void avanza(int caselle){
		this.casellaCorrente += caselle;
	}
	public int getCasellaCorrente(){
		return this.casellaCorrente;
	}
	public String toString(){
		String s = "Pedina di colore: " + this.colore;
		s += ", casella: " + this.casellaCorrente;
		return s;
	}
}
