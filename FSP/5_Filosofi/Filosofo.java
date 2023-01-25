public class Filosofo extends Thread{
	private int id;
	private Forchetta sinistra;
	private Forchetta destra;

	public Filosofo(int id, Forchetta s, Forchetta d){
		this.id = id;
		this.sinistra = s;
		this.destra = d;
	}

	public void run(){
		try{
			while(true){
				sleep(20);
				destra.prendi();
				sleep(500);
				sinistra.prendi();
				sleep(1000);
				destra.lascia();
				sinistra.lascia();
			}
		}catch(InterruptedException e){}
	}	
}
