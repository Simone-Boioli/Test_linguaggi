
public class Lista {
	private Studente head;
	private Studente current;
	private Studente previous;
	
	public Lista(){
		this.head = null;
		this.current = null;
		this.previous = null;
	}
	
	public void inserisci(int mat, String cognome){
		Studente studente = new Studente(mat, cognome);
		if(head == null){ //lista vuota
			head = studente;
			current = studente;
		}else{
			
		}
	}
	
	public boolean cancella(String cog){
		current = head;
		while (current != null){
			if(current.getCognome() == cog){
				if(head == current){
					head = head.getSuccessivo();
					current = current.getSuccessivo();
					return true;
				}else{
					previous.setSuccessivo(current.getSuccessivo());
					current = current.getSuccessivo();
					return true;
				}
			}else{
				previous = current;
				current = current.getSuccessivo();
			}
		}
		return false;
	}
	
	public void stampa(){
		Studente position;
		position = head;
		while(position != null){
			position.stampa();
			position = position.getSuccessivo();
		}
	}
}
