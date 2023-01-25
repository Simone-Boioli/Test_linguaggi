
public class Pila {
	private Libro top;  //indica il primo elemento
	
	public Pila(){
		this.top = null;
	}
					//nodo della pila
					public class Libro {
						private String autore;
						private String titolo;
						private Libro successivo;
						
						public Libro(String autore, String titolo){
							this.autore = autore;
							this.titolo = titolo;
							this.successivo = null;
						}
						
						public void stampa(){
							System.out.println("Autore: "+this.autore+", Titolo: "+this.titolo);
						}
						
						public String getAutore(){
							return this.autore;
						}
						
					}
	
	public void inserisci(String autore, String titolo){
		Libro libro = new Libro(autore, titolo);
		if(top == null){
			top = libro;
		}else{
			libro.successivo = top;
			top = libro;
		}
	}
	
	public Libro estrai(){  //toglie il primo libro
		Libro libro = top;
		top = libro.successivo;
		return libro;
	}
	
	public void stampa(){
		Libro libro = top;
		while(top != null){
			top.stampa();
			top = top.successivo;
		}
		top = libro;
	}
	
	public String leggiAutore(){
		String autore = top.autore;
		return autore;
	}
	
	public String leggiTitolo(){
		String titolo = top.titolo;
		return titolo;
	}
	
	public Libro getTop(){
		return this.top;
	}
}
