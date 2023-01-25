
public class MercatoFinanziario {

	private Azione[]azioni;
	private int max_azioni;
	private int num_azioni;
	
	public MercatoFinanziario(){
		max_azioni=100;
		azioni=new Azione[max_azioni];
		num_azioni=0;
	}
	
	public void addAzione(Azione az){
		if(num_azioni<max_azioni){
			azioni[num_azioni++]=az;
		}else
			System.out.println("Vettore pieno");
	}
	
	public void removeAzione(int i){
		if(i<0 || i>=num_azioni){
			System.out.println("Indice aòl di fuori dei limiti");
		}else
			if(i==num_azioni-1){
				num_azioni--;
			}else{
				for(int j=i+1; j<num_azioni;j++){
					azioni[j-1]=azioni[j];
				}
				num_azioni--;
			}
	}
	
	public void stampa() {
		System.out.println("Le azioni presenti sono:");
		for (int i = 0; i < num_azioni; i++) {
			System.out.println("tipo = " + azioni[i].getTipo());
			System.out.println("prezzo = " + azioni[i].getPrezzo());
		}
	}
	
	public void modificaPrezzo(int i, int nuovoPrezzo) { 
		azioni[i].setPrezzo(nuovoPrezzo);
	}
	
	public Azione getAzione(int i) {
		return azioni[i];
	}

	

	
	
}
	

