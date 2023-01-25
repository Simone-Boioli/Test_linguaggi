
public class Receiver {
	int mexPing = 0;
	int mexPong = 0;
	
	public void invia(String s){
		synchronized (this){
			if(s.equals("pong")){
				mexPong ++;
			}else{
				mexPing ++;
			}
			
			System.out.println(s);
			System.out.println("Mex Ping: " + mexPing + " Mex Pong: " 
			                   + mexPong + " Differenza tra ping e pong: " + (mexPing - mexPong) + "\n");
		}
	}
}
