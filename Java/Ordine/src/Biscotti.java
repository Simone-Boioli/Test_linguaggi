
public class Biscotti extends Prodotto{     //extends=la classe Biscotti è estesa alla classe Prodotto
	public Biscotti(){
		super(10);        //Valore di biscotti
	}
	public String toString(){
		String s="Biscotti:Prezzo"+this.getPrezzo();
		return s;
	}
}
