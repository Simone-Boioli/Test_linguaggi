public class Ping extends Thread{
		Receiver r;
	
		public Ping(Receiver r){
			this.r = r;
		}
		
		public void run(){
			while(true){
				String ping = generaPing();
				r.invia(ping);
			}
		}
		
		public String generaPing(){
			return("ping");
		}
}