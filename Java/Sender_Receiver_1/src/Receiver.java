
public class Receiver {
	int numMex;
	public void invia(String msg){
		synchronized(this){
			System.out.println(msg);
			this.numMex ++;
			System.out.println(numMex + "\n");
			
		}
	}
}
