
public class Aeroporto {
	private String codiceATA;
	private String nome;
	private TorreControllo torreDiControllo;
	private Pista[]piste;
	private Hangar[]hangar;
	
	
	public Aeroporto(String cod, String nome,  Pista[] piste, Hangar[]hangar, int freq){
		this.codiceATA = cod;
		this.nome = nome;
		this.piste = piste;
		this.hangar = hangar;
		this.torreDiControllo = new TorreControllo(freq);

	}
	
	public boolean autorizzaDecollo(int nPista, int nHangar){
		if(nPista >= piste.length || nHangar >= hangar.length || piste[nPista].getInUso() || !hangar[nHangar].getInUso()){
			return false;
		}else{
			piste[nPista].setInUso(true);
			hangar[nHangar].setInUso(false);
			return true;
		}
	}
	
	public boolean autorizzaAttarreggio(int freqRadio, double volAereo){
		if(freqRadio != torreDiControllo.getFrequenzaRadio()){
			return false;
		}else{
			int pistaLibera = -1;
			int hangarLibero = -1;
			
			for(int i = 0; i<piste.length; i++){
				if(!piste[i].getInUso()){
					pistaLibera = i;
					break;
				}
			}
			for(int i = 0; i< hangar.length; i++){
				if(!hangar[i].getInUso() && hangar[i].getVolume() >= volAereo){
					hangarLibero = i;
					break;
				}
			}
			
			if(pistaLibera == -1 || hangarLibero == -1){
				return false;
			}else{
				piste[pistaLibera].setInUso(true);
				hangar[hangarLibero].setInUso(true);
				return true;
			}
		}
	}
	
	public String toString(){
		return "Aeroporto "+nome+ "codiceATA"+codiceATA;
	}

}