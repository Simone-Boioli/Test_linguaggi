
import java.util.ArrayList;

	public class Videoteca {
		/* Una videoteca gestisce un catalogo di film e una lista di utenti */
		private ArrayList<Film> catalogo;
		private ArrayList<Utente> utenti;
		public Videoteca(){
			this.catalogo = new ArrayList<Film>();
			this.utenti = new ArrayList<Utente>();
		}
		public void addFilm(Film f){
			if(f != null) this.catalogo.add(f);
		}
		public void addUtente(Utente u){
			if(u != null) this.utenti.add(u);
		}
		
		/* Restituisce il film col titolo richiesto se esiste in catalogo;
		 * altrimenti restituisce null
		 */
		public Film getFilmInCatalogo(String titolo){
			for(int i = 0; i < this.catalogo.size(); i++){
				Film f = this.catalogo.get(i);
				if(f.getTitolo().equalsIgnoreCase(titolo))
					return f;
			}
			return null;
		}
		/* Restituisce l'utente col nome richiesto se esiste nella lista utenti;
		 * altrimenti restituisce null
		 */
		public Utente getUtentePerNome(String nome){
			for(int i = 0; i < this.utenti.size(); i++){
				Utente u = this.utenti.get(i);
				if(u.getNome().equalsIgnoreCase(nome))
					return u;
			}
			return null;
		}

		/* Permette di inserire un nuovo film interattivamente.
		 * Per essere valido, il nuovo film deve avere un numero PARI di scene
		 * e pi di 3 scene */
		public void registraNuovoFilmInCatalogoInterattivamente(){
			System.out.println("Inserisci titolo: ");
			String titolo = SavitchIn.readLine();
			System.out.println("Inserisci il numero di scene (numero pari): ");
			int L = SavitchIn.readLineInt();
			while (L < 3 || L % 2 != 0) {
				System.out.println("Numero inserito troppo piccolo o non pari. Riprova");
				L = SavitchIn.readLineInt();
			}

			int[] durataScene = new int[L];

			for (int i = 0; i < L; i++) {
				System.out.println("Inserisci la durata della scena: " + i);
				durataScene[i] = SavitchIn.readLineInt();
			}		

			System.out.println("Inserisci in costo per ora in euro: ");
			int euro = SavitchIn.readInt();

			Film f = new Film(titolo, durataScene, euro);
			this.addFilm(f);
		}

		/* Permette di inserire un nuovo utente interattivamente.
		 * Chi effettua l'inserimento dovrˆ specificare se si tratta di un
		 * utente in possesso di tessera fidati o meno */
		public void registraNuovoUtenteInterattivamente(){
			System.out.println("Inserisci nome: ");
			String nome = SavitchIn.readWord();
			System.out.println("L'utente ha la tessera fidaty? ");
			boolean fidaty = SavitchIn.readLineBoolean();
			if(fidaty) this.addUtente(new UtenteTesseraFidaty(nome));
			else this.addUtente(new Utente(nome));
		}
	}


