
public class Auto extends Thread {
	Parcheggio p = new Parcheggio();
	
	public Auto(Parcheggio p){
		this.p = p;
	}
	
	public void run(){
		while(true){
			p.entra();
			p.esci();
		}
	}
}
