import junit.framework.TestCase;


public class TestBiblioteca extends TestCase {

	public void testPrestito(){
		Utente sig = new Utente("Mario Rossi", 600);
		Libro l1 = new Libro("titolo1", 150);
		Libro l2 = new Libro("titolo2", 170);
		Libro l3 = new Libro("titolo3", 250);
		Rivista r1 = new Rivista("titolo 4", 180, 2);
		
		assertTrue(sig.prendiInPrestito(l1));
		assertTrue(sig.prendiInPrestito(l2));
		assertTrue(sig.prendiInPrestito(l3));
		assertFalse(sig.prendiInPrestito(r1));
	}
}
