public class Start{
	public static void main(String[]args){
	
		Contenitore c = new Contenitore(6);
		Rifornitore r = new Rifornitore(c);

		Utente u1 = new Utente(c, 1);
		Utente u2 = new Utente(c, 2);
		Utente u3 = new Utente(c, 3);


		r.start();

		u1.start();
		u2.start();
		u3.start();
	}
}
