
public class Fabbrica {

	private final static int capacita = 5;
	private final static int numProdDx = 3;
	private final static int numProdSx = 3;
	private final static int numAssemblatori = 2;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Serbatoio serbatoio = new Serbatoio(capacita);
		
		for(int i =0; i<numProdDx; ++i) {
			new Produttore(i,Produttore.PARTE_DX,serbatoio).start();
		}

		for(int i =0; i<numProdSx; ++i) {
			new Produttore(i,Produttore.PARTE_SX,serbatoio).start();
		}

		for(int i =0; i<numAssemblatori; ++i) {
			new Assemblatore(serbatoio).start();
		}
		
		
	}

}
