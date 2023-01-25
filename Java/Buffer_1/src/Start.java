
public class Start {
	public static void main(String[]args){
		Buffer b = new Buffer();
		Produttore p = new Produttore(b);
		Consumatore c = new Consumatore(b);
		
		p.start();
		c.start();
	}

}
