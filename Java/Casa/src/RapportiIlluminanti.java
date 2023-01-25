public class RapportiIlluminanti {
	public static void main(String[]args){
		Casa abitazione = new Casa(2);
		Stanza cucina = new Stanza(3);
		cucina.larghezza=6;
		cucina.lunghezza=8;
		Finestra finestra = new Finestra(60,100);
		Finestra finestra1 = new Finestra(180,230);
		Finestra finestra2= new Finestra(60,120);
		Stanza camera = new Stanza(3);
		cucina.larghezza=4;
		cucina.lunghezza=3;
		Finestra finestra3 = new Finestra(90,120);
		Finestra finestra4= new Finestra(80,100);
		
		cucina.vet[0]=finestra;
		cucina.vet[1]=finestra1;
		cucina.vet[2]=finestra2;
		
		abitazione.vettore[0]=cucina;
		abitazione.vettore[1]=camera;
		
		camera.vet[0]=finestra3;
		camera.vet[1]=finestra4;
		
			
		System.out.println("Il RAI per ogni stanza è: "+cucina.calcolaRappIlluminazione());
		System.out.println("Il RAI per ogni stanza è: "+camera.calcolaRappIlluminazione());
		System.out.println("Il RAI totale è:"+abitazione.calcolaRappIlluminazione());
		System.out.println("Il RAI medio è:"+abitazione.calcolaRappIlluminazioneMed());
	}
}
