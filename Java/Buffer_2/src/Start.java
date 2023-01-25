
public class Start {
	public static void main(String[] args) {
		Buffer b = new Buffer();
		Produttore p1 = new Produttore(b);
		Produttore p2 = new Produttore(b);
		
		Consumatore c1 = new Consumatore(b);
		Consumatore c2 = new Consumatore(b);
		
		p1.start();
		p2.start();
		c1.start();
		c2.start();
	}

}
