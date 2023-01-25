//nodo della lista
public class Studente {
	private int matricola;
	private String cognome;
	private Studente successivo;
	
	public Studente(int mat, String cognome){
		this.matricola = mat;
		this.cognome = cognome;
		this.successivo = null;
	}
	
	public void stampa(){
		System.out.println("Matricola:" + this.matricola + ", Cognome:"+this.cognome);
	}

	public Studente getSuccessivo() {
		return successivo;
	}
	
	
	
	public void setSuccessivo(Studente successivo) {
		this.successivo = successivo;
	}

	public String getCognome(){
		return cognome;
	}
	
	
}
