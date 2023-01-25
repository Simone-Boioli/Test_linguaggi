
public class Ufficio {

	int capienza;
	int nPersone = 0;
	int proxBiglietto = 0;
	int maxNumBig;
	
	public Ufficio(int capienza, int maxNumBig) {
		this.capienza = capienza;
		this.maxNumBig = maxNumBig;
		proxBiglietto = maxNumBig;
	}
	
	public synchronized int  entra() {
		while(nPersone==capienza) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		nPersone++;
		proxBiglietto = (proxBiglietto+1)%(maxNumBig+1);
		System.out.println("Assegnato il biglietto " + proxBiglietto + ". Persone presenti nell'ufficio " + nPersone);
		
		return proxBiglietto;
	}
	
	public synchronized void esci() {
		nPersone--;
		notify();
	}
	
}
