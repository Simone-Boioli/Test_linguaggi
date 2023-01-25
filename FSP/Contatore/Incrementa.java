public class Incrementa extends Thread{
	Contatore c;

	public Incrementa(Contatore c){
		this.c = c;
	}

	public void run(){
		for(int i = 0; i < 10; i++){
			c.incrementa();
		}
	}
}	
