public class ThreadCreation implements Runnable{
	public static void main (String[]args){
		new ThreadCreation();
	}
	
	public ThreadCreation(){
		Thread ct = Thread.currentThread();
		ct.setName("Thread principale");
		Thread t = new Thread(this, "Thread figlio");
		System.out.println("Thread attuale: " + ct);
		System.out.println("Thread creato : " + t);
		t.start();
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			System.out.println("Thread interrotto");
		}
		System.out.println("Uscita thread principale");
	}
	
	public void run (){
		try{
			for(int i = 5; i>0; i--){
				System.out.println(" " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Thread interrotto");
		}
		System.out.println("Uscita thread figlio");
	}
}