
public class Teatro {

	private static final int CAPIENZA = 2;
	int numPersone  = 0;
	
	public synchronized void entra() {
		while(numPersone==CAPIENZA) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		numPersone++;
		
	}
	
	public synchronized void esci() {
		numPersone--;
		notify();
	}
}
