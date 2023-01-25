public class PorteAutomatiche extends Thread{
	private int i;

	public PorteAutomatiche(int i){
		this.i = i;
	}

	private void apri(){
		System.out.println("Porta " + i + " aperta");  
	}

	private void chiudi(){
		System.out.println("Porta " + i + " chiusa");
	}

	public void run(){
		while(true){
			apri();
			chiudi();
		}
	}
}
