public class Silos {

	private String nome;
	private int larghezza;  //largh max delle auto
	private int altezza;   //altezza max delle auto
	private Auto[]parcheggiate;
	
	//costruttore
	public Silos(String name, int largh, int alt, int capacità){
		this.nome=name;
		this.larghezza=largh;
		this.altezza=alt;
		parcheggiate=new Auto[capacità];   //crea un array con num max di auto
	}
	
	public boolean entrata(Auto entrante){
		boolean entr=false;
		if(entrante.getAltezza()<=altezza && entrante.getLarghezza()<=larghezza){
			for(int i=0; i<parcheggiate.length && entr==false ; i++){
					if(parcheggiate[i]==null){
						parcheggiate[i]=entrante;
						entr=true;	
					}
			}
		}
		return entr;
	}
	
	
	public void uscita(String tagg){
		for(int i=0; i<parcheggiate.length; i++){
			if(parcheggiate[i].getTarga()==tagg){
				parcheggiate[i]=null;
				break;    //quando trova la targa esce dal ciclo
			}
		}
	}
	
	public String toString(){
		
		String inf=(""+nome+" "+larghezza+" "+altezza+" ");
		for(int i=0; i<parcheggiate.length; i++){
			if(parcheggiate[i]!=null)
					inf=inf+"\n"+parcheggiate[i].toString();			
		}
		return inf;
	}
}
