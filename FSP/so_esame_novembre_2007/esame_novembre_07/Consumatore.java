package esame_novembre_07;

public class Consumatore extends Thread {
	private Buffer b;
	private int id;
	private Task t, w;
	
	public Consumatore(int id, Buffer buf){
		this.id = id;
		this.b = buf;
	}
	
	public Consumatore(Buffer buf){
		this.b = buf;
		this.id = this.hashCode();
	}
	
	public void run(){
		while(true){
			t = b.preleva(this.id);
			System.out.println("Il consumatore "+id+" ha prelevato il task "+ t.getId()+" con priorità "+t.priority());
			if(t.priority() == "low"){
				w = b.chiedi();
				if(w.priority() == "high")
					t = w;
			}
			execute(t);
		}
	}

	private void execute(Task t2) {
		if(t2.getWhatToExecute() == null){
			System.out.println("il task "+ t2.getId() + " non contiene niente da eseguire");
		}
		else{
			System.out.println("il contenuto del task "+ t2.getId() + " è "+t2.getWhatToExecute().hashCode());
		}
		
	}
}
