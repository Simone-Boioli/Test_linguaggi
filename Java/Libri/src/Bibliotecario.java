
public class Bibliotecario {
	public static void main(String[]args){
		Pila libri = new Pila();
		libri.inserisci("Dan brown", "il codice da vinci");
		libri.inserisci("Dan brown", "crypto");
		libri.inserisci("Hemingway", "addio alle armi");
		libri.inserisci("kevin Mitnick", "L'arte dell'inganno");
		libri.inserisci("kevin Mitnick", "L'arte dell'intrusione");
		libri.inserisci("dan brown", "La verità di ghiaccio");
		
		libri.stampa();
		
		while(libri.getTop().getAutore() != "Hemingway"){
			libri.estrai();
		}
		System.out.println("");
		System.out.println(libri.leggiTitolo());
		System.out.println(libri.leggiAutore());
		
		System.out.println("");
		libri.stampa();
		
	}
}
