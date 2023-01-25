
public class Vigile extends Thread {
	Piazza piazza;
	
	public Vigile(Piazza piazza) {
		this.piazza = piazza;
	}
	
	public  void run() {
		while(true) {
			piazza.apri();
			piazza.chiudi();
		}
	}
}
