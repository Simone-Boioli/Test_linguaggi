
public class FuoriSerie extends Automobile{
	public FuoriSerie(String marca, String mod, int cil,  Persona prop){
		super(marca,mod,cil,prop);
	}
	
	public void accellera(){
		super.setVelocità(super.getVelocità()+2);
	}
	public void cambiaProprietà(Persona proprietario){
		if(proprietario.getStipendio()>10000){
			this.proprietario=proprietario;
		}
	}
}
