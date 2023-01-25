
abstract class Armatura {
	private double resistenzaTaglio;
	private double resistenzaImpatto;
	
	public Armatura(double resT,double resI){
		resistenzaTaglio=resT;
		resistenzaImpatto=resI;
	}
	
	public double getResistenzaTaglio(){
		return resistenzaTaglio;
	}
	
	public double getResistenzaImpatto(){
		return resistenzaImpatto;
	}
}
