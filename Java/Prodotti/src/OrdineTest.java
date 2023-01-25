import junit.framework.TestCase;


public class OrdineTest extends TestCase {

	public void testAggiungiProdotto() {
		Prodotto prod = new Prodotto();
		Biscotti b = new Biscotti();
		Verdure v = new Verdure();
		
		Ordine o = new Ordine();
		
		o.aggiungiProdotto(b);
		o.aggiungiProdotto(v);
		
		int tot = o.getTotale();
		
		assertEquals(116, tot);
	}

}
