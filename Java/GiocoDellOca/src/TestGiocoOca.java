import junit.framework.TestCase;


public class TestGiocoOca extends TestCase {
	public void testPartita(){
		Pedina p1 = new Pedina("giallo");
		Pedina p2 = new Pedina("bianco");
		Pedina p3 = new Pedina("verde");
		
		GiocoDellOca partita = new GiocoDellOca(6);
		
		partita.aggiungiPedina(p1);
		partita.aggiungiPedina(p2);
		partita.aggiungiPedina(p3);
		
		Pedina vincitore = null;
		while(vincitore == null){
			vincitore = partita.giocaTurno();
		}
		assertTrue(vincitore.getCasellaCorrente()>6);
	}
}
