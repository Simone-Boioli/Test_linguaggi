
public class Start {
	public static void main(String[] args) {
		Parcheggio p = new Parcheggio();
		
		Auto a1 = new Auto(p);
		Auto a2 = new Auto(p);
		Auto a3 = new Auto(p);
		Auto a4 = new Auto(p);
		Auto a5 = new Auto(p);
		Auto a6 = new Auto(p);
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
		a6.start();

	}

}
