import Strutture_Dati.*;

public class Implementazioni {
	
	public static void main(String[] args) {
			Albero albero = new Albero();
			
			
			albero.add(65);
			albero.add(50);
			albero.add(30);
			albero.add(60);
			albero.add(15);
			albero.add(45);
			albero.add(76);
			albero.add(80);
			albero.add(78);
			albero.add(85);
			albero.inorderVisit();
			System.out.println("");
			
			
			System.out.println("contiene 30? "+albero.contains(30));
			System.out.println("contiene 100? "+albero.contains(100));
			System.out.println("");
			
			System.out.println("min--->"+albero.min());
			System.out.println("");
			
			System.out.println("max--->"+albero.max());
			System.out.println("");
			
			System.out.println("n° nodi--->"+albero.size());
			System.out.println("");
			
			System.out.println("altezza del nodo 76--->"+albero.level(76));
			System.out.println("altezza del nodo 85--->"+albero.level(85));
			System.out.println("");
			
			albero.remove(85);
			albero.inorderVisit();
			System.out.println("");
			
			albero.remove(76);
			albero.inorderVisit();
			System.out.println("");
			
			albero.clear();
			System.out.println("l'albero e' vuoto? "+albero.isEmpty());
			
	}

}
