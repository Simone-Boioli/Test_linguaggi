import java.util.*;

public class Uomo extends Thread{
	private Random generator;
	private Spogliatoio s;
	private int id;
	private int dormi, cambi;
	 
	public Uomo (Spogliatoio sp, int uid) {
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
			s.entra(id, 2); // chiama metodo entra, con tipo 2, cioe' UOMO
			cambi = generator.nextInt(40);
                        try { // simula il tempo trascorso nello spogliatoio a cambiarsi
                        Thread.sleep (cambi);
                        }
                        catch(InterruptedException ie){}
			s.esci(id, 2); // chiama metodo esci
		}
	}
}
