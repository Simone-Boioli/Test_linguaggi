import junit.framework.TestCase;



public class Test extends TestCase {
	private Persona fabio;
	private Persona paolo;

	Utilitaria polo;
	FuoriSerie brera;

	private double poloVelocita = 0.5;
	private double breraVelocita = 4.0;

	
	public void setUp() throws Exception {
		fabio = new Persona("fabio", "rossi", 1000);
		paolo = new Persona("paolo", "bitta", 20000);
		polo = new Utilitaria("wolkswagen", "polo", 1200, fabio);
		brera = new FuoriSerie("alfa romeo" , "brera", 3200, paolo);
	}
	
	public void test() {
		polo.accellera();
		brera.accellera();
		brera.accellera();

		assertEquals(poloVelocita, polo.getVelocità(), 0.1);
		assertEquals(breraVelocita, brera.getVelocità(), 0.1);

		brera.cambiaProprietà(fabio);

		assertEquals("Il proprietario e' ancora Paolo", paolo.getNome(), brera.getProprietario().getNome());
	}

}
