public class Start{
	public static void main(String[]args){
		Receiver r = new Receiver();
		Sender1 s1 = new Sender1(r);
		Sender2 s2 = new Sender2(r);

		s1.start();
		s2.start();
	}
}
