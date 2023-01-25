
public class Parcheggio {
	private int postiOccupati = 0;
	
	public synchronized void entra(){
		while(postiOccupati == 4){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		postiOccupati++;
		System.out.println("macchina entrata, i posti occupati sono: " + postiOccupati);
		this.notifyAll();
	}
	
	public synchronized void esci(){
		while(postiOccupati == 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		postiOccupati--;
		System.out.println("macchina uscita, i posti occupati sono: " + postiOccupati);
		this.notify();
	}
}
