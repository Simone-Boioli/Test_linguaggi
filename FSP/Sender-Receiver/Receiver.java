public class Receiver{
	int num = 0;
	
	public synchronized void invia(String msg){
		System.out.print(msg);
		num++;
		System.out.println(num);
	}
}
