import junit.framework.TestCase;


public class TestDomanda extends TestCase {
	Domanda domande = new Domanda("domanda di prova 1", "risposta di prova esatta");
	
	public void testValutaRisposta(){
		assertEquals(100.0, domande.valutaRisposta("risposta di prova esatta"));
		assertEquals(0.0, domande.valutaRisposta("risposta di prova sbagliata"));
	}
}
