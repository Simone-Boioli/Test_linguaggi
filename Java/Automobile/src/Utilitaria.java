
public class Utilitaria extends Automobile {

	public Utilitaria(String marca, String mod, int cil, Persona prop){
		super(marca,mod,cil,prop);
	}
	
	public void accellera(){
		if(super.getCilindrata()<1200){
			super.setVelocità(super.getVelocità()+0.1);
		}else{
			super.setVelocità(super.getVelocità()+0.5);
		}
	}
	
	
	public void cambiaProprietà(Persona proprietario){
		this.proprietario=proprietario;
	}
}
