public class Lettore extends Thread{
	private Memoria mem;
	private int valore;

	public Lettore(Memoria m){
		mem = m;
	}

	public void run(){
		while(true){
			valore = mem.leggi();
			stampa(valore);
		}
	}

	private void stampa(int v){
		System.out.println("letto valore: " + v);
	}
}
