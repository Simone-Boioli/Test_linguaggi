import junit.framework.TestCase;


public class TestLettoreDvd extends TestCase {

	public void testInserisciDvd() {
		LettoreDvd lettore = new LettoreDvd (0);
		
		Dvd dvd = new Dvd(0,"Madagascar",88);
		
		boolean inserisciDvd = lettore.inserisciDvd(dvd);
		boolean reinserisciDvd = lettore.inserisciDvd(dvd);
		
		assertTrue(inserisciDvd);
		assertFalse(reinserisciDvd);
	}

	public void testRimuoviDvd() {
		LettoreDvd lettore = new LettoreDvd(0);
		
		Dvd dvd = new Dvd(0,"Madagascar",88);
		
		Dvd nessunDvd = lettore.rimuoviDvd();
		
		lettore.inserisciDvd(dvd);
		
		Dvd dvdInserito = lettore.rimuoviDvd();
		
		assertEquals(nessunDvd, null);
		assertEquals(dvdInserito, dvd);
	}
	
	
	
	public void testPlayStop() {
		LettoreDvd lettore = new LettoreDvd(0);
		
		Dvd dvdSameRegion = new Dvd(0,"Madagascar",88);
		Dvd dvdDifferentRegion = new Dvd (3, "L'altra sporca ultima meta", 113);
		
		boolean noDvdPlay = lettore.play();
		boolean noDvdStop = lettore.stop();
		
		lettore.inserisciDvd(dvdSameRegion);
		
		boolean sameRegionPlay = lettore.play();
		boolean sameRegionStop = lettore.stop();
		
		lettore.rimuoviDvd();
		lettore.inserisciDvd(dvdDifferentRegion);
		
		boolean differentRegionPlay = lettore.play();
		boolean differentRegionStop = lettore.stop();
		
		assertFalse(noDvdPlay);
		assertFalse(noDvdStop);            
		assertTrue(sameRegionPlay);
		assertTrue(sameRegionStop);
		assertFalse(differentRegionPlay); //  ???
		assertFalse(differentRegionStop); //  ???
	}

}
