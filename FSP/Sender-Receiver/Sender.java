public class Sender1 extends Thread{
	
	Receiver r;

	public Sender1(Receiver r){
		this.r = r;
	}	

	public void run(){
		while(true){
			String http = produciHttp();
			r.invia(http);
		}	
	}

	private String produciHttp(){
		return ("Http");
	}
} 
