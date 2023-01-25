public class Start{
	public static void main(String[]args){
		PorteAutomatiche p1 = new PorteAutomatiche(1);
		PorteAutomatiche p2 = new PorteAutomatiche(2);

		p1.start();
		p2.start();
	}
}
