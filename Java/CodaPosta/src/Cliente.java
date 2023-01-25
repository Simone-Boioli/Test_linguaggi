
public class Cliente {
	private String nome;
	private String cognome;
	private Cliente successivo;
	
	public Cliente(String nome, String cognome){
		this.cognome = cognome;
		this.nome = nome;
		this.successivo = null;
	}
	
	public void stampa(){
		System.out.println("Il nome del cliente e': "+ this.nome + ", il cognome e':" + this.cognome);
	}

	public Cliente getSuccessivo() {
		return successivo;
	}

	public void setSuccessivo(Cliente successivo) {
		this.successivo = successivo;
	}

	
	
	/////////////////////////////////////////
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
}
