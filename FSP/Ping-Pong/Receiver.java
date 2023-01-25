public class Receiver{
	private int nPing = 0;
	private int nPong = 0;
	private int differenza;
	
	public synchronized void invia(String msg){
		if(msg.equals("ping")){
			nPing++;
		}else{
			nPong++;
		}
		
		differenza = nPing - nPong;
		System.out.println(msg + " " + differenza);
	}
}