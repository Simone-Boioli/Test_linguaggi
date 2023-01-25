
abstract class ArmaDaImpatto extends Arma{
	
	@SuppressWarnings("unused")
	private int peso;
	
	public ArmaDaImpatto(int peso,int dannoPot){
		super(dannoPot);
		this.peso=peso;
	}
	
	public int calcolaDanno(Armatura armor){
		return getDannoPotenziale()/(int)armor.getResistenzaImpatto();
	}
}
