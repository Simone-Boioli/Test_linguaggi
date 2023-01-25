package Project2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fascicolo implements Serializable{

	private static final long serialVersionUID = 7476105782997272789L;
	
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private Calendar dataNascita;
	private String numTelCasa;
	private String numCell;
	private String indirizzoResidenza;
	private String indirizzoDomicilio;
	private String categoriaProfessionale;
	
	//private ArrayList <Medico> medici;
	private ArrayList<Conversazione> conversazioni;
	private ArrayList<Documento> documentiGenerici;
	private ArrayList<Documento> documentiImportanti;
	private ArrayList<Episodio> episodi;
	private ArrayList<Medico> medici;
	

	public Fascicolo(String nome, String cognome, String cf, int giornoNascita, int meseNascita,
			         int annoNascita, String numCasa, String numCell, String indResidenza, String indDomicilio, String catProf){
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = cf;
		
		dataNascita = new GregorianCalendar();
		dataNascita.clear();
		
		System.out.print(annoNascita + " " + meseNascita + " " + giornoNascita);
		
		dataNascita.set(annoNascita, meseNascita, giornoNascita);
		
		this.numTelCasa = numCasa;
		this.numCell = numCell;
		this.indirizzoResidenza = indResidenza;
		this.indirizzoDomicilio = indDomicilio;
		this.categoriaProfessionale = catProf;
		
		this.medici = new ArrayList<Medico>();
		this.conversazioni = new ArrayList<Conversazione>();
		this.documentiGenerici = new ArrayList<Documento>();
		this.documentiImportanti = new ArrayList<Documento>();
		this.episodi = new ArrayList<Episodio>();
		
		
	}
	
	/**
	 *  Metodo che inserisce un medico nella lista dei medici 
	 */
	public void aggiungiMedico(Medico m ){

		if( this.medici == null)
			System.out.print("Medici  null!");
		
		this.medici.add(m);
	}
	
	/**
	 *  Metodo che cancella un medico con nome e cognome passati per parametro
	 */
	
	public boolean cancellaMedico(String nome, String cognome){
		
		int i = 0;
		
		while( i < medici.size() ){
			if(medici.get(i).getNome() == nome && medici.get(i).getCognome() == cognome){
				medici.remove(i);
				
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 *  Metodo di modifica di un valore del medico
	 */
	
	public void modificaMedico(String nome, String cognome, int valoreModificare, String modifica){
		
		int i = 0;
		
		while( i < medici.size() ){
			
			if(medici.get(i).getNome() == nome && medici.get(i).getCognome() == cognome){
				
				switch(valoreModificare){
					case 1:
							medici.get(i).setNome(modifica);
							break;
					case 2:
							medici.get(i).setCognome(modifica);
							break;
					case 3 :
							medici.get(i).setSpecializzazione(modifica);
							break;
					case 4:
							medici.get(i).setNumCell(modifica);
							break;
					case 5:
							medici.get(i).setNumTel(modifica);
							break;
					case 6:
							medici.get(i).setEmail(modifica);
							break;
					case 7:
							medici.get(i).setFax(modifica);
							break;
				}
			}
		}
	}
	
	/**
	 * Metodi get() e set() degli attributi
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNumTelCasa() {
		return numTelCasa;
	}

	public void setNumTelCasa(String numTelCasa) {
		this.numTelCasa = numTelCasa;
	}

	public String getNumCell() {
		return numCell;
	}

	public void setNumCell(String numCell) {
		this.numCell = numCell;
	}

	public String getIndirizzoResidenza() {
		return indirizzoResidenza;
	}

	public void setIndirizzoResidenza(String indirizzoResidenza) {
		this.indirizzoResidenza = indirizzoResidenza;
	}

	public String getIndirizzoDomicilio() {
		return indirizzoDomicilio;
	}

	public void setIndirizzoDomicilio(String indirizzoDomicilio) {
		this.indirizzoDomicilio = indirizzoDomicilio;
	}

	public String getCategoriaProfessionale() {
		return categoriaProfessionale;
	}

	public void setCategoriaProfessionale(String categoriaProfessionale) {
		this.categoriaProfessionale = categoriaProfessionale;
	}

	public ArrayList<Medico> getMedici() {
		return medici;
	}
	
	public String getStringDataNascita(){
		
		String giorno = Integer.toString(dataNascita.get(Calendar.DAY_OF_MONTH));
		String mese = Integer.toString( dataNascita.get(Calendar.MONTH) + 1);
		String anno = Integer.toString(dataNascita.get(Calendar.YEAR));
		
		return  giorno + "/" + mese  + "/" + anno;
	}
	
	public String[] getListaMediciString() {
		
		ArrayList <String> mediciString = new ArrayList <String>();
		
		if( medici != null){
		
			for(int i=0; i<medici.size(); i++){
			
				mediciString.add( medici.get(i).getNome() + " " + medici.get(i).getCognome() );
			}
			
			String[] listaRitorno = new String[medici.size()];
			
			return mediciString.toArray(listaRitorno);
		}
		else{
			String[] listaRitorno = new String[0];
			
			return listaRitorno;
		}
	}
}

