public class Robot extends Thread{
	Postazione p;
	Coordinatore c; 
	int id;

	public Robot (Postazione p, Coordinatore c, int id){
		this.p = p;
		this.c = c;
		this.id = id;
	}

	public void run(){
		while(true){
			c.avvia(id);
			preparaPezzo();
			p.acquisisci();
			p.op1(id);
			p.op2(id);
			p.rilascia();
		}
	}

	private void preparaPezzo(){
		System.out.println(id + " ha preparato il pezzo");
	}
}
