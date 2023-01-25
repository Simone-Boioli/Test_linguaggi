
public class TriangoloIsoscele extends TriangoloScaleno{

	public TriangoloIsoscele(double cateti, double base){
		super(cateti, cateti, base);
	}
	public String toString(){
		return "Triangolo isoscele di lati: "+getLato1()+" , "+getLato2()+" , "+getLato3();
	}
}
