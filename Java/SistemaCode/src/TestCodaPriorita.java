import junit.framework.TestCase;


public class TestCodaPriorita extends TestCase {
	public void testPrioritaRispettata(){    //il metodo deve iniziare con test e non deve avere parametri
		//creo una coda
		CodaConPriorita cp = new CodaConPriorita();
		//creao delle persone
		Persona p1 = new Persona("Marco",31);
		Persona p2 = new Persona("Mario",27);
		Persona p3 = new Persona("Giovanni",18);
		Persona p4 = new Persona("Mattia",54);
		Persona p5 = new Persona("Gian",64);
		//aggiungi nella coda le persone
		cp.aggiungiPersona(p1);
		cp.aggiungiPersona(p2);
		cp.aggiungiPersona(p3);
		cp.aggiungiPersona(p4);
		cp.aggiungiPersona(p5);
		
		assertEquals(p5, cp.restituisciPersona());  //devere restituire l'ultima persona che ha più di 60 anni
	}
}
