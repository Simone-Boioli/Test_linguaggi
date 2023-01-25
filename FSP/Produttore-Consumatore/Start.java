public class Start{
	public static void main(String[]args){
		Buffer b = new Buffer();
		Consumatore c = new Consumatore(b);
		Produttore p = new Produttore(b);

		p.start();
		c.start();
	}
}
