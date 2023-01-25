public class ThreadRace {
	public static void main(String[]args){
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);  // viene assegnato al thread la proprità max(10)
		Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2); //viene passato al costructor di Clicker il valoe 7
		Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2); //viene passato al costructor di Clicker il valore 3
		lo.startThread();
		hi.startThread();
		try{
				Thread.sleep(10000);
		}                                              //il thread principale con priorità 10 va a dormire per 10 sec
		catch (Exception e){}
		lo.stopThread();
		hi.stopThread();
			System.out.println(lo.getClick()+"vs."+hi.getClick());
	}
}