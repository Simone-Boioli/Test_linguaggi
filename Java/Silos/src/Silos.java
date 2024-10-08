
public class Silos {
	private String nome;
	private int larghezza;
	private int altezza;
	private Auto[] parcheggiate;
	
	
	public Silos(String nome, int capienza, int larghezza, int altezza){
		this.nome = nome;
		this.larghezza = larghezza;
		this.altezza = altezza;
		parcheggiate = new Auto[capienza];
	}
	
	public boolean entrata(Auto a){
		boolean entr = false;
		if(a.getAltezza() < altezza && a.getLarghezza() < larghezza){
			for(int i = 0; i < parcheggiate.length && entr==false; i++){
				if(parcheggiate[i] == null){
					parcheggiate[i] = a;
					entr = true;
				}
			}
		}
		return entr;
	}
	//metodo void
	public boolean uscita(String tg){
		boolean esiste = true;
		for(int i = 0; i < parcheggiate.length; i++){
			if(parcheggiate[i].getTarga() == tg){
				parcheggiate[i] = null;
				esiste = true;
				break;
			}else{
				esiste = false;
			}
		}
		return esiste;
		
	}

	
	public String toString() {
		String info = "Silos [nome=" + nome + ", larghezza=" + larghezza
				+ ", altezza=" + altezza + "]";
		for(int i = 0; i<parcheggiate.length; i++){
			if(parcheggiate[i] != null){
				info = info + "\n" + parcheggiate[i].toString();
			}
		}
		return info;
	}

	
	
}
