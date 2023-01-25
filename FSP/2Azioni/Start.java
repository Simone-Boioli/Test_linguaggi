public class Start{
	public static void main(String[]args){
		Risorsa r = new Risorsa();
	
		P p = new P(r, "P");
		P q = new P(r, "Q");

		p.start();
		q.start();
	}
}
