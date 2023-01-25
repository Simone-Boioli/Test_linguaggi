
public class Pista {
	private int lunghezza;
	private int larghezza;
	private boolean inUso;
	
	public Pista(int lungh, int largh){
		this.lunghezza = lungh;
		this.larghezza = largh;
		this.inUso = false;
	}
	
	public String toString(){
		return "La pista ha una larghezza di:" + larghezza + 
		       " e una lunghezza di: "+ lunghezza;
	}

	public boolean getInUso() {
		return inUso;
	}

	public void setInUso(boolean inUso) {
		this.inUso = inUso;
	}
	
	
	
	
}
