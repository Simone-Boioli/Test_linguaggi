
public abstract class Poligono {
	@SuppressWarnings("unused") // per togliere i warning
	private int numLati;
	private double base;
	private double altezza;
	public Poligono(int numLati, double base, double altezza){
		this.numLati=numLati;
		this.base=base;
		this.altezza=altezza;
	}
	public abstract double area();
	public double getBase(){
		return this.base;
	}
	public double getAltezza(){
		return this.altezza;
	}
	
}
