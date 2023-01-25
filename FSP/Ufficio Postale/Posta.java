
public class Posta {

	private final static int NUM_UTENTI=6;
	private final static int CAPIENZA = 2;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sportello s = new Sportello(NUM_UTENTI);
		Ufficio u = new Ufficio(NUM_UTENTI,NUM_UTENTI);
		
		for(int i =0; i<NUM_UTENTI;++i) {
			new Utente(u,s).start();
		}
	}

}
