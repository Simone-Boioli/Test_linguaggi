public class Processo extends Thread{
	private final int LEGGI = 0;
	private final int SCRIVI = 1;

	BasiDiDati b;

	public Processo(BasiDiDati b){
		this.b = b;
	}

	private int scegli(){
		if(Math.random() <= 0.5){
			return LEGGI;
		}else{
			return SCRIVI;
		}
	}

	public void run(){
		while(true){
			int rw = scegli();
			if(rw == LEGGI){
				b.iniziaLettura();
				b.fineLettura();
			}else{
				b.chiediScrittura();
				b.iniziaScrittura();
				b.fineScrittura();
			}
		}
	}
	
	
}
