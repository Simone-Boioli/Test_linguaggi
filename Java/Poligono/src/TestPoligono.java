import junit.framework.TestCase;


public class TestPoligono extends TestCase {
	public void testRettangolieTriangoli(){
		//creo un arrey di 2 poligoni
		Poligono[]poligoni=new Poligono[2];//2= 2 riferimenti di tipo Poligono
		poligoni[0]=new Triangolo(1.0, 2.0);  //creo un Triangolo --upcasting
		poligoni[1]=new Rettangolo(2.0, 3.0);  //creo un rettangolo
		double a0=poligoni[0].area();
		double a1=poligoni[1].area();
		
		assertEquals(1.0,a0);    //test
		assertEquals(6.0,a1);    //test
	}
}
