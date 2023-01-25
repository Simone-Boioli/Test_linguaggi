
public class Triangolo extends Poligono {
	public Triangolo(double base, double altezza){
		super(3,base,altezza); // il costruttore di triangolo invoca il costruttore di poligono
	}
	public double area (){  // overriding
		return(this.getBase()*this.getAltezza())/2;
	}
}
