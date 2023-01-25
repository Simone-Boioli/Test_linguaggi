public class Start{
	public static void main(String[]args){
		int nThread = 5;

		Contatore c = new Contatore();
	
		for(int i = 0; i < nThread; i++){
			Incrementa incr = new Incrementa(c);
			incr.start();
		}
	}
}
