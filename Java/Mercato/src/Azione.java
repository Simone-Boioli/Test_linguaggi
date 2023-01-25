
public class Azione {
	private String tipo;
	private int prezzo;
	
	public Azione(String tipo, int prezzo){
		this.tipo=tipo;
		this.prezzo=prezzo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		if(prezzo>=0)
			this.prezzo = prezzo;
		else
			this.prezzo=0;
	}
	
	
}
