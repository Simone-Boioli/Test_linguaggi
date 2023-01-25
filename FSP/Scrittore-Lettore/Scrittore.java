public class  Scrittore extends Thread{
	private int valore;
	private Memoria mem;

	public Scrittore(Memoria m){
		mem = m;
	}

	
	public void run(){
		while(true){
			int v = produciValore();
			mem.scrivi(v);
		}
	}

	private int produciValore(){
		valore = (valore+1)%3;
		System.out.println("Prodotto valore: " + valore); 
		return valore;
	}

}
