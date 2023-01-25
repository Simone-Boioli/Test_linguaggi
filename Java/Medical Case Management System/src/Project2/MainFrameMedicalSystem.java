package Project2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;


public class MainFrameMedicalSystem implements ActionListener {

	private JFrame frmMedicalSystemManagment;
	
	private JPanel nativePanel;
	private JPanel activePanel;
	
	private NuovoFascicolo nuovoFascicoloPanel;
	private ConsultaFascicolo consultaFascicoloPanel;
	private ApriFascicolo apriFascicoloPanel;
	private AggiungiMedico aggiungiMedico;
	
	MedicalSystem medicalSystem = new MedicalSystem();
	
	private final Action action = new SwingAction();
	private JMenu mnModificaFascicolo;
	private JMenuItem mntmCancellaFascicolo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameMedicalSystem window = new MainFrameMedicalSystem();
					window.frmMedicalSystemManagment.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrameMedicalSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMedicalSystemManagment = new JFrame();
		frmMedicalSystemManagment.setTitle("Medical System Managment");
		frmMedicalSystemManagment.setBounds(100, 100, 900, 570);
		frmMedicalSystemManagment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Pannelli
		nuovoFascicoloPanel = new NuovoFascicolo();
		consultaFascicoloPanel = new ConsultaFascicolo();
		apriFascicoloPanel = new ApriFascicolo();
		aggiungiMedico = new AggiungiMedico();
		
		//Listener
		nuovoFascicoloPanel.btnSalvaFascicolo.addActionListener(this);
		consultaFascicoloPanel.btnInformazioni.addActionListener(this);
		apriFascicoloPanel.btnConsultaSelezionato.addActionListener(this);
		apriFascicoloPanel.btnCerca.addActionListener(this);
		aggiungiMedico.okButton.addActionListener(this);
		aggiungiMedico.cancelButton.addActionListener(this);

		
		JMenuBar menuBar = new JMenuBar();
		frmMedicalSystemManagment.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmEsci = new JMenuItem("Esci");
		mntmEsci.setAction(action);
		mnFile.add(mntmEsci);
		
		JMenu mnFascicolo = new JMenu("Fascicolo");
		menuBar.add(mnFascicolo);
		
		JMenuItem nuovoFascicolo = new JMenuItem("Nuovo Fascicolo");
		
		nuovoFascicolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmMedicalSystemManagment.remove(activePanel);
				
				frmMedicalSystemManagment.setContentPane(nuovoFascicoloPanel);
				
				activePanel = nuovoFascicoloPanel;
				
	        	mnModificaFascicolo.setEnabled(false);
	        	
	        	mntmCancellaFascicolo.setEnabled(false);
				
				frmMedicalSystemManagment.validate();
			}
		});
		
		mnFascicolo.add(nuovoFascicolo);
		
		JMenuItem mntmApriFascicolo = new JMenuItem("Apri Fascicolo");
		
		mntmApriFascicolo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0){
				
				frmMedicalSystemManagment.remove(activePanel);
				
				String[] listaFascicoli = medicalSystem.listaFascicoli();
				
				apriFascicoloPanel.setSearch(false);
				
				apriFascicoloPanel.setListaFascicoli( listaFascicoli );
				
				frmMedicalSystemManagment.setContentPane(apriFascicoloPanel);
				
				activePanel = apriFascicoloPanel;
				
				apriFascicoloPanel.setSelezioneCorrente("Nessuna Selezione");
				
	        	mnModificaFascicolo.setEnabled(false);
	        	
	        	mntmCancellaFascicolo.setEnabled(false);
	        	
	        	frmMedicalSystemManagment.getRootPane().setDefaultButton(apriFascicoloPanel.btnCerca);
				
				frmMedicalSystemManagment.validate();
			}
		});
		
		mnFascicolo.add(mntmApriFascicolo);
		
		mnModificaFascicolo = new JMenu("Modifica Fascicolo");
		mnModificaFascicolo.setEnabled(false);
		mnFascicolo.add(mnModificaFascicolo);
		
		JMenuItem mntmModificaDati = new JMenuItem("Modifica Dati");
		mnModificaFascicolo.add(mntmModificaDati);
		
		JMenuItem mntmAggiungiMedico = new JMenuItem("Aggiungi Medico");
		mntmAggiungiMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				aggiungiMedico.setLocationRelativeTo(frmMedicalSystemManagment);
				
				aggiungiMedico.setVisible(true);
				
				frmMedicalSystemManagment.getContentPane().add(aggiungiMedico);
				
				frmMedicalSystemManagment.validate();
				
			}
		});
		mnModificaFascicolo.add(mntmAggiungiMedico);
		
		JMenuItem mntmAllegaDocumento = new JMenuItem("Allega Documento");
		mnModificaFascicolo.add(mntmAllegaDocumento);
		
		mntmCancellaFascicolo = new JMenuItem("Cancella Fascicolo");
		mntmCancellaFascicolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Cancella Fascicolo
				int result = JOptionPane.showConfirmDialog(frmMedicalSystemManagment, 
														   "Cancellando il fascicolo tutti i dati andranno persi, continuare?", 
														   "Cancella Fascicolo", 
														   JOptionPane.YES_NO_OPTION, 
														   JOptionPane.WARNING_MESSAGE);
				
				if( result == JOptionPane.OK_OPTION ){
					
					medicalSystem.cancellaFascicolo();
										
	            	frmMedicalSystemManagment.remove(activePanel);
	            	
	            	frmMedicalSystemManagment.setContentPane(nativePanel);
	            	
	            	activePanel = nativePanel;
	            	
		        	mnModificaFascicolo.setEnabled(false);
		        	
		        	mntmCancellaFascicolo.setEnabled(false);
	            	
	            	frmMedicalSystemManagment.validate(); 
	            	
	            	JOptionPane.showMessageDialog(frmMedicalSystemManagment, "Fascicolo cancellato con successo", "Cancellazione Fascicolo", JOptionPane.INFORMATION_MESSAGE);
				}	
			}
		});
		mntmCancellaFascicolo.setEnabled(false);
		mnFascicolo.add(mntmCancellaFascicolo);
		
		JMenu mnDocumenti = new JMenu("Documenti");
		menuBar.add(mnDocumenti);
		
		JMenuItem mntmNuovoDocumento = new JMenuItem("Nuovo Documento");
		mnDocumenti.add(mntmNuovoDocumento);
		
		JMenuItem mntmModificaDocumento = new JMenuItem("Modifica Documento");
		mnDocumenti.add(mntmModificaDocumento);
		
		JMenuItem mntmCancellaDocumento = new JMenuItem("Cancella Documento");
		mnDocumenti.add(mntmCancellaDocumento);
		
		JDesktopPane desktopPane = new JDesktopPane();
		
		GroupLayout groupLayout = new GroupLayout(frmMedicalSystemManagment.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
		);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 900, 526);
		desktopPane.add(panel);
		
		nativePanel = panel;
		activePanel = panel;
		frmMedicalSystemManagment.getContentPane().setLayout(groupLayout);
	}
	
	public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == nuovoFascicoloPanel.btnSalvaFascicolo) {
        	
        	String nome = nuovoFascicoloPanel.getTextFieldNome();
        	String cognome = nuovoFascicoloPanel.getTextFieldCognome();
        	String codiceFiscale = nuovoFascicoloPanel.getTextFieldCodiceFIscale();
        	String domicilio = nuovoFascicoloPanel.getTextFieldDomicilio();
        	String residenza = nuovoFascicoloPanel.getTextFieldResidenza();
        	String categoriaProfessionale = nuovoFascicoloPanel.getTextFieldCategoriaProfessionale();
        	String telFisso = nuovoFascicoloPanel.getTextFieldFisso();
        	String telCell = nuovoFascicoloPanel.getTextFieldCellulare();
        	
        	int giornoNascita = Integer.parseInt( nuovoFascicoloPanel.getComboBoxGiornoNascita() );
        	int annoNascita = Integer.parseInt( nuovoFascicoloPanel.getComboBoxAnnoNascita() );
        	int meseNascita = MedicalSystem.getGiornoFromMese( nuovoFascicoloPanel.getComboBoxMeseNascita() );
        	
        	Fascicolo f = new Fascicolo(nome, cognome, codiceFiscale, giornoNascita, meseNascita, annoNascita, telFisso, telCell, residenza, domicilio, categoriaProfessionale);
        	
        	int returnCode = medicalSystem.aggiungiFascicolo(f);
        	
        	switch( returnCode ){
        	
	        	case -1:
	        		JOptionPane.showMessageDialog(frmMedicalSystemManagment, "Questo paziente  giˆ in archivio!");
	        		
	        		break;
	        	
	        	case 0:
	        		JOptionPane.showMessageDialog(frmMedicalSystemManagment, "Errore nella creazione del fascicolo");
	        		
	        		break;
	        		
	        	case 1:
	    			JOptionPane.showMessageDialog(frmMedicalSystemManagment, "Fascicolo creato con successo");
	            	
	            	frmMedicalSystemManagment.remove(activePanel);
	            	
	            	frmMedicalSystemManagment.setContentPane(nativePanel);
	            	
	            	activePanel = nativePanel;
	            	
	            	frmMedicalSystemManagment.validate(); 
	            	
	            	break;
        	}
        }
        
        if( ae.getSource() == apriFascicoloPanel.btnConsultaSelezionato ){
        	
        	int index = apriFascicoloPanel.listaFascicoli.getSelectedIndex();
        	
        	if( index >= 0 ){
        	
	        	Fascicolo f = medicalSystem.getFascicoloFromList(index, apriFascicoloPanel.isSearch() );
	        	
	        	consultaFascicoloPanel.setOutputNome(f.getNome());
	        	consultaFascicoloPanel.setOutputCognome(f.getCognome());
	        	consultaFascicoloPanel.setOutputCodiceFiscale(f.getCodiceFiscale());
	        	consultaFascicoloPanel.setOutputCategoriaProfessionale(f.getCategoriaProfessionale());
	        	consultaFascicoloPanel.setOutputDomicilio(f.getIndirizzoDomicilio());
	        	consultaFascicoloPanel.setOutputResidenza(f.getIndirizzoResidenza());
	        	consultaFascicoloPanel.setOutputFisso(f.getNumTelCasa());
	        	consultaFascicoloPanel.setOutputCellulare(f.getNumCell());
	        	consultaFascicoloPanel.setOutputDataNascita(f.getStringDataNascita());
	        	consultaFascicoloPanel.setListaMedici( f.getListaMediciString() );
	        	
	        	frmMedicalSystemManagment.remove(activePanel);
	        	
	        	frmMedicalSystemManagment.setContentPane(consultaFascicoloPanel);
	        	
	        	activePanel = consultaFascicoloPanel;
	        	
	        	mnModificaFascicolo.setEnabled(true);
	        	
	        	mntmCancellaFascicolo.setEnabled(true);
	        	
	        	medicalSystem.setFascicoloCorrente(f);
	        	
	        	frmMedicalSystemManagment.validate();
        	}
        	else{
        		
        		JOptionPane.showMessageDialog(frmMedicalSystemManagment, "Devi Selezionare un elemento dalla lista!", "Nessuna Selezione", JOptionPane.WARNING_MESSAGE);
        	}
        }
        
        if( ae.getSource() == apriFascicoloPanel.btnCerca){
        	
        	String nome = apriFascicoloPanel.getInputNome();
        	String cognome = apriFascicoloPanel.getInputCognome();
        	String cf = apriFascicoloPanel.getInputCodiceFiscale();
        	
        	if( nome.isEmpty() && cognome.isEmpty() && cf.isEmpty() ){
        		
				String[] listaFascicoli = medicalSystem.listaFascicoli();
				
				apriFascicoloPanel.setSearch(false);
				
				apriFascicoloPanel.setListaFascicoli( listaFascicoli );
			
        	}
        	else{
	        	
	        	String[] listaRicerca = medicalSystem.cercaFascicolo(nome, cognome, cf);
	        	
	        	String messaggio;
	        	
	        	if( listaRicerca.length == 0){
	        		
	        		messaggio = "Nessun risultato trovato";
	        	}
	        	else{
	        		
	        		messaggio = "Trovati " + listaRicerca.length + " risultati";
	        	}
	        	
	        	JOptionPane.showMessageDialog(frmMedicalSystemManagment, messaggio, "Risultato Ricerca", JOptionPane.INFORMATION_MESSAGE);
	        	
	        	apriFascicoloPanel.setSearch(true);
	        	
	        	apriFascicoloPanel.setListaFascicoli(listaRicerca);
	        
        	}
        }
        
        if( ae.getSource() == aggiungiMedico.okButton ){
        	
        	String nome = aggiungiMedico.getInputNome();
        	String cognome = aggiungiMedico.getInputCognome();
        	String specializzazione = aggiungiMedico.getInputSpecializzazione();
        	String telefonoFisso = aggiungiMedico.getInputTelefonoFisso();
        	String cellulare = aggiungiMedico.getInputCellulare();
        	String fax = aggiungiMedico.getInputFax();
        	String email = aggiungiMedico.getInputEmail();
        	
        	Medico m = new Medico(nome, cognome, specializzazione, telefonoFisso, cellulare, fax, email);
        	
        	medicalSystem.fascicoloCorrente.aggiungiMedico(m);
        	
        	medicalSystem.aggiornaFile();
        	
        	aggiungiMedico.setVisible(false);
        	
        	aggiungiMedico.reset();
        	
        	frmMedicalSystemManagment.getContentPane().remove(aggiungiMedico);
        	
        	frmMedicalSystemManagment.validate();
        	
        	JOptionPane.showMessageDialog(frmMedicalSystemManagment, "Medico aggiunto con successo", "Aggiunta Medico", JOptionPane.INFORMATION_MESSAGE);
        	
        	String[] medici = medicalSystem.getListaMediciString();
        	
        	consultaFascicoloPanel.setListaMedici(medici);
        	
        	
        }
        
        if( ae.getSource() == aggiungiMedico.cancelButton ){
        	
        	aggiungiMedico.setVisible(false);
        	
        	aggiungiMedico.reset();
        	
        	frmMedicalSystemManagment.getContentPane().remove(aggiungiMedico);
        	
        	frmMedicalSystemManagment.validate();
        }
	}

	private class SwingAction extends AbstractAction {
		/**
		 *	Azione del pulsante Esci nel menu File 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "Esci");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
		}
	}
}

