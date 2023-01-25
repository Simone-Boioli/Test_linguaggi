
public class Rivista extends Libro{
	@SuppressWarnings("unused")
	private int numero;  //numero della rivista
	
	public Rivista(String titolo, int pagine, int num){
		super(titolo, pagine);
		this.numero = num;
	}
	public String toString(){
		String s;
		s = "Titolo del volume: " + getTitolo();
		s += ", numero di pagine: " + getPagine();
		s +=", num";
		return s;
	}
}
