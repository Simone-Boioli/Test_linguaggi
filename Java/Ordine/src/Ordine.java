
public class Ordine {
	private int prezzo;
	private Descrizione d;
	public Ordine(){
		this.prezzo=0;
		d=new Descrizione();
	}
	public void aggiungiProdotto(Prodotto p){
		prezzo+=p.getPrezzo();          //+= --->prezzo=prezzo+ ...
		d.append(p);     //upcasting
	}
	public int getPrezzo(){
		return prezzo;
	}
}
