public class Postazione{
	boolean occupato = false;

	public synchronized void acquisisci(){
		while(occupato = true){
			try{	
				wait();
			}catch(InterruptedException e){
				////
			}
		}
	
		occupato = true;
	}

	public synchronized void rilascia(){
		occupato = false;	
		notify();
	}

	public void op1(int id){
		System.out.println(id + " svolge operazione 1");
	}

	public void op2(int id){
		System.out.println(id + " svolge operazione 2");
	}
}
