
public class Stanza {
	private String nome;
	private int lunghezza;
	private int larghezza;
	
	public Stanza(String nome, int lungh, int largh){
		this.nome = nome;
		lunghezza = lungh;
		larghezza = largh;	
	}
	
	public int calcolaArea(){
		return lunghezza*larghezza;
	}

	@Override
	public String toString() {
		return "Stanza [nome=" + nome + ", lunghezza=" + lunghezza
				+ ", larghezza=" + larghezza + "]";
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}

	
	
}
