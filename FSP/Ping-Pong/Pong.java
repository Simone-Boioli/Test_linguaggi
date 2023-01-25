public class Pong extends Thread{
	Receiver r;
	
	public Pong (Receiver r){
		this.r = r;
	}
	
	public void run(){
		while(true){
			String pong = generaPong();
			r.invia(pong);
		}
	}
	
	public String generaPong(){
		return("pong");
	}
}