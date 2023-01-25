
public class Utente {
	private String nome;
		
	public Utente(String nome){
		this.nome = nome;
	}
	
	public int prendiInPrestito(Videoteca videoteca, String titolo){
		return 2;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
}
