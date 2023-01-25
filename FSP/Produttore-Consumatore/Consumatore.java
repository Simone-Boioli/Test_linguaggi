public class Consumatore extends Thread{
	Buffer b;

	public Consumatore(Buffer b){
		this.b = b;
	}	

	public void run(){
		while(true){
			int valore = b.leggiValore();
			consumaValore(valore);
		}
	}

	private void consumaValore(int val){
		System.out.println(val);
	}
}	
