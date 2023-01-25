public class Produttore extends Thread{
	Buffer b;
	int valore;

	public Produttore(Buffer b){
		this.b = b;
	}

	public void run(){
		while(true){
			int val = produciValore();
			b.memorizzaValore(valore);	 	
		}
	}

	private int produciValore(){
		valore = (valore +1) % 100;	
		return valore;
	}

