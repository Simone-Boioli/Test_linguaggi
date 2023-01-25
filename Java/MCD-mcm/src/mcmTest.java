import junit.framework.TestCase;


public class mcmTest extends TestCase {

	public void testCalcolaMcm() {
		mcm minimoComuneMultiplo = new mcm();
		long risultato = minimoComuneMultiplo.calcolaMcm(12,6);
		TestCase.assertEquals(12, risultato);   
		risultato = minimoComuneMultiplo.calcolaMcm(4,2);
		TestCase.assertEquals(4, risultato);
	}

}
