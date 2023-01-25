
public class Hangar {
	private int altezza;
	private int lunghezza;
	private int larghezza;
	private boolean inUso;
	
	public Hangar(int alt, int lungh, int largh){
		this.altezza = alt;
		this.lunghezza = lungh;
		this.larghezza = largh;
		inUso = false;
	}
	
	public int getVolume(){
		return (lunghezza*larghezza)*altezza;
	}
	
	public String toString(){
		return "L'hangar ha un volume di " + getVolume();
	}

	public boolean getInUso() {
		return inUso;
	}

	public void setInUso(boolean inUso) {
		this.inUso = inUso;
	}
	
	
	
}
