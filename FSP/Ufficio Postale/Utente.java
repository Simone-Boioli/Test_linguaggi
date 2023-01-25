
public class Utente extends Thread {

	Ufficio ufficio;
	Sportello sportello;
	
	public Utente(Ufficio ufficio, Sportello sportello) {
		this.sportello = sportello;
		this.ufficio = ufficio;
	}
	
	
	public void run() {
		while(true) {
			int biglietto = ufficio.entra();
			sportello.servi(biglietto);
			ufficio.esci();
		}
	}
	
}
