
public abstract class Automobile {
	private String marca;
	private String modello;
	private int cilindrata;
	private double velocità;
	protected Persona proprietario;
	
	public Automobile(String marca, String mod, int cil,  Persona prop){
		this.marca=marca;
		this.modello=mod;
		this.cilindrata=cil;
		this.proprietario=prop;
	}
	
	public Automobile(String marca, String mod, int cil, double vel, Persona prop){
		this.marca=marca;
		this.modello=mod;
		this.cilindrata=cil;
		this.velocità=vel;
		this.proprietario=prop;
	}
	public void setVelocità(double vel){
		this.velocità=vel;
	}
	public double getVelocità(){
		return velocità;
	}
	
	public int getCilindrata(){
		return cilindrata;
	}
	public Persona getProprietario(){
		return proprietario;
	}
}
