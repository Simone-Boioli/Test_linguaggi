import junit.framework.TestCase;

public class TestTriangoli extends TestCase {

	public void testPerimetro() {
		TriangoloScaleno triangoli[] = {
			new TriangoloScaleno(2.3, 4.5, 6.67),
			new TriangoloIsoscele(13.4, 5.333),
			new TriangoloRettangolo(3.45, 8.91)
		};

		assertEquals(triangoli[0].getPerimetro(), 13.47, 0.1);
		assertEquals(triangoli[1].getPerimetro(), 32.133, 0.1);
		assertEquals(triangoli[2].getPerimetro(), 21.9146, 0.1);
	}

	public void testToString() {
		TriangoloScaleno triangoli[] = {
			new TriangoloScaleno(2.3, 4.5, 6.67),
			new TriangoloIsoscele(13.4, 5.333),
			new TriangoloRettangolo(3.45, 8.91)
		};
		
		assertEquals(triangoli[0].toString(), "Triangolo scaleno di lati: 2.3 , 4.5 , 6.67");		
		assertEquals(triangoli[1].toString(), "Triangolo isoscele di lati: 13.4 , 13.4 , 5.333");	
		assertEquals(triangoli[2].toString(), "Triangolo rettangolo di lati: 3.45 , 8.91 , 9.554611452068578");
	}
}
