package Project2;

import java.io.Serializable;

public class Medico implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8674321318411385989L;
	private String nome;  //nome del medico
	private String cognome;  //cognome del medico
	private String specializzazione;  //specializzazione del medico
	private String numCell;  // telefono cellulare
	private String numTel;   // telefono ufficio
	private String email;  //e-mail del medico
	private String fax;   // fax del medico
	
	
	/**
	 *    Costruttore di Medico 
	 */
	public Medico(String nome, String cognome, String specializzazione, String numCell, String numTel, String email, String fax){
		this.nome = nome;
		this.cognome = cognome;
		this.specializzazione = specializzazione;
		this.numCell = numCell;
		this.numTel = numTel;
		this.email = email;
		this.fax = fax;
	}

	
	/**
	 *  Metodi get() e set() dei vari attributi 
	 * 
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

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public String getNumCell() {
		return numCell;
	}

	public void setNumCell(String numCell) {
		this.numCell = numCell;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
	
}
