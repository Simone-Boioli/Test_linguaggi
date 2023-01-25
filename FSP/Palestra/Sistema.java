
public class Sistema {
	private static final int NUMDONNE = 3;
	private static final int NUMUOMINI = 3;
	private static final int NVIP = 1;
	
	public static void main(String[] arg) {
		Spogliatoio s = new Spogliatoio();
		
		for (int i= 0; i < NUMDONNE ; )
		     new Donna (s, ++i).start();
		for (int i= 0; i < NUMUOMINI ; )
		     new Uomo (s, ++i).start();

	        new Vip (s).start();

	}
}
