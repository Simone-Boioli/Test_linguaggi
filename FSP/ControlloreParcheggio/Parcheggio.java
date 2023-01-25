public class Parcheggio{
	private int postiOccupati = 0;
	
	public synchronized void entra(int id){
		while(postiOccupati == 4){
			try{
				wait();
			}catch(Exception e){
			////
			}
		}
		System.out.println("auto con id " + id + " entrata");
		postiOccupati++;
		System.out.println("i posti occupati sono: " + postiOccupati);
		notify();
	}

	public synchronized void esci(int id){
		while(postiOccupati < 0){
			try{
				wait();
			}catch(Exception e){
			///
			}
		}
		System.out.println("auto con id " + id + " uscita");
		postiOccupati--;
		System.out.println("i posti occupati sono: " + postiOccupati);
		notify();
	}
}
