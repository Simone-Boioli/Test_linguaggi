public class BasiDiDati{
	private int lettori = 0;
	boolean richiestaScrittura = false;
	boolean inScrittura = false;

	public synchronized void iniziaLettura(){
		while(richiestaScrittura == false || inScrittura == false){
			try{
				wait();
			}catch(Exception e){}
		}
	
		lettori ++;
		System.out.println("INIZIO LETTURA");
	}

	public synchronized void fineLettura(){
		lettori --;
		if(lettori == 0){
			notifyAll();
		}
	}

	public synchronized void chiediScrittura(){
		while(richiestaScrittura == true){
			try{
				wait();
			}catch(Exception e){}
		}
		richiestaScrittura = true;
		System.out.println("RICHIESTA SCRITTURA");
	}

	public synchronized void iniziaScrittura(){
		while(inScrittura == true || lettori > 0){
			try{
				wait();
			}catch(Exception e){}
		}
		richiestaScrittura = false;
		inScrittura = false;
		notifyAll();
		System.out.println("INIZIO SCRITTURA");
	}

	public synchronized void fineScrittura(){
		inScrittura = false;
		System.out.println("FINE SCRITTURA");
		notifyAll();
	}
}
