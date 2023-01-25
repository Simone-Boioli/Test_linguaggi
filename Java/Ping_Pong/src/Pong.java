
public class Pong extends Thread {
	Receiver r;
	
	public Pong (Receiver r){
		this.r = r;
	}
	
	public void run(){
		while(true){
			String msg = "pong";
			r.invia(msg);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
