import junit.framework.TestCase;

public class TestSmistaPosta extends TestCase {
	public void testLettere(){
		CentraleSmistaPosta c = new CentraleSmistaPosta("COD");
		Lettera l1 = new Lettera("paperino", "topolino");
		Lettera l2 = new LetteraPrioritaria("m1", "d1", 3);
		l2.setRitornoAlMittente(true);
		Lettera l3 = new LetteraPrioritaria("m2", "d2", 3);
		Lettera l4 = new LetteraPrioritaria("m3", "d3", 3);
		c.riceviLettera(l1);
		c.riceviLettera(l2);
		c.riceviLettera(l3);
		c.riceviLettera(l4);
		assertEquals(c.smistaLettera(), l3);
		assertEquals(c.smistaLettera(), l4);
		assertEquals(c.smistaLettera(), l1);
		assertEquals(c.smistaLettera(), l2);
	}

}
