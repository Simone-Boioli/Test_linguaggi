public class Sender2 extends Thread{
	
	Receiver r;

	public Sender2(Receiver r){
		this.r = r;
	}

	public void run(){
		while(true){
			String soap = produciSoap();
			r.invia(soap);
		}
	}

	public String produciSoap(){
		return("Soap");
	}
}
