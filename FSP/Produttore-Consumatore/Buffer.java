public class Buffer{
	private int valore;
	boolean pieno = false; // all'inizio il buffer è vuoto

	public synchronized void memorizzaValore(int val){
		while(pieno == true){
			try{
				wait();
			}catch(InterruptedException e){
				////
			}
		}
		valore = val;
		pieno = true;
		notify();
	}	

	public synchronized int leggiValore(){
		while(pieno == false){
			try{
				wait();
			}catch(InterruptedException e){
				////
			}
		}
		pieno = false; //ho svuotato il buffer
		notify();
		return valore;
	}
}
