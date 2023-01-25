package SistemaConcorrente;

public class Calendario {

	int maxAppuntamenti;
	int appuntamenti;
	int maxPriorita;
	int priorita;
	
	public Calendario(int maxAppuntamenti, int priorita){
		
		this.maxAppuntamenti = maxAppuntamenti;
		this.priorita = priorita;
		
		this.appuntamenti = 0;
		this.maxPriorita = priorita;
	}
	
	public synchronized int chiediAppuntamento(int id){
		
		while( appuntamenti == maxAppuntamenti ){
			
			try{
				wait();
				
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		appuntamenti++;
		priorita = (priorita + 1) % (maxPriorita + 1);
		
		System.out.println("Assegnata priorita" + priorita + " al paziente con id: " + id);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return priorita;
	}
	
	public synchronized void esci(){
		
		appuntamenti--;
		notify();
	}
}