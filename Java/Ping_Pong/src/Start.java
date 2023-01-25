
public class Start {

	public static void main(String[] args) {
		Receiver r = new Receiver();
		
		Ping ping = new Ping(r);
		Pong pong = new Pong(r);
		
		ping.start();
		pong.start();

	}

}
