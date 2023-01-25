
public class Start{
	private static final int numThread = 1000;
	
	public static void main(String[] args) {
		Contatore c = new Contatore();
		for(int i = 0; i < numThread; i++){
			Incrementa in = new Incrementa(c);
			in.start();
		}

	}

}
