
public class MinieraMarmo extends Miniera{
	private int latoBlocco;
	
	
	public MinieraMarmo(int lato, int riserva){
		super(riserva);
		this.latoBlocco = lato;
	}
	public int getValore(){
		int valore = latoBlocco * latoBlocco;
		return valore;
	}
}
