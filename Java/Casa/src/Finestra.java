public class Finestra {
	public int lunghezza;
	public int larghezza;
	
	public Finestra(int lung, int larg){
		lunghezza=lung;
		larghezza=larg;
	}
	
	public double calcolaSuperficieFin(){
		double mq=(lunghezza*larghezza)/100;
		return mq;
	}
	
}
