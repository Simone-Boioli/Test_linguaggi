
public class Start {
	public static void main(String[]args){
		Ascoltatore asc = new Ascoltatore();
		Finestra fin = new Finestra(asc);
		asc.finestra = fin;
	}
}
