package SistemaConcorrente;


public class StudioMedico {

	private static final int NUM_PAZIENTI = 10;
	private static final int MAX_APPUNTAMENTI = 8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medico m = new Medico(NUM_PAZIENTI);
		Calendario c = new Calendario(MAX_APPUNTAMENTI,NUM_PAZIENTI);
		
		for(int i =0; i<NUM_PAZIENTI;++i) {
			
			new Paziente(c,m,i,"").start();
		}
	}
}
