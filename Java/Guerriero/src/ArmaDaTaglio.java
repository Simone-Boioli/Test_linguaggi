
abstract class ArmaDaTaglio extends Arma {
	@SuppressWarnings("unused")//per togliere il warning
	private int peso;
	@SuppressWarnings("unused")//per togliere il warning
	private int filoLama;
	
	public ArmaDaTaglio(int peso, int filoLama,int dannoPot){
		super(dannoPot);
		this.peso=peso;
		this.filoLama=filoLama;
	}
	
	public int calcolaDanno(Armatura armor){
		return getDannoPotenziale()/(int)armor.getResistenzaTaglio();
	}
	
	
}
