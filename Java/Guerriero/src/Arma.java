
abstract class Arma {   
	private int dannoPotenziale;
	
	public Arma( int dannoPot){
		this.dannoPotenziale = dannoPot;
	}
	
	public int getDannoPotenziale(){
		return dannoPotenziale;
	}
	
	abstract int calcolaDanno(Armatura armor);
}
