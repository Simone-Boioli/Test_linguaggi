
public class SerbatoioPressurizzato extends Serbatoio{
	private double temperatura;
	private double pressione;
	
	public SerbatoioPressurizzato(double capacità, double temp, double pres){
		super(capacità);
		this.temperatura=temp;
		this.pressione=pres;
	}

	public boolean pericolo(){
		if(getUsura()>1000 && (temperatura>35||pressione>5)){
			return true;
		}else
			return false;
	}
	
	
}