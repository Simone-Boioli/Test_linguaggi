
public class Consumatore extends Thread {
	Buffer b = new Buffer();
	
	public Consumatore(Buffer b){
		this.b = b;
	}
	
	public void run(){
		while(true){
			int val = b.leggi();
			consuma(val);
		}
	}
	
	public void consuma(int val){
		System.out.println(val);
	}
}
