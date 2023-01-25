
public class Coda {
	Cliente head;
	Cliente tail;
	
	public Coda(){
		this.head = null;
		this.tail = null;
	}
	public void inserisci(Cliente cliente){
		if(this.head == null && this.tail == null){
			head = cliente;
			tail = cliente;
		}else{
			tail.setSuccessivo(cliente);
			tail = cliente;
		}
	}
	
	public void estrai(){
		if(head != null){
			head = head.getSuccessivo();
		}else{
			tail = null;
			System.out.println("underflow-coda vuota");
		}
	}
	
	public void stampa(){
		if(head == null){
			System.out.println("coda vuota");
		}else{
			Cliente position = head;
			
			while(position != null){
				position.stampa();
				position = position.getSuccessivo();
			}
		}
	}
}
