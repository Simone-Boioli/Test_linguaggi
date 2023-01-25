
public class Punto {
	private int x;
	private int y;
	
	public Punto (){
		//costruttore senza parametri
	}
	public Punto(int x, int y){
			setXY(x,y);
	}
	
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getY(){
		return y;
	}
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	public double dammiDistanza(Punto p){
		int tmp1 = (x-p.x)*(x-p.x); //quadrato della differenza delle x dei due punti
		int tmp2 = (y-p.y)*(y-p.y); //quadrato della differenza delle y dei due punti
		return Math.sqrt(tmp1+tmp2);
	}
}
