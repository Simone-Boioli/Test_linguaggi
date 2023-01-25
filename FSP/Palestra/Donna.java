import java.util.*;

public class Donna extends Thread{
	private Random generator;
	private Spogliatoio s;
	private int id, dormi, cambi;
	 
	public Donna (Spogliatoio sp, int uid) {
		id = uid;
		s = sp;
                generator = new Random();
	}
	
	public void run() {
		while(true) {
			dormi = generator.nextInt(80);
                        try { // simula una pausa tra un ingresso e il successivo
                        Thread.sleep (dormi);
                        }
                        catch(InterruptedException ie){}
			s.entra(id, 1); // chiama metodo entra, con tipo 1, cioe' DONNA
			cambi = generator.nextInt(80);
                        try { // simula il tempo trascorso nello spogliatoio a cambiarsi
                        Thread.sleep (cambi);
                        }
                        catch(InterruptedException ie){}
			s.esci(id, 1); // chiama metodo esci
		}
	}
}
