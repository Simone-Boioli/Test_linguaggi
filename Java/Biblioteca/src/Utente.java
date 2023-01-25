import java.util.ArrayList;

public class Utente {
	@SuppressWarnings("unused")
	private String nome;
	private int massimoPagineInPrestito;
	protected ArrayList<Libro> libriInPrestito;
	
	public Utente(String nome, int maxPagInPrestito){
		this.nome = nome;
		this.massimoPagineInPrestito = maxPagInPrestito;
		this.libriInPrestito = new ArrayList<Libro>();
	}
	
	public int getPagineInPrestito(){
		int cont = 0;
		for(int i=0; i<libriInPrestito.size(); i++){
			cont = cont + libriInPrestito.get(i).getNumeroPagine(); 
		}
		return cont;
	}
	
	public boolean prendiInPrestito(Libro l){
		if(getPagineInPrestito() + l.getNumeroPagine() > massimoPagineInPrestito){
			return false;
		}else
			this.libriInPrestito.add(l);
			return true;
	}
			
	public Libro restituisciLibri(){
		if(libriInPrestito.isEmpty()){
			return null;
		}else 
			return libriInPrestito.remove(0);
	}
	
}
