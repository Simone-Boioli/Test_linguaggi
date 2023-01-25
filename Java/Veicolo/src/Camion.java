
public class Camion extends Veicolo{
	@SuppressWarnings("unused")  //per togliere il warning
	private int numAssi; //indica il numero degli assi che ha il camion
	
	public Camion(int numMatri, String nome, int numAssi){
		super(numMatri, nome);
		this.numAssi = numAssi;
	}
	
	public String disegna(){
		return "disegna un camion";
	}
}
