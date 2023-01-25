public class Memoria{
	private int valore;
	private boolean pieno = false;
	private int valLeggere = 0;
	
	public synchronized void scrivi(int v){
		while(pieno == true){
			try{
				wait();
			}catch(InterruptedException e){	
				///	
			}
			pieno = true;
			valore = v; 
			notify();
		}
	}

	public synchronized int leggi(){
		while(pieno == false && valore != valLeggere){
			try{
				wait();
			}catch(InterruptedException e){
				///
			}
		}
		pieno = false;
		this.valLeggere = (valLeggere+1)%3;
		notify();
		return valore;
	}
}
