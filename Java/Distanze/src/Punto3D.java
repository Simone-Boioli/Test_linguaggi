
public class Punto3D extends Punto {
	private int z;
	
	public Punto3D(){
		//costruttore vuoto
	}
	public Punto3D(int x, int y, int z){
		setXYZ(x,y,z);
	}
	
	public void setZ(int z){
		this.z = z;
	}
	public int getZ(){
		return z;
	}
	public void setXYZ(int x, int y, int z){
		this.setXY(x, y);
		this.setZ(z);
	}
	public double dammiDistanza(Punto p){
		if(p instanceof Punto3D){
			Punto3D p1 = (Punto3D)p; //casting tra oggetti
			int tmp1 = (getX()-p1.getX())*(getX()-p1.getX()); 
			int tmp2 = (getY()-p1.getY())*(getY()-p1.getY());
			int tmp3 = (z-p1.z)*(z-p1.z);
			return Math.sqrt(tmp1 + tmp2 + tmp3);
		}else{
			return -1;
		}
	}
}
