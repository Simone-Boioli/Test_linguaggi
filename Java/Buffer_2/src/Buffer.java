
public class Buffer {
	int val;
	boolean pieno = false;
	
	public void deposita(int valore){
		synchronized(this){
			while(pieno == true){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			val = valore;
			notifyAll();
			pieno = true;
			
		}
	}
	
	
	public int leggi(){
		synchronized(this){
			while(pieno = false){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			pieno = false;
			notifyAll();
			return val;
		}
	}
}
