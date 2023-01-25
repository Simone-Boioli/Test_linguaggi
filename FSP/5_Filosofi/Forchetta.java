public class Forchetta{
	
	private boolean preso = false;
	private int id;

	public Forchetta(int id){
		this.id = id;
	}
	
	public synchronized void prendi(){
		while(preso = true){
			try{
				wait();
			}catch(Exception e){}
		}
		preso = true;
	}
		

	public synchronized void lascia(){
		preso = false;
		notifyAll();
	}
}
