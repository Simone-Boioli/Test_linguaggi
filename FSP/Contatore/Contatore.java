public class Contatore{
	
	int count = 0;

	public synchronized void incrementa(){
		count ++;

		System.out.println(count);
	}
}
