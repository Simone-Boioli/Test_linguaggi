
public class Prodotto {
	
	private int prezzo;
	public Prodotto(int prezzo){
		this.prezzo=prezzo;
	}
	public int getPrezzo(){
		return this.prezzo;
	}
	public String toString(){
		String s="Prodotto:Prezzo"+this.prezzo;  //Rappresentazione testuale
		return s;
	}
}
