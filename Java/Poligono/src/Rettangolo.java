
public class Rettangolo extends Poligono {
	public Rettangolo(double base, double altezza){
		super(4,base,altezza); // il costruttore di triangolo invoca il costruttore di poligono
	}
	public double area (){  // overriding
		return this.getBase()*this.getAltezza();
	}
}