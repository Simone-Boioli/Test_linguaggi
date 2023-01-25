
public class ContoCorrente {
	private String nome;
	private double saldo;
	
	public ContoCorrente(String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo;      //quantità di denaro disponibile
	}

	public String toString() {
		return "ContoCorrente [nome=" + nome + ", saldo rimanente=" + saldo + "]";
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
}
