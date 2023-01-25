
public class Lampadina extends Thread{
	private int num;
	
	public Lampadina(int num){
		this.num = num;
	}
	
	public void accendi(){
		System.out.println("Lampadina " + num + " accesa");
	}
	
	public void spegni(){
		System.out.println("Lampadina " + num + " spenta");
	} 
	
	public void run(){
		while(true){
			accendi();
			
			int sec = 1000 + (int)Math.random() * 1000;
			
			try {
				Thread.sleep(sec);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			spegni();
		}
	}
}
