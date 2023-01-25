
public class Coordinatore {
	int turno = 0; 
	
	public synchronized void avvia(int id){
		while(turno != id){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		turno = (turno +1) % 4;
		System.out.println("robot " + turno + " avviato");
		notifyAll();
	}
}
