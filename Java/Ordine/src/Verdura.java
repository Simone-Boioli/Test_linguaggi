
public class Verdura extends Prodotto {
	public Verdura(){
		super(2);
	}
	public String toString(){
		String s="Verdura:Prezzo"+this.getPrezzo();
		return s;
	}
}
