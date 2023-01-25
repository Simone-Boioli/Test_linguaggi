
public class Sender2 extends Thread {
	Receiver r;
	
	public Sender2(Receiver r){
		this.r = r;
	}
	
	public void run(){
		while(true){
			String msg = "<SOAP>";
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
