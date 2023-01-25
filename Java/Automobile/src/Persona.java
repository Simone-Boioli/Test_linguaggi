
public class Persona {
	private String nome;
	private String cognome;
	private int stipendio;
	
	public Persona(String nome, String cognome, int stipendio){
		this.nome=nome;
		this.cognome=cognome;
		this.stipendio=stipendio;
	}
	
	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public int getStipendio(){
		return stipendio;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}

	public void setCognome(String cognome){
		this.cognome=cognome;
	}
	public void setStipendio(int stipendio){
		if(stipendio>0){
			this.stipendio=stipendio;
		}else{
			this.stipendio=0;
		}
		
	}
	
}
