
public class Esame {
	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.inserisci(123, "rossi");
		lista.stampa();
		if(lista.cancella("rossi")){
			System.out.println("cancellato");
		}else{
			System.out.println("non cancellato");
		}
		lista.stampa();

	}

}
