
public class Produttore extends Thread {
	Buffer b = new Buffer();
	int v;
	
	public Produttore(Buffer b){
		this.b = b;
	}
	
	public void run(){
		while(true){
			int val = produci();
			b.deposita(val);
		}
	}
	
	public int produci(){
		v = (v + 1) %100;
		return v;
	}
}
