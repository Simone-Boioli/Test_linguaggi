import java.util.Scanner;

public class Start {
	private static Scanner scanner = new Scanner(System.in);
	private static int uscita = -1;  // variabile che ci dice quando un utente vuole uscire dal sistema
	
	public static void main(String[] args) {
			
		System.out.println("----------------------------------------------------");
		System.out.println("            MEDICAL CASE MANAGEMENT SYSTEM          ");
		System.out.println("----------------------------------------------------\n\n");
		
		
		while(uscita != 0){
			System.out.println("------------------------------------------");
			System.out.println("            Schermata Iniziale            ");
			System.out.println("------------------------------------------\n\n");
			System.out.println("Inserisci: ");
			System.out.println("1  -->  Per creare un nuovo fascicolo.");   //////fatto
			System.out.println("2  -->  Per modificare un nuovo fascicolo.");
			System.out.println("3  -->  Per eliminare un fascicolo.");   ////fatto
			System.out.println("4  -->  Per entrare in un fascicolo.");
			System.out.println("0  -->  Per uscire dal programma.\n ");  ///fatto
			
			System.out.println("Inserisci la scelta: ");
			int scelta = scanner.nextInt();
			
			switch(scelta){
				case 1:
					int f = creaFascicolo();
					
					if(f == 1){
						break;
					}else{
						uscita = 0;
						break;
					}
				case 2:
					//int f1 = modificaFascicolo();
					System.out.println("\n\nCOMING SOON\n\n");
					break;
				case 3:
					int f3 = eliminaFascicolo();
					
					if(f3 == 1){
						break;
					}else{
						uscita = 0;
						break;
					}
				case 4:
					int f4 = apriFascicolo();
					
					if(f4 == 1){
						break;
					}else{
						uscita = 0;
						break;
					}
				case 0:
					uscita = 0;
					break;
			}
		}
		
		System.out.println("UTENTE USCITO DAL SISTEMA");
		System.exit(-1);
	}
	
	private static int creaFascicolo(){
		
		System.out.println("\n\n----------------------");
		System.out.println("    Crea Fascicolo    ");
		System.out.println("----------------------");
		
		
		System.out.println("\nInserisci il nome del paziente: ");
		String nome = scanner.next();
		
		System.out.println("\nInserisci il cognome del paziente: ");
		String cognome = scanner.next();
		
		System.out.println("\nInserisci il codice fiscale del paziente: ");
		String cf = scanner.next();
		
		System.out.println("\nInserisci il giorno di nascita del paziente: ");
		int giornoNascita = scanner.nextInt();
		
		System.out.println("\nInserisci il mese di nascita del paziente: ");
		int meseNascita = scanner.nextInt();
		
		System.out.println("\nInserisci l'anno di nascita del paziente: ");
		int annoNascita = scanner.nextInt();
		
		System.out.println("\nInserisci il numero di telefono di casa del paziente: ");
		String numTel = scanner.next();
		
		System.out.println("\nInserisci il numero di cellulare del paziente: ");
		String numCell = scanner.next();
		
		System.out.println("\nInserisci l'indirizzo di residenza del paziente: ");
		String indRes = scanner.next();
		
		System.out.println("\nInserisci l'indirizzo di domicilio del paziente: ");
		String indDom = scanner.next();
		
		System.out.println("\nInserisci la categoria professionale del paziente: ");
		String catProf = scanner.next();
		
		Fascicolo f = new Fascicolo(nome, cognome, cf, giornoNascita, meseNascita, annoNascita, numTel, numCell, indRes, indDom, catProf);
		int val = f.aggiungiFascicolo(f);
		
		if(val == 0){
			System.out.println("\n---FASCICOLO INSERITO CORRETTAMENTE--- ");
		}else{
			System.out.println("\n---ERROR!!! -- FASCICOLO GIA' ESISTENTE---");
		}
		
		System.out.println("\n\n\nInserisci: ");
		System.out.println("1  -->  Per ritornare alla schermata iniziale.");
		System.out.println("0  -->  Per uscire dal sistema.\n");
		
		System.out.println("Inserisci la scelta: ");
		int s = scanner.nextInt();
		
		return s;
	}

	
	/**
	private static int modificaFascicolo(){
		System.out.println("\n\n----------------------");
		System.out.println("    Modifica Fascicolo    ");
		System.out.println("----------------------");
		
		System.out.println("\nInsersici il nome del paziente da modificare: ");
		String nome = scanner.next();
		
		System.out.println("\nInsersici il cognome del paziente da modificare: ");
		String cognome = scanner.next();
		
		System.out.println("\nChe parametro vuoi modificare?");
		System.out.println("1  -->  nome.");
		System.out.println("2  -->  cognome.");
		System.out.println("3  -->  codice fiscale.");
		System.out.println("4  -->  giorno di nascita.");
		System.out.println("5  -->  mese di nascita");
		System.out.println("6  -->  anno di nascita.");
		System.out.println("7  -->  numero telefono di casa.");
		System.out.println("8  -->  numero di cellulare.");
		System.out.println("9  -->  indirizzo residenza.");
		System.out.println("10  --> indirizzo domicilio");
		System.out.println("11  --> categoria professionale");
		
		System.out.println("Inserisci la scelta: ");
		int scelta = scanner.nextInt();
		
		Fascicolo f = new Fascicolo();
		
		switch(scelta){
			case 1:
				System.out.println("\nCon che valore vuoi modificarlo?: ");
				String val = scanner.next();
				f.modificaFasicolo(nome, cognome, "nome", val);
			case 2:
				
			case 3:
				
			case 4:
				
			case 5:
				
			case 6:
				
			case 7:
				
			case 8:
				
			case 9:
				
			case 10:
				
			case 11:
				
		}
		
		
		return 0;
	}
	
	*/
	
	private static int eliminaFascicolo(){
		
		System.out.println("\n\n-------------------------");
		System.out.println("    Elimina Fascicolo    ");
		System.out.println("-------------------------");
		
		System.out.println("\nInserisci il nome del paziente del fascicolo da cancellare: ");
		String nome = scanner.next();
		
		System.out.println("\nInserisci il cognome del paziente del fascicolo da cancellare: ");
		String cognome = scanner.next();
		
		System.out.println("\nSei sicuro di cancellare il fascicolo di : " + cognome + " " + nome + " ? [y-n]");
		String dom = scanner.next();
		
		if(dom.equalsIgnoreCase("y")){
			Fascicolo f = new Fascicolo();
			int ris = f.cancellaFascicolo(nome, cognome);
			
			if(ris == 0){
				System.out.println("\n---FASCICOLO CANCELLATO CORRETTAMENTE--- ");
			}else{
				System.out.println("\n---ERROR!!! -- FASCICOLO NON CANCELLATO---");
			}
		}else{
			/**
			 * 
			 */
			
		}
		
		System.out.println("\n\n\nInserisci: ");
		System.out.println("1  -->  Per ritornare alla schermata iniziale.");
		System.out.println("0  -->  Per uscire dal sistema.\n");
		
		System.out.println("Inserisci la scelta: ");
		int s = scanner.nextInt();
		
		return s;
	}
		
	
	private static int apriFascicolo(){
		int u = -1;
		
		System.out.println("\n\n----------------------");
		System.out.println("    Apri Fascicolo    ");
		System.out.println("----------------------");
		
		
		System.out.println("Inserisci il nome del paziente: ");
		String nome = scanner.next();
		
		System.out.println("inserisci il cognome del paziente: ");
		String cognome = scanner.next();
		
		Fascicolo f = new Fascicolo();
		boolean trovato = f.trovaFascicolo(nome, cognome);
		
		while(u != 0){
			if(trovato == true){
				System.out.println("\nInserisci: ");
				System.out.println("1  -->  Per aggiungere un medico al fascicolo.\n");  
				System.out.println("2  -->  Per eliminare un medico dal fascicolo.\n");
				System.out.println("3  -->  Per modificare un medico del fascicolo.\n"); 
				System.out.println("4  -->  Per allegare un documento al fascicolo.\n");
				System.out.println("5  -->  Per cancellare un documento contenuto nel fascicolo.\n ");  
				System.out.println("6  -->  Per leggere una conversazione.\n ");  
				System.out.println("7  -->  Per scrivere un messaggio.\n ");
				System.out.println("8  -->  Per elencare le conversazioni.\n ");  
				System.out.println("9  -->  Per cancellare una conversazione.\n ");  
				System.out.println("10  -->  Per creare un episodio.\n ");
				System.out.println("11  -->  Per aprire un episodio.\n ");  
				System.out.println("12 -->  Per modificare un episodio.\n ");
				System.out.println("13  -->  Per lanciare un promemoria.\n ");  
				System.out.println("0   --> Per tornare alla schermata iniziale\n");
				
				System.out.println("Inserisci la scelta: ");
				int scelta = scanner.nextInt();
				
				switch(scelta){
				case 1:
					int a = aggiungiMedico(nome, cognome);
					if(a == 1){
						break;
					}else{
						u = 0;
						break;
					}
				case 2:
					System.out.println("COMING SOON");
					break;
				case 3:
					System.out.println("COMING SOON");
					break;
				case 4:
					System.out.println("COMING SOON");
					break;
				case 5:
					System.out.println("COMING SOON");
					break;
				case 6:
					System.out.println("COMING SOON");
					break;
				case 7:
					System.out.println("COMING SOON");
					break;
				case 8:
					System.out.println("COMING SOON");
					break;
				case 9:
					System.out.println("COMING SOON");
					break;
				case 10:
					System.out.println("COMING SOON");
					break;
				case 11:
					System.out.println("COMING SOON");
					break;
				case 12:
					System.out.println("COMING SOON");
					break;
				case 13:
					System.out.println("COMING SOON");
					break;
				case 0:
					u = 0;
					break;
					
				}
			}else{
				System.out.println("\nERROR -- Fascicolo non trovato\n");
			}
		}
		
			System.out.println("\n\n\nInserisci: ");
			System.out.println("1  -->  Per ritornare alla schermata di gestione del fascicolo.");
			System.out.println("0  -->  Per uscire dal sistema.\n");
		
			System.out.println("Inserisci la scelta: ");
			int s = scanner.nextInt();
		
			return s;
	}		
	
	private static int aggiungiMedico(String nome, String cognome){
		System.out.println("\n\n-----------------------");
		System.out.println("    Aggiungi Medico    ");
		System.out.println("-----------------------");
		
		System.out.println("\nInserisci il nome del medico: ");
		String nomeMedico = scanner.next();
		
		System.out.println("\nInserisci il cognome del medico: ");
		String cognomeMedico = scanner.next();
		
		System.out.println("\nInserisci la specializzazione del medico: ");
		String spec = scanner.next();
		
		System.out.println("\nInserisci il numero di cellulare del medico: ");
		String cell = scanner.next();
		
		System.out.println("\nInserisci il numero di telefono dell'ufficio del medico: ");
		String tel = scanner.next();
		
		System.out.println("\nInserisci l'e-mail del medico: ");
		String email = scanner.next();
		
		System.out.println("\nInserisci il fax del medico: ");
		String fax = scanner.next();
		
		Medico m = new Medico(nomeMedico, cognomeMedico, spec, cell, tel, email, fax);
		Fascicolo f = new Fascicolo();
		f.aggiungiMedico(nome, cognome, m);
		System.out.println("\n\nMEDICO INSERITO");
		
		System.out.println("\n\n\nInserisci: ");
		System.out.println("1  -->  Per ritornare alla schermata iniziale.");
		System.out.println("0  -->  Per uscire dal sistema.\n");
		
		System.out.println("Inserisci la scelta: ");
		int s = scanner.nextInt();
		
		return s;
		
	}
}



