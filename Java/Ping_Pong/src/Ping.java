
public class Ping extends Thread {
	Receiver r;
	
	public Ping(Receiver r){
		this.r = r;
	}
	
	public void run(){
		while(true){
			String msg = "ping";
			r.invia(msg);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
