package esame_novembre_07;

public class Buffer {
	int ta, tb, k;
	Task[] buf;
	
	public Buffer(){
		ta = 0;
		tb = 0;
		buf = new Task[4];
		k = buf.length;
	}
	
	public Buffer(int dimension){
		ta = 0;
		tb = 0;
		buf = new Task[dimension];
		k = buf.length;
	}
	
	
	public synchronized void deposita(Task t) {
		if(t.priority() == "high"){
			while(ta==k){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//il buffer è già pieno di task ad alta priorità, aspetto
			}
			
			if(ta+tb==k){
				//il buffer è pieno ma c'è almeno un task a bassa priorità
				/**
				 * tolgo un task a bassa priorià e inserisco il task ad alta priorità
				 */
				ta++;
				tb--;
				this.buf[getFirstIndex("low")]=t;
				System.out.println("Il task "+t.getId()+" ("+t.priority()+") è stato depositato al posto di un task low priority");
			}
			else{
				
				//aggiungo il task ad alta priorità in un posto libero del buffer
				this.buf[getFirstFreePosition()] = t;
				ta++;
				System.out.println("Il task "+t.getId()+" ("+t.priority()+") è stato depositato.");
			}
			
			notifyAll();
		}
		else if(ta+tb<k){
			//ho almeno un posto nel buffer
			tb++;
			this.buf[getFirstFreePosition()] = t;
			System.out.println("Il task "+t.getId()+" ("+t.priority()+") è stato depositato.");
		}
		else{
			//il buffer è pieno e sto tentando di inserire un task a bassa priorità
			//il sistema scarta il task
			System.out.println(">>>> il task "+t.getId()+" ("+t.priority()+") verrà scartato causa buffer pieno");
		}
		
	}

	public synchronized Task preleva(int id) {
		while(ta+tb==0){
			//non posso prelevare finché il buffer è vuoto
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
		if(ta>0){
			ta--;
			//prendi il primo task ad alta priorità
			notifyAll();
			int i = getFirstIndex("high");
			Task t = this.buf[i];
			this.buf[i]=null;
			return t;
		}
		else{
			tb--;
			
			//prendi il primo task a bassa priorità
			int i = getFirstIndex("low");
			Task t = this.buf[i];
			this.buf[i]=null;
			notifyAll();
			return t;
		}
		
	}

	public synchronized Task chiedi() {
		if(ta>0){
			ta--;
			int i = getFirstIndex("high");
			Task t = this.buf[i];
			this.buf[i]=null;
			notifyAll();
			//prendi il primo task ad alta priorità
			return t;
		}
		
		return new Task(0);
	}

	private int getFirstFreePosition(){
		for (int i = 0; i < this.buf.length; i++) {
			if(this.buf[i]==null){
				return i;
			}
		}
		return -1;
	}
	
	private int getFirstIndex(String priorityTest){
		for (int i = 0; i < this.buf.length; i++) {
			if(this.buf[i]!= null && this.buf[i].priority().equalsIgnoreCase(priorityTest)){
				return i;
			}
		}
		return -1;
	}
	
	
}
