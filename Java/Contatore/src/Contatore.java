
public class Contatore {
	int count = 0;
	
	public void incrementa(){
		synchronized (this){
			
			try {
				count ++;
				System.out.println(count);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
