package Project2;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class NuovoFascicolo extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4557360142327855204L;
	
	private JTextField textFieldNome;
	private JTextField textFieldCognome;
	private JTextField textFieldCodiceFIscale;
	private JTextField textFieldCategoriaProfessionale;
	private JTextField textFieldResidenza;
	private JTextField textFieldDomicilio;
	private JTextField textFieldFisso;
	private JTextField textFieldCellulare;
	
	private JComboBox comboBoxGiornoNascita;
	private JComboBox comboBoxMeseNascita;
	private JComboBox comboBoxAnnoNascita;
	
	JButton btnSalvaFascicolo;
	
	/**
	 * Create the panel.
	 */
	public NuovoFascicolo() {
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dati Anagrafici", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Dati di Contatto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		btnSalvaFascicolo = new JButton("Salva Fascicolo");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
						.addComponent(btnSalvaFascicolo))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSalvaFascicolo)
					.addContainerGap(143, Short.MAX_VALUE))
		);
		
		JLabel lblResidenza = new JLabel("Residenza");
		
		textFieldResidenza = new JTextField();
		lblResidenza.setLabelFor(textFieldResidenza);
		textFieldResidenza.setColumns(20);
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		
		textFieldDomicilio = new JTextField();
		lblDomicilio.setLabelFor(textFieldDomicilio);
		textFieldDomicilio.setColumns(20);
		
		JLabel lblTelefonoFisso = new JLabel("Telefono Fisso");
		
		textFieldFisso = new JTextField();
		lblTelefonoFisso.setLabelFor(textFieldFisso);
		textFieldFisso.setColumns(20);
		
		JLabel lblTelefonoCellulare = new JLabel("Telefono Cellulare");
		
		textFieldCellulare = new JTextField();
		lblTelefonoCellulare.setLabelFor(textFieldCellulare);
		textFieldCellulare.setColumns(20);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblResidenza)
						.addComponent(textFieldResidenza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldFisso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefonoFisso))
					.addGap(30)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDomicilio)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldCellulare, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTelefonoCellulare))
							.addContainerGap(332, Short.MAX_VALUE))
						.addComponent(textFieldDomicilio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResidenza)
						.addComponent(lblDomicilio))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldResidenza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldDomicilio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefonoCellulare)
						.addComponent(lblTelefonoFisso))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldCellulare, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldFisso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNome = new JLabel("Nome");
		
		textFieldNome = new JTextField();
		lblNome.setLabelFor(textFieldNome);
		textFieldNome.setColumns(20);
		
		JLabel lblCognome = new JLabel("Cognome");
		
		textFieldCognome = new JTextField();
		lblCognome.setLabelFor(textFieldCognome);
		textFieldCognome.setColumns(20);
		
		JLabel lblCodiceFiscale = new JLabel("Codice Fiscale");
		
		textFieldCodiceFIscale = new JTextField();
		lblCodiceFiscale.setLabelFor(textFieldCodiceFIscale);
		textFieldCodiceFIscale.setColumns(20);
		
		JLabel lblCategoriaProfessionale = new JLabel("Categoria Professionale");
		
		textFieldCategoriaProfessionale = new JTextField();
		lblCategoriaProfessionale.setLabelFor(textFieldCategoriaProfessionale);
		textFieldCategoriaProfessionale.setColumns(20);
		
		//Giorni
		String[] giorni = new String[31];
		
		for(int i=0;i<31;i++){
			
			giorni[i] = Integer.toString(i+1);
		}
		
		comboBoxGiornoNascita = new JComboBox(giorni);
		
		//Mesi
		String[] mesi = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
		
		comboBoxMeseNascita = new JComboBox(mesi);
		
		//Anni
		int bottom = 1900;
		int top = 2012;
		
		int index = 0;
		
		String[] anni = new String[top-bottom];
		
		for(int i=bottom;i<top;i++){
			
			anni[index] = Integer.toString(i+1);
			
			index++;
		}
		
		comboBoxAnnoNascita = new JComboBox(anni);
		
		JLabel lblDataDiNascita = new JLabel("Data di nascita");
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNome)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodiceFiscale)
						.addComponent(textFieldCodiceFIscale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldCategoriaProfessionale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblCategoriaProfessionale)
										.addComponent(lblCognome))
									.addGap(124))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textFieldCognome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDataDiNascita)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(comboBoxGiornoNascita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxMeseNascita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxAnnoNascita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(lblDataDiNascita)
						.addComponent(lblCognome))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxGiornoNascita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxMeseNascita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxAnnoNascita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCognome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategoriaProfessionale)
						.addComponent(lblCodiceFiscale))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldCategoriaProfessionale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCodiceFIscale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
	}
	
	public String getTextFieldNome() {
		return textFieldNome.getText();
	}

	public String getTextFieldCognome() {
		return textFieldCognome.getText();
	}

	public String getTextFieldCodiceFIscale() {
		return textFieldCodiceFIscale.getText();
	}

	public String getTextFieldCategoriaProfessionale() {
		return textFieldCategoriaProfessionale.getText();
	}

	public String getTextFieldResidenza() {
		return textFieldResidenza.getText();
	}

	public String getTextFieldDomicilio() {
		return textFieldDomicilio.getText();
	}

	public String getTextFieldFisso() {
		return textFieldFisso.getText();
	}

	public String getTextFieldCellulare() {
		return textFieldCellulare.getText();
	}

	public String getComboBoxGiornoNascita() {
		return (String) comboBoxGiornoNascita.getSelectedItem();
	}

	public String getComboBoxMeseNascita() {
		return (String) comboBoxMeseNascita.getSelectedItem();
	}

	public String getComboBoxAnnoNascita() {
		return (String) comboBoxAnnoNascita.getSelectedItem();
	}
	
	
}
