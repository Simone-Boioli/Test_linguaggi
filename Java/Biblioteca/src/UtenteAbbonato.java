
public class UtenteAbbonato extends Utente{
	
	public UtenteAbbonato(String nome, int maxPagineInPrestito){
		super(nome, maxPagineInPrestito);
	}
	
	public boolean prendiInPrestito(Libro l){
		if(l instanceof Rivista){
			this.libriInPrestito.add(l);
			return true;
		}
		else return super.prendiInPrestito(l);
	}
	
	public int contaPagineInPrestito(){
		int pagineTotali = 0;
		for(int i = 0; i < libriInPrestito.size(); i++){
			if(!(libriInPrestito.get(i) instanceof Rivista))
				pagineTotali += libriInPrestito.get(i).getNumeroPagine();
		}
		return pagineTotali;
	}
}
