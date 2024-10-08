
public class RapportiIlluminanti {

	public static void main(String[] args) {
		Casa casa = new Casa(2);
		
		Stanza st1 = new Stanza(6,8,3);
		Finestra fin1 = new Finestra(0.60,1.00);
		Finestra fin2 = new Finestra(1.80,2.30);
		Finestra fin3 = new Finestra(0.60,1.20);
		st1.finestre[0] = fin1;
		st1.finestre[1] = fin2;
		st1.finestre[2] = fin3;
		
		Stanza st2 = new Stanza(4,3,2);
		Finestra fin4 = new Finestra(0.90,1.20);
		Finestra fin5 = new Finestra(0.80,1.00);
		st2.finestre[0] = fin4;
		st2.finestre[1] = fin5;
		
		casa.stanze[0] = st1;
		casa.stanze[1] = st2;
		
		System.out.println(st1.calcolaRapportoIlluminazione());
		System.out.println(st2.calcolaRapportoIlluminazione());
		System.out.println("tot= "+ casa.calcolaRapportoIlluminazione());
		System.out.println("medio= "+ casa.calcolaRapportoIlluminazioneMedio());
		
		fin2.larghezza = fin5.larghezza;
		fin2.lunghezza = fin5.lunghezza;
		
		System.out.println(st1.calcolaRapportoIlluminazione());
		System.out.println(st2.calcolaRapportoIlluminazione());
		System.out.println("tot= "+ casa.calcolaRapportoIlluminazione());
		System.out.println("medio= "+ casa.calcolaRapportoIlluminazioneMedio());
		
	}

}
