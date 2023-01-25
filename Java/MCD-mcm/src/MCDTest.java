import junit.framework.TestCase;


public class MCDTest extends TestCase {

	public void testCalcoloMCD() {
		MCD maxComuneDivisore = new MCD();
		long risultato = maxComuneDivisore.calcoloMCD(12,6);
		TestCase.assertEquals(6, risultato);
	}

}
