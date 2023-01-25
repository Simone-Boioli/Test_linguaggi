import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;



public class Fascicolo {
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private Date dataNascita;
	private String numTelCasa;
	private String numCell;
	private String indirizzoResidenza;
	private String indirizzoDomicilio;
	private String categoriaProfessionale;
	
	//private ArrayList <Medico> medici;
	private ArrayList<Conversazione> conversazioni;
	private ArrayList<Documento> documentiGenerici;
	private ArrayList <Documento> documentiImportanti;
	private ArrayList<Episodio> episodi;
	
	private String path = "E:\\Ghiro\\Progetti Java\\Medical Case Management System";
	
	
	
	public Fascicolo(){}
	
	@SuppressWarnings("deprecation")
	public Fascicolo(String nome, String cognome, String cf, int giornoNascita, int meseNascita,
			         int annoNascita, String numCasa, String numCell, String indResidenza, String indDomicilio, String catProf){
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = cf;
		dataNascita = new Date(annoNascita, meseNascita, giornoNascita);
		this.numTelCasa = numCasa;
		this.numCell = numCell;
		this.indirizzoResidenza = indResidenza;
		this.indirizzoDomicilio = indDomicilio;
		this.categoriaProfessionale = catProf;
		
		//this.medici = new ArrayList<Medico>();
		this.conversazioni = new ArrayList<Conversazione>();
		this.documentiGenerici = new ArrayList<Documento>();
		this.documentiImportanti = new ArrayList<Documento>();
		this.episodi = new ArrayList<Episodio>();
		
	}
	
	/**
	 *  Metodo per creare un nuovo fascicolo
	 *  per prima cosa crea una cartella con id, nome e cognome del paziente
	 *  poi inerisce un file txt con la scheda anagrafica del paziente, compresi i medici curanti
	 *  
	 */
	public int aggiungiFascicolo(Fascicolo f){
		
		int n; //valore = 0 se la cartella è stata creata, -1 altrimenti
	
		//creazione cartella
		String nomeDirectory = path + "\\" + f.getCognome() + "_" + f.getNome();
		boolean successo = (new File(nomeDirectory)).mkdir();
		
		if(successo == true){
			n = 0;
		}else{
			n = -1;
		}
		
		
		//creazione file.txt
		if(n == 0){ //la cartella è stata creata
			PrintWriter outputStream = null;
			
		    try{
				outputStream = new PrintWriter(new FileOutputStream(path + "\\" + f.getCognome() + "_" + f.getNome() + "\\" + "Scheda_Anagrafica.txt", true));
		    }catch(Exception e){
		    	System.out.println("ERROR");
			}
			outputStream.println("Nome: " + f.getNome());
			outputStream.println("Cognome: " + f.getCognome());
			outputStream.println("Codice Fiscale: " + f.getCodiceFiscale());
			outputStream.println("Data Di Nascita: " + f.getDataNascita());
			outputStream.println("Numero Telefono Casa: " + f.getNumTelCasa());
			outputStream.println("Numero Telefono Cellulare: " + f.getNumCell());
			outputStream.println("Indirizzo Residenza: " + f.getIndirizzoResidenza());
			outputStream.println("Indirizzo Domicilio: " + f.getIndirizzoDomicilio());
			outputStream.println("Categoria Professionale: " + f.getCategoriaProfessionale() + "\n");
			outputStream.println("---------------------------------------------------------" + "\n");
			
			
			outputStream.close();
		}
		
		//ritorno che dice se è stata creata o no la cartella contente il file
		if(n==0){
			return 0;
		}else{
			return -1;
		}
	}
	
	
	
	/**
	 *  Metodo per modificare i dati nel fascicolo
	 
	public void modificaFasicolo(String nome, String cognome, String parametroModifica, String modifica){
		String path = "E:\\Ghiro\\Progetti Java\\Medical Case Management System"; 
		
		try{
			BufferedReader inputStream = new BufferedReader(new FileReader(path + "\\" + cognome + "_" + nome + "\\" + "Scheda_Anagrafica.txt"));
			String line = inputStream.readLine();
			System.out.println(line);
			
			
			inputStream.close();
			
		}catch(FileNotFoundException e){
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	*/
	
	
	
	
	/**
	 * Metodo che cancella un fascicolo, ovverlo cancella l'intera cartella di un paziente 
	 */
	
	public int cancellaFascicolo(String nome, String cognome){
		File dir = new File(path + "\\" + cognome + "_" + nome);
		boolean ris = cancellaFascicolo2(dir);
		
		if(ris == true){
			return 0;
		}else{
			return 1;
		}
	}
	private boolean cancellaFascicolo2(File dir)
	  {
	    if (dir.isDirectory())
	    {
	      String[] contenuto = dir.list();
	      for (int i=0; i<contenuto.length; i++)
	      {
	        boolean success = cancellaFascicolo2(new File(dir, contenuto[i]));
	        if (!success) {
	        	return false; 
	        }
	      }
	    }
	    return dir.delete();
	  }
	
	
	
	/**
	 * Metodo che return true se trova un fascicolo , false altrimenti
	 */
	public boolean trovaFascicolo(String nome, String cognome){
		
		String nomeDirectory = path + "\\" + cognome + "_" + nome;
		boolean successo = (new File(nomeDirectory)).mkdir();
		
		if(successo == true){
			this.cancellaFascicolo(nome, cognome);
			return false; //fascicolo non trovato
		}else{
			return true; //fascicolo trovato
		}
	}
	
	/**
	 *  Metodo che inserisce un medico nella lista dei medici 
	 */
	public void aggiungiMedico(String nomeFascicolo, String cognomeFascicolo, Medico m ){
		
			PrintWriter outputStream = null;
		
		    try{
				outputStream = new PrintWriter(new FileOutputStream(path + "\\" + cognomeFascicolo + "_" + nomeFascicolo + "\\" + "Medici_Curanti.txt", true));
		    }catch(Exception e){
		    	System.out.println("ERROR");
			}
			
		    outputStream.println("\nNome Medico: " + m.getNome());
			outputStream.println("Cognome Medico: " + m.getCognome());
			outputStream.println("Specializzazione Medico: " + m.getSpecializzazione());
			outputStream.println("Cellulare Medico: " + m.getNumCell());   
			outputStream.println("Telefono Ufficio Medico: " + m.getNumTel());
			outputStream.println("E-mail Medico: " + m.getEmail());
			outputStream.println("Fax Medico: " + m.getFax() + "\n");
			outputStream.println("-------------------------------------");
			
			
			outputStream.close();
	}
	
	
	
	
	/**
	 *  Metodo che cancella un medico con nome e cognome passati per parametro
	 
	public void cancellaMedico(String nome, String cognome){
		for(int i = 0; i < medici.size(); i++){
			if(medici.get(i).getNome() == nome && medici.get(i).getCognome() == cognome){
				System.out.println("Il medico " + nome + " " + cognome + " e' stato cancellato");
				medici.remove(i);
				break;
			}
		}
		
		
	}
	*/
	
	
	/**
	 *  Metodo di modifica di un valore del medico
	 
	public void modificaMedico(String nome, String cognome, String valoreModificare, String modifica){
		for(int i = 0; i < medici.size(); i++){
			if(medici.get(i).getNome() == nome && medici.get(i).getCognome() == cognome){
				switch(valoreModificare){
					case "nome":
							medici.get(i).setNome(modifica);
							break;
					case "cognome":
							medici.get(i).setCognome(modifica);
							break;
					case "specializzazione" :
							medici.get(i).setSpecializzazione(modifica);
							break;
					case "numCell":
							medici.get(i).setNumCell(modifica);
							break;
					case "numTel":
							medici.get(i).setNumTel(modifica);
							break;
					case "email":
							medici.get(i).setEmail(modifica);
							break;
					case "fax":
							medici.get(i).setFax(modifica);
							break;
				}
				break;
			}
		}
	}
	*/
	
	
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

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
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

//	public ArrayList<Medico> getMedici() {
//		return medici;
//	}
	
	
	
}
