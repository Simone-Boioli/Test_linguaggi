package esame_novembre_07;

public class Task {
	int priority = 0;
	Object whatToExecute;
	int id;
	
	public Task(int prio){
		this.priority = prio;
		this.id = this.hashCode();
		this.whatToExecute = null;
	}

	public Task(int id, int priority){
		this.priority = priority;
		this.id = id;
		this.whatToExecute = null;
	}
	
	public Task(int id, int priority, Object toExec){
		this.priority = priority;
		this.id = id;
		this.whatToExecute = toExec;
	}
	
	public int getId() {
		return id;
	}
	
	/**
	 * ritorna la priorità associata al task
	 * @return low || high
	 */
	public String priority() {
		if(this.priority == 0){
			return "low";
		}
		else if(this.priority == 1){
			return "high";
		}
		return null;
	}
	
	
	//ritorna il possibile oggetto da eseguire
	public Object getWhatToExecute() {
		return whatToExecute;
	}

}
