import java.util.*;

public class Vip extends Thread{
	private Random generator;
	private Spogliatoio s;
	private int id, dormi, cambi;
	 
	public Vip (Spogliatoio sp) {
		id = 10;
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
			s.entra(id, 3); // chiama metodo entra, con tipo 3, cioe' VIP
			cambi = generator.nextInt(80);
                        try { // simula il tempo trascorso nello spogliatoio a cambiarsi
                        Thread.sleep (cambi);
                        }
                        catch(InterruptedException ie){}
			s.esci(id, 3); // chiama metodo esci
		}
	}
}
