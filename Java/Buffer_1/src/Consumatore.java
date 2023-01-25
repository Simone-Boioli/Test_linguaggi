
public class Consumatore extends Thread{
	Buffer b = new Buffer();
	
	public Consumatore(Buffer b){
		this.b = b;
	}
	
	public void run(){
		while(true){
			int val = b.legge();
			consuma(val);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void consuma(int val){
		System.out.println(val);
	}
	
}
