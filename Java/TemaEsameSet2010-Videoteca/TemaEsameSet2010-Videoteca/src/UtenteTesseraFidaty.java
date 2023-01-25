
public class UtenteTesseraFidaty extends Utente{
	/* Un utente per cui si tiene memoria del numero di film affittati
	 * e si sconta il prezzo di un film ogni 10
	 * */
	private int numeroFilmAffittati;

	public UtenteTesseraFidaty(String nome) {
		super(nome);
		this.numeroFilmAffittati = 0;
	}

	/* come super.prendiInPrestito, ma restituisce un prezzo 
	 * zero, ogni 10 film affittati (ovvero per il decimo, ventesimo, ...) 
	 * */
	public int prendiInPrestito(Videoteca v, String titolo){
		int prezzo = super.prendiInPrestito(v, titolo);
		if(prezzo > 0){
			this.numeroFilmAffittati++;
			if(this.numeroFilmAffittati % 10 == 0) 
				return 0;
		}
		return prezzo;
	}

}
