public class Macchina{
	 private String colore;
	 private int potenza;
	 private int velocit�max;
	String modello;

	//costruttore
	public Macchina(){
	velocit�max=100;
	modello="macchina generica";
        }
	
        public Macchina(String colore, int potenza){ //overloding su costruttore
	this();
	this.colore=colore;
	this.potenza=potenza;
	}



	public String toString(){
		return "colore: "+colore+"potenza:"+potenza;
	}

	public void setColore(String colore){     // imposta il colore con la variabile passata
		this.colore=colore;
	}

	public int getPotenza(){           //ritorna ma non si pu� cambiare il valore
		return potenza;
	}

	public void setPotenza(int pot){
		if(pot>0){
			this.potenza=pot;
		}
	}


}