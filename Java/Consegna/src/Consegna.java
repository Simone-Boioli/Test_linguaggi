
public class Consegna {
	private int distanza;
	private int peso;
	Consegna next; //punta alla consegna successiva
	
	public Consegna(int distanza, int peso){
		this.distanza = distanza;
		this.peso = peso;
	}

	public int getDistanza() {
		return distanza;
	}

	public void setDistanza(int distanza) {
		this.distanza = distanza;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Consegna getNext() {
		return next;
	}

	public void setNext(Consegna next) {
		this.next = next;
	}
	/*
	public String stampa(){
		String consegne = "";
		Consegna head;
		
			
		return consegne;
	}
	*/
}
