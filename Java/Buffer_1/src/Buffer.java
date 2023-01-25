
public class Buffer {
	int val;
	boolean pieno = false;
	
	public void memorizza(int v){
		synchronized(this){
			while(pieno == true){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			this.val = v;
			pieno = true;
			this.notify();
		}
	}
	
	public int legge(){
		synchronized(this){
			while(pieno == false){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			pieno = false;
			this.notify();
			return val;
		}
	}
}
