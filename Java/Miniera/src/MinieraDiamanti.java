
public class MinieraDiamanti extends Miniera{
	private int dimensioneDiamanti;
	private int purezzaDiamanti;
	
	public MinieraDiamanti(int dimensione, int purezza, int riserva){
		super(riserva);
		this.dimensioneDiamanti = dimensione;
		this.purezzaDiamanti = purezza;
	}
	
	public int getValore(){
		int valore= dimensioneDiamanti*purezzaDiamanti;
		return valore;
	}

}
