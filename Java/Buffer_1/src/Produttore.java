
public class Produttore extends Thread{
	Buffer b = new Buffer();
	int val;
	
	public Produttore(Buffer b){
		this.b = b;
	}
	
	public void run(){
		while(true){
			int p = produci();
			b.memorizza(p);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int produci(){
		val = (val + 1);
		return val;
	}
}
