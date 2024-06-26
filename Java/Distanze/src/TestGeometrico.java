
public class TestGeometrico {
	public static void main(String[]args){
		//variabili locali
		Punto p1 = null;
		Punto p2 = null;
		
		//test parametri inseriti
		if(args.length == 4){
			//conversione a int di stringhe
			int p1X = Integer.parseInt(args[0]);
			int p1Y = Integer.parseInt(args[1]);
			int p2X = Integer.parseInt(args[2]);
			int p2Y = Integer.parseInt(args[3]);
			
			//instanza dei 2 punti
			 p1 = new Punto(p1X, p1Y);
			 p2 = new Punto(p2X, p2Y);
		}
		else if (args.length == 6){
			//conversione a int di stringhe
			int p1X = Integer.parseInt(args[0]);
			int p1Y = Integer.parseInt(args[1]);
			int p1Z = Integer.parseInt(args[2]);
			int p2X = Integer.parseInt(args[3]);
			int p2Y = Integer.parseInt(args[4]);
			int p2Z = Integer.parseInt(args[5]);
			
			//instanza dei 2 punti
			 p1 = new Punto3D(p1X, p1Y, p1Z);
			 p2 = new Punto3D(p2X, p2Y, p2Z);
		
		}else{
			System.out.println("Inserisci 4 o 6 parametri");
			System.exit(0); //termina l'applicazione
		}
		//Stampa della distanza
		System.out.println("i punti distano "+ p1.dammiDistanza(p2));
	}
}
