
//TEST
import junit.framework.TestCase;


public class TestOrdine extends TestCase {
	public void testUnOrdine(){
		Verdura v=new Verdura();
		Biscotti b=new Biscotti();
		Ordine unOrdine=new Ordine();
		unOrdine.aggiungiProdotto(v);
		unOrdine.aggiungiProdotto(b);
		assertEquals(12,unOrdine.getPrezzo());     //verifica che l'ordine faccia 12
	}
}
