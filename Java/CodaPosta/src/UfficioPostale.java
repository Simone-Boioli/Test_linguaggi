
public class UfficioPostale {
	public static void main(String[] args) {
		Coda coda = new Coda();
		
		Cliente cliente1 = new Cliente("Mario", "rossi");
		Cliente cliente2 = new Cliente("Luigi", "bianchi");
		Cliente cliente3 = new Cliente("Giacomo", "verdi");
		
		coda.inserisci(cliente1);
		coda.inserisci(cliente2);
		coda.inserisci(cliente3);
		
		coda.stampa();
		System.out.println("");
		
		coda.estrai();
		coda.stampa();
		System.out.println("");
		
		coda.estrai();
		coda.stampa();
		System.out.println("");
		
		coda.estrai();
		coda.stampa();
		
	}

}
