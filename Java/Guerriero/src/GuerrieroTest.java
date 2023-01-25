import junit.framework.TestCase;


public class GuerrieroTest extends TestCase {
	public void testBho(){
		Guerriero g1=new Guerriero(100,"conan",new Mazza(50),new CorazzeDiCuoio());
		Guerriero g2=new Guerriero(150,"batman",new Spada(5,7),new CorazzaDiPiastre());

		
		do{
			System.out.println(g1.attacca(g2));
				
		}while(g1.getResistenza()>0 && g2.getResistenza()>0);
	}
}
