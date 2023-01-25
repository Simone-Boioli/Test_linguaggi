
public class Piazza {
	
	private static final int CAPIENZA = 3;
	
	int numPersone = 0;
	boolean aperta = false;
	
	public synchronized void entra() {
		while((numPersone==CAPIENZA) || (!aperta)) {
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
	
	public synchronized void apri() {
		aperta = true;
		notifyAll();
	}
	
	public synchronized void chiudi() {
		aperta = false;
	}
	
	
}
