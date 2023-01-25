
public class Start {
	private static final int NUMROBOT = 4;
	
	public static void main(String[] args) {
			Coordinatore c = new Coordinatore();
			Postazione p = new Postazione();
			
			for(int i = 0; i<NUMROBOT; i++) {
				new Robot (c,p,i).start();
			}
		
	}

}
