public class Utente extends Thread{
	Contenitore c;
	int utente;

	public Utente(Contenitore c, int utente){
		this.c = c;
		this.utente = utente;
	}

	public void run(){
		while(true){
			c.preleva();
			elabora();
		
			try{
				Thread.sleep(1000);
			}catch(Exception e){}	
		}
	}

	public void elabora(){
		System.out.println(utente + " elabora");
	}
}
