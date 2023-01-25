
public class Ordine {
	private int totale;
	private Descrizione d;
	
	public Ordine(){
		this.totale = 0;
		d = new Descrizione();
	}
	
	public void aggiungiProdotto(Prodotto p){
		totale = totale + p.getPrezzo();
		d.append(p);
	}

	public int getTotale() {
		return totale;
	}
	
	
}
