
public class CartaBancomat {
	private String nome;
	private int pin;
	private double massimale; // quanit� massima di denaro che � possibile prelevare al giorno

	public CartaBancomat(String nome, int pin, double max){
		this.nome = nome;
		this.pin = pin;
		this.massimale = max;
	}

	public String toString() {
		return "CartaBancomat di: "+ nome + "massimale rimanente : "+ massimale;
	}

	public int getPin() {
		return pin;
	}

	public double getMassimale() {
		return massimale;
	}

	public String getNome() {
		return nome;
	}

	public void setMassimale(double massimale) {
		this.massimale = massimale;
	}
	
	
	
	
	
	
	
	
}
