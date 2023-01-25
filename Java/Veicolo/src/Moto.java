
public class Moto extends Veicolo{
	private int numPosti;  //indica il numero dei posti della moto
	
	public Moto(int numMatr, String nome, int numPosti){
		super(numMatr, nome);
		if(numPosti != 1 || numPosti != 2){  //
			System.out.println("Error");     //Se il numPosti è diverso da 1 o 2 termina il programma
			System.exit(-1);                 //
		}
		else this.numPosti = numPosti;
	}
	
	public String disegna(){
		if(numPosti == 1){
			return "disegno di una moto monoposto";
		}
		else
			return"disegno di una moto biposto";
	}

	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}
	
	
}
