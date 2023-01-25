
public class Finestra {
	public double larghezza;
	public double lunghezza;
	
	public Finestra(double largh, double lungh){
		larghezza = largh;
		lunghezza = lungh;
	}
	
	public double calcoloSup(){
		return larghezza*lunghezza;
	}
}
