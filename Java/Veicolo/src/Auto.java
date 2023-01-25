
public class Auto extends Veicolo {
	
	@SuppressWarnings("unused")//per togliere il warning
	private String tipo;  //indica il modello dell'auto

	public Auto(int numMatr, String tipo, String nome){
		super(numMatr, nome);
		this.tipo = tipo;
	}
	
	public String disegna(){
		return "disegna un'auto";
	}
}