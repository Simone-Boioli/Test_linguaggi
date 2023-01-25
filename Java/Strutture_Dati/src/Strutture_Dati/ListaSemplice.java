package Strutture_Dati;
/*
 * Implementazioni di metodi per creare una lista semplice 
 *
 */
public class ListaSemplice {
		private NodoLista head; //variabile che punta al primo nodo della lista 
		private NodoLista current; //variabile che punta al nodo corrente
		private NodoLista previous; //variabile che punta all'nodo prima del corrente
				
				
				/*
				 * inner class di nodo(crea un nodo)
				 */
				public class NodoLista{
					private String dato;
					private NodoLista link;
					
					//costruttore vuoto
					public NodoLista(){
						this.dato = null;
						this.link = null;
					}
					
					//costruttore con dati
					public NodoLista(String nuovoDato, NodoLista link){
						this.dato = nuovoDato;
						this.link = link;
					}	
				}
				
		//creiamo una Lista 
		public ListaSemplice(){
			this.head = null;  // lista vuota
			this.current = null;
			this.previous = null;
		}
		
		
		//metodo che ritorna il numero di nodi
		public int length(){
			int count = 0; //variabile che conta i nodi
			NodoLista position = head; // variabile che punta al nodo, all'inizio punta al primo(head)
			while(position != null){  //finchè non trova un link = null (è l'ultimo elemento) incrementa position
				count ++;
				position = position.link; //getLink()--> metodo che restituice il reference al nodo successivo
			}
			return count;
		}
		
		
		//metodo che ritorna il reference al nodo con un certo dato passato, in caso non c'è ritorna null
		private NodoLista Find(String target){
			NodoLista position; //che indica la posizione corrente
			position = head;  //position parte dal primo nodo
			String dataAtPosition; //variabile che indica il dato del nodo puntato da position
			while(position != null){
				dataAtPosition = position.dato; 
				if(dataAtPosition == target){ // se il dato del nodo puntato da position è uguale al dato passato, passo il nodo puntato
					return position;
				}
				position = position.link; //in caso non era uguale, position aumenta di una posizione
			}
			return null; //se non ha trovato niente ritorna null	
		}
		
		//metodo di supporto per il find visto che è private ritornando true se c'è o false se non c'è
		public boolean onList(String target){
			return(Find(target) != null);
		}
		
		//metodo che stampa tutti i valore dei nodi della lista
		public void showList(){
			NodoLista position;
			position = head;
			while(position != null){
				System.out.println(position.dato);
				position = position.link;
			}
		}
		
		//metodo che resetta i valori di current e previous all'inizio della lista
		public void resetIteretor(){
			current = head;
			previous = null;
		}
		
		//metodo che sposta i puntatori di un nodo alla volta
		public void goToNext(){
			if(current != null){   //se current punta un nodo
				previous = current;
				current = current.link;
			}else if(head != null && current == null){
				System.out.println("Iteratore non inizializzato");
			}else{  // head == current == null
				System.out.println("lista vuota");
			}
		}
		
		//metodo che inserisci un nodo dopo current
		public void add (String date){
			NodoLista nodo = new NodoLista();
			nodo.dato = date;
			
			if(head == null){  //in caso di lista vuota
				head = nodo;  
				current = nodo;
			}else if(head == current && head.link == null){ //c'è un solo elemento
				current = nodo;
				head.link = nodo;
				previous = head;
			}else if(current.link == null){
				current.link = nodo;
			}else{   //inserimento dopo il nodo puntato da current
				nodo.link = current.link;
				current.link = nodo;
			}
		}
		
		//metodo che cancella il nodo puntato da current
		public void delete(){
			if(head == null){
				System.out.println("underflow");
			}else if(head == current && head.link == null){  //c'è un solo elemento
				head = null;
				current = null;
				System.out.println("elemento cancellato, lista vuota");
			}else if(head == current && head.link != null){  //se si cancella il primo nodo
				head = current.link;
				current = current.link;
			}else{
				previous.link = current.link;
				current = current.link;
				if(current == null && head != null){
					System.out.println("Cancellato ultimo nodo della coda");
					System.out.println("ritorno alla testa!!");
					this.resetIteretor();
				}
			}
		}
}
