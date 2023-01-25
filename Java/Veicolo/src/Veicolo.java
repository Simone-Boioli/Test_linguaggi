
public class Veicolo {
	private int numMatricola;  //indica il numero di matricola del veicolo
	private String Proprietario;  //indica il nome del proprietario del veicolo
	
	public Veicolo(int numMat, String nomeProp){
		this.numMatricola = numMat;
		this.Proprietario = nomeProp;
	}
	
	public String disegna(){
		return "disegna un veicolo";
	}

	public String getProprietario() {
		return Proprietario;
	}

	public void setProprietario(String proprietario) {
		Proprietario = proprietario;
	}

	public int getNumMatricola() {
		return numMatricola;
	}
	
	
}
