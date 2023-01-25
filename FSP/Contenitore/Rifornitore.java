public class Rifornitore extends Thread{
	Contenitore c;

	public Rifornitore(Contenitore c){
		this.c = c;
	}

	public void run(){
		while(true){
			c.rifornisci();
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
		}
	}

}
