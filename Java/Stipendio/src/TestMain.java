import java.util.Scanner;


public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci gli anni di lavoro della persona 1");
		int anni1 = sc.nextInt();
		System.out.println("Inserisci lo stipendio della persona 1");
		int stip1 = sc.nextInt();
		
		System.out.println("Inserisci gli anni di lavoro della persona 2");
		int anni2 = sc.nextInt();
		System.out.println("Inserisci lo stipendio della persona 2");
		int stip2 = sc.nextInt();
		
		Reddito redd1 = new Reddito("Bianchi", stip1, anni1);
		Reddito redd2 = new Reddito("Verdi", stip2, anni2);
		Reddito redd3 = new Reddito("Rossi", 0, 5);
		
		System.out.println(redd1.toString());
		System.out.println(redd2.toString());
		System.out.println(redd3.toString());
		
		redd3.aggiornaStipendio();
		@SuppressWarnings("unused")
		boolean aggiornato = redd1.aggiornaStipendio();
		if(aggiornato = true){
			redd2.setStipendioAnnuo(redd1.getStipendioAnnuo());
		}
		
		System.out.println(redd1.toString());
		System.out.println(redd2.toString());
		System.out.println(redd3.toString());

	}

}
