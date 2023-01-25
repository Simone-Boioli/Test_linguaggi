public class Lampadina extends Thread{
	int i;

	public Lampadina(int i){
		this.i = i;		
	}
	public void accendi(){
		System.out.println("accesa"+i);	
	}
	
	public void spegni(){
		System.out.println("spenta"+i);
	}

	public void run(){
		while(true){
			accendi();
			spegni();
		}
	}
}

