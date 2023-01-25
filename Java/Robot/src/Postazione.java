
public class Postazione {
	boolean occupato = false;
	
	
	public void op1(){
		System.out.println("op1");
	}
	
	public void op2(){
		System.out.println("op2");
	}
	
	public synchronized void acquisisci(){
		while(occupato == true){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		occupato = true;
		
	}
	
	
	public synchronized void rilascia(){
		occupato = false;
		notify();
	}
}
