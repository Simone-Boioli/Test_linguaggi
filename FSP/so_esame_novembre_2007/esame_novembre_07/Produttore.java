package esame_novembre_07;

import java.io.ObjectOutputStream;

public class Produttore extends Thread {
	private Buffer b;
	private Task t;
	private int tasksId=0;
	
	public Produttore(Buffer b){
		this.b = b;
	}
	
	public void run(){
		while(true){
			t = genera();
			b.deposita(t);
		}
	}

	private Task genera() {
		tasksId++;
		Task t;
		//la priorità è generata casualmente utilizzando i divisori di 2
		Object o = new Object();
		t = new Task(tasksId, (int)(Math.round(Math.random()*10) % 2), o);
		return t;
	}
}
