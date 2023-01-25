package esame_novembre_07;

public class Test {
	public static void main(String[] args){
		int N = 5;
		if(args.length>0){
			try{
				N = Integer.parseInt(args[0]);
			}catch (NumberFormatException  e) {
				N = 5;
			}
		}
		
		System.out.println("Launching system...");
		
		Buffer b = new Buffer(3);
		Produttore p = new Produttore(b);
		Consumatore[] c = new Consumatore[N];
		
		p.start();
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Consumatore(b);
			c[i].start();
		}
		
	}
}
