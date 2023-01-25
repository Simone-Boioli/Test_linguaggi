
public class Sender1 extends Thread {
	Receiver r;
	
	public Sender1(Receiver r){
		this.r = r;
	}
	
	public void run(){
		while(true){
			String msg = "Http";
			r.invia(msg);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
