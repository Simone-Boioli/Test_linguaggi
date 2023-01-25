public class Start{
	public static void main(String [] args){
		Coordinatore c = new Coordinatore();
		Postazione p = new Postazione();
		Robot r1 = new Robot(p, c, 0);
		Robot r2 = new Robot(p, c, 1);
		Robot r3 = new Robot(p, c, 2);
		Robot r4 = new Robot(p, c, 3);
	
		r1.start();
		r2.start();
		r3.start();
		r4.start();

	}
}	
