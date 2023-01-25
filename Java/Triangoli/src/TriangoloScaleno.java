
public class TriangoloScaleno {
	private double lato1;
	private double lato2;
	private double lato3;
	
	public TriangoloScaleno(double lato1, double lato2, double lato3){
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}
	public double getPerimetro(){
		return(lato1+lato2+lato3);
	}
	
	public String toString(){
		return "Triangolo scaleno di lati: "+lato1+" , "+lato2+" , "+lato3;
	}
	public double getLato1() {
		return lato1;
	}
	public double getLato2() {
		return lato2;
	}
	public double getLato3() {
		return lato3;
	}
	
		
		
}
