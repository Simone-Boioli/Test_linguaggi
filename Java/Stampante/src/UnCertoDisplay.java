
public class UnCertoDisplay implements IDisplay{

	@SuppressWarnings("static-access")  //per sopprimere i warnings
	@Override
	public void inviaSegnale(int segnale) {
		if(segnale == this.CARTUCCIA_IN_ESAURIMENTO)
			System.out.println("La cartuccia sta per finire");
		if(segnale == this.CARTUCCIA_VUOTA)
			System.out.println("Sostituire la cartuccia");
	}
	
}