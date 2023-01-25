public class Contenitore{
	private int capienza;
	private int livello;


	public Contenitore(int max){
		capienza = max;
		livello = max;
	}

	public synchronized void  preleva(){
		while(livello == 0){		
			try{
				wait();
			}catch(Exception e){}
		}
		
		livello --;
		if(livello == 0){
			notifyAll();
		}
	}


	public synchronized void rifornisci(){
		while(livello > 0){
			try{
				wait();
			}catch(Exception e){}
		}

		livello = capienza;
		notifyAll();
	}
}
