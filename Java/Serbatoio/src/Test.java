import junit.framework.TestCase;


public class Test extends TestCase {
	private Serbatoio serbatoi[] = {
			new Serbatoio(100.0),
			new SerbatoioPressurizzato(20.0, 35.0, 5.0),
			new Serbatoio(1000.0),
			//pericolo = true
			new SerbatoioPressurizzato(6.0, 35.01, 4.0),
			new SerbatoioPressurizzato(11.0, 0.0, 0.0)
	};

	
	
	public void test() {
		for (int i = 0; i < serbatoi.length; i++) {
			serbatoi[i].setContenuto(50.0);
			
			if(i%2 == 0) {
				serbatoi[i].apri();
			}
			
			serbatoi[i].stampa();
		}
		
		
		assertFalse(serbatoi[0].pericolo());
		assertFalse(serbatoi[1].pericolo());
		assertFalse(serbatoi[2].pericolo());
		assertFalse(serbatoi[3].pericolo());
		assertFalse(serbatoi[4].pericolo());
	}
}
