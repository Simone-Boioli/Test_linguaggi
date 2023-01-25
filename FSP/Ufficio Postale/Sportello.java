
public class Sportello {
	private int turno;
	private int maxNumero;
	
	public Sportello(int maxNumero) {
		this.maxNumero = maxNumero;
	}
	
	public synchronized void servi(int biglietto) {
		while(biglietto!=turno) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Utente con biglietto " + biglietto + " servito");
		turno=(turno+1)%(maxNumero+1);
		notifyAll();
	}
}
