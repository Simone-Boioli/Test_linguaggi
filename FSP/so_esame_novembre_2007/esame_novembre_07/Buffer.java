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
				//il buffer � gi� pieno di task ad alta priorit�, aspetto
			}
			
			if(ta+tb==k){
				//il buffer � pieno ma c'� almeno un task a bassa priorit�
				/**
				 * tolgo un task a bassa priori� e inserisco il task ad alta priorit�
				 */
				ta++;
				tb--;
				this.buf[getFirstIndex("low")]=t;
				System.out.println("Il task "+t.getId()+" ("+t.priority()+") � stato depositato al posto di un task low priority");
			}
			else{
				
				//aggiungo il task ad alta priorit� in un posto libero del buffer
				this.buf[getFirstFreePosition()] = t;
				ta++;
				System.out.println("Il task "+t.getId()+" ("+t.priority()+") � stato depositato.");
			}
			
			notifyAll();
		}
		else if(ta+tb<k){
			//ho almeno un posto nel buffer
			tb++;
			this.buf[getFirstFreePosition()] = t;
			System.out.println("Il task "+t.getId()+" ("+t.priority()+") � stato depositato.");
		}
		else{
			//il buffer � pieno e sto tentando di inserire un task a bassa priorit�
			//il sistema scarta il task
			System.out.println(">>>> il task "+t.getId()+" ("+t.priority()+") verr� scartato causa buffer pieno");
		}
		
	}

	public synchronized Task preleva(int id) {
		while(ta+tb==0){
			//non posso prelevare finch� il buffer � vuoto
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
		if(ta>0){
			ta--;
			//prendi il primo task ad alta priorit�
			notifyAll();
			int i = getFirstIndex("high");
			Task t = this.buf[i];
			this.buf[i]=null;
			return t;
		}
		else{
			tb--;
			
			//prendi il primo task a bassa priorit�
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
			//prendi il primo task ad alta priorit�
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
