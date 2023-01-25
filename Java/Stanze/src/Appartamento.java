import java.util.Scanner;


public class Appartamento {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci la lunghezza della stanza1");
		int lungh1 = sc.nextInt();
		System.out.println("Inserisci la largheza della stanza1");
		int largh1 = sc.nextInt();
		
		System.out.println("Inserisci la lunghezza della stanza2");
		int lungh2 = sc.nextInt();
		System.out.println("Inserisci la largheza della stanza2");
		int largh2 = sc.nextInt();
		
		Stanza st1 = new Stanza("cucina", lungh1, largh1);
		Stanza st2 = new Stanza("camera", lungh2, largh2);
		Stanza st3 = new Stanza("corridoio", 0, 2);
		
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
		
		st3.setLunghezza(st1.getLunghezza()+st2.getLunghezza());
		
		System.out.println("");
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
		
		int area = st1.calcolaArea() + st2.calcolaArea() + st3.calcolaArea();
		System.out.println("");
		System.out.println("L'AREA E': "+ area);
		
	}
}
