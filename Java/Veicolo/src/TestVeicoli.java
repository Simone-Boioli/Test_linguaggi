import junit.framework.TestCase;


public class TestVeicoli extends TestCase {
	public  void testDisegno(){
		Veicolo[] parcoMacchine = new Veicolo[] {
			new Auto(123, "Ada", "Sport"),
			new Auto(345, "Ugo", "Familiare"),
			new Camion(567, "Mario", 4),
			new Moto(102, "Ido", 2),
			new Auto(456, "Franco", "Utilitaria"),
			new Camion(876, "Max", 3),
			new Moto(451, "Lia", 1)
		};
		assertEquals(parcoMacchine[0].disegna(), "disegno di un'auto");
		assertEquals(parcoMacchine[2].disegna(), "disegno di un camion");
		assertEquals(parcoMacchine[3].disegna(), "disegno di una moto biposto");
		assertEquals(parcoMacchine[6].disegna(), "disegno di una moto monoposto");
	}

	public void testCambioPostiMoto() {
		Veicolo[] parcoMacchine = new Veicolo[] {
			new Auto(123, "Ada", "Sport"),
			new Auto(345, "Ugo", "Familiare"),
			new Camion(567, "Mario", 4),
			new Moto(102, "Ido", 2),
			new Auto(456, "Franco", "Utilitaria"),
			new Camion(876, "Max", 3),
			new Moto(451, "Lia", 1)
		};
		
		((Moto)parcoMacchine[3]).setNumPosti(1);
		
		assertEquals(parcoMacchine[3].disegna(), "disegno di una moto monoposto");
	}

	public void testCambioProprietarioAuto() {
		Veicolo[] parcoMacchine = new Veicolo[] {
			new Auto(123, "Ada", "Sport"),
			new Auto(345, "Ugo", "Familiare"),
			new Camion(567, "Mario", 4),
			new Moto(102, "Ido", 2),
			new Auto(456, "Franco", "Utilitaria"),
			new Camion(876, "Max", 3),
			new Moto(451, "Lia", 1)
		};
		
		parcoMacchine[1].setProprietario("Luigi");
		
		assertEquals(parcoMacchine[1].getProprietario(), "Luigi");
	}

	public void testMatricola() {
		Veicolo[] parcoMacchine = new Veicolo[] {
			new Auto(123, "Ada", "Sport"),
			new Auto(345, "Ugo", "Familiare"),
			new Camion(567, "Mario", 4),
			new Moto(102, "Ido", 2),
			new Auto(456, "Franco", "Utilitaria"),
			new Camion(876, "Max", 3),
			new Moto(451, "Lia", 1)
		};
		
		
		assertEquals(parcoMacchine[0].getNumMatricola(), 123);
		assertEquals(parcoMacchine[2].getNumMatricola(), 567);
		assertEquals(parcoMacchine[3].getNumMatricola(), 102);
	}

}
