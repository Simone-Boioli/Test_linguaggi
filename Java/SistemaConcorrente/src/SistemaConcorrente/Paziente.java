package SistemaConcorrente;

public class Paziente extends Thread{

	private int id;
	private String etichetta;
	private boolean visitaFinita;////////////
	
	Calendario calendario;
	Medico medico;
	
	public Paziente(Calendario calendario, Medico medico, int id, String etichetta){
		this.calendario = calendario;
		this.medico = medico;
		this.id = id;
		this.etichetta = etichetta;
		visitaFinita = false;
	}
	
	public void run(){
		while(visitaFinita == true){
			int priorita = calendario.chiediAppuntamento(id);
			medico.visita(priorita);
			
			System.out.println( "Il paziente " + id + "e' stato visitato" );
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			calendario.esci();
		}
	}
}
