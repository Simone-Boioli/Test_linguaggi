
public class TriangoloRettangolo extends TriangoloScaleno{
	
	public TriangoloRettangolo(double cateto1, double cateto2){
		super(cateto1, cateto2, calcolaIpotenusa(cateto1, cateto2));
	}
	
	public String toString(){
		return "Triangolo rettangolo di lati: "+getLato1()+" , "+getLato2()+" , "+getLato3();
	}
	private static double calcolaIpotenusa(double cateto1, double cateto2){
		return(Math.sqrt((cateto1*cateto1+cateto2*cateto2)));
	}
}
