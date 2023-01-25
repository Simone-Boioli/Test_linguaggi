
public class Persona extends Thread{
	
	Piazza piazza;
	Teatro teatro;
	
	public Persona(Piazza piazza, Teatro teatro) {
		this.piazza = piazza;
		this.teatro = teatro;
	}
	
	public void run() {
		while(true) {
			piazza.entra();
			if(Math.random()<0.5) {
				teatro.entra();
				teatro.esci();
			}
			piazza.esci();
		}
	}
	
}
