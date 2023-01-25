public class Serbatoio {
	private double capacità;
	private double contenuto;
	private boolean rubinetto;
	private int usura;
	
	public Serbatoio(double cap){
		capacità=cap;
		contenuto=0;
		rubinetto= false; //chiuso
		usura=0;
	}
	
	public void setContenuto(double cont) {
		if(cont<=capacità)
			this.contenuto = cont;
	}
	
	
	public void stampa(){
		System.out.println("La capacità è:"+capacità+" "+"Il contenuto è:"+contenuto);
	}
	
	public void apri(){
		if (rubinetto==false){
			rubinetto=true;
			usura++;  
		}
	}
	
	public boolean pericolo(){
		if(usura>1000){
			return true;
		}else
			return false;
	}

	public int getUsura() {
		return usura;
	}
	
	
	
	
	
	
	
	
}
