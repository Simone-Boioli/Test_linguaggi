package SistemaConcorrente;


public class Medico {

	private int turno;
	private int maxPazienti;
	
	public Medico(int numPazienti) {
		
		this.maxPazienti = numPazienti;
	}

	public synchronized void visita(int priorita) {
		while(priorita != turno) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		turno = (turno+1) % (maxPazienti+1);
		
		notifyAll();
	}
}

