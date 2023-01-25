public class P extends Thread{
	Risorsa r;
	String nome;

	public P(Risorsa r, String nome){
		this.r = r;
		this.nome = nome;
	}

	public void run(){
		while(true){
			synchronized(r){	
				r.doA(nome);
				r.doB(nome);
			}
		}
	}
} 
