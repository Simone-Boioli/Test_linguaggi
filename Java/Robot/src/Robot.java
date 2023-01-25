
public class Robot extends Thread {
	Postazione p;
	Coordinatore c;
	int var = 0;
	int id;
	
	public Robot(Coordinatore c, Postazione p, int id){
		this.p = p;
		this.c = c;
		this.id = id;
	}
	
	public void run(){
		while(true){
			c.avvia(id);
			preparaPezzo();
			p.acquisisci();
			p.op1();
			p.op2();
			p.rilascia();
		}
	}
	
	public void preparaPezzo(){
		System.out.println("Pezzo preparato"); 
	}
}
