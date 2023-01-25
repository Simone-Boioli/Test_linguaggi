public class Start{
	public static void main(String[]args){
		Parcheggio p = new Parcheggio();
		Auto a1 = new Auto(p, 1);
		Auto a2 = new Auto(p, 2);
		Auto a3 = new Auto(p, 3);
		Auto a4 = new Auto(p, 4);
		Auto a5 = new Auto(p, 5);
		Auto a6 = new Auto(p, 6);

		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
		a6.start();
	}
}
