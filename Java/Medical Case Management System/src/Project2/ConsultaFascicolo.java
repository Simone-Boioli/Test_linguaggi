package Project2;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JButton;


public class ConsultaFascicolo extends JPanel {

	private static final long serialVersionUID = -8993454118759427332L;
	
	private JLabel OutputNome;
	private JLabel OutputCategoriaProfessionale;
	private JLabel OutputCodiceFiscale;
	private JLabel OutputDataNascita;
	private JLabel OutputCognome;
	private JList listaMedici;
	private JList listaDocumenti;
	private JLabel OutputResidenza;
	private JLabel OutputDomicilio;
	private JLabel OutputFisso;
	private JLabel OutputCellulare;

	public JButton btnInformazioni;
	
	/**
	 * Create the panel.
	 */
	public ConsultaFascicolo() {
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dati Anagrafici", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Dati di Contatto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Allegati", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblMedici = new JLabel("Medici");
		
		btnInformazioni = new JButton("Informazioni");
		
		listaMedici = new JList();
		
		JLabel lblDocumenti = new JLabel("Documenti");
		
		listaDocumenti = new JList();
		
		JButton btnVisualizza = new JButton("Visualizza");
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblMedici)
									.addPreferredGap(ComponentPlacement.RELATED, 754, Short.MAX_VALUE)
									.addComponent(lblDocumenti))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(listaMedici, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
									.addComponent(listaDocumenti, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(btnInformazioni)
							.addPreferredGap(ComponentPlacement.RELATED, 629, Short.MAX_VALUE)
							.addComponent(btnVisualizza)))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMedici)
						.addComponent(lblDocumenti))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(listaMedici, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
						.addComponent(listaDocumenti, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnInformazioni)
						.addComponent(btnVisualizza)))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblResidenza = new JLabel("Residenza");
		lblResidenza.setForeground(Color.BLUE);
		
		OutputResidenza = new JLabel("outputResidenza");
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setForeground(Color.BLUE);
		
		OutputDomicilio = new JLabel("outputDomicilio");
		
		JLabel lblTelefonoFisso = new JLabel("Telefono Fisso");
		lblTelefonoFisso.setForeground(Color.BLUE);
		
		OutputFisso = new JLabel("outputFisso");
		
		JLabel lblTelefonoCellulare = new JLabel("Telefono Cellulare");
		lblTelefonoCellulare.setForeground(Color.BLUE);
		
		OutputCellulare = new JLabel("outputCellulare");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblResidenza)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(OutputResidenza)
							.addGap(18)
							.addComponent(lblDomicilio)
							.addGap(6)
							.addComponent(OutputDomicilio))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblTelefonoFisso)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(OutputFisso)
							.addGap(18)
							.addComponent(lblTelefonoCellulare)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(OutputCellulare)))
					.addContainerGap(498, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResidenza)
						.addComponent(OutputResidenza)
						.addComponent(lblDomicilio)
						.addComponent(OutputDomicilio))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefonoFisso)
						.addComponent(OutputFisso)
						.addComponent(lblTelefonoCellulare)
						.addComponent(OutputCellulare))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.BLUE);
		
		OutputNome = new JLabel("New label");
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setForeground(Color.BLUE);
		
		OutputCognome = new JLabel("New label");
		
		JLabel lblCodiceFiscale = new JLabel("Codice Fiscale");
		lblCodiceFiscale.setForeground(Color.BLUE);
		
		OutputCodiceFiscale = new JLabel("New label");
		
		JLabel lblCategoriaProfessionale = new JLabel("Categoria Professionale");
		lblCategoriaProfessionale.setForeground(Color.BLUE);
		
		OutputCategoriaProfessionale = new JLabel("New label");
		
		JLabel lblDataDiNascita = new JLabel("Data di Nascita");
		lblDataDiNascita.setForeground(Color.BLUE);
		
		OutputDataNascita = new JLabel("dataNascita");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(OutputNome)
							.addGap(30)
							.addComponent(lblCognome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(OutputCognome)
							.addGap(30)
							.addComponent(lblDataDiNascita)
							.addGap(6)
							.addComponent(OutputDataNascita))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCodiceFiscale)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(OutputCodiceFiscale))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCategoriaProfessionale)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(OutputCategoriaProfessionale)))
					.addContainerGap(403, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(lblCognome)
						.addComponent(lblDataDiNascita)
						.addComponent(OutputNome)
						.addComponent(OutputCognome)
						.addComponent(OutputDataNascita))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodiceFiscale)
						.addComponent(OutputCodiceFiscale))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategoriaProfessionale)
						.addComponent(OutputCategoriaProfessionale))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}

	public void setOutputResidenza(String outputResidenza) {
		OutputResidenza.setText(outputResidenza);
	}

	public void setOutputFisso(String outputFisso) {
		OutputFisso.setText(outputFisso);
	}

	public void setOutputDomicilio(String outputDomicilio) {
		OutputDomicilio.setText(outputDomicilio);
	}

	public void setOutputCellulare(String outputCellulare) {
		OutputCellulare.setText(outputCellulare);
	}

	public void setList(String[] list) {
		
		this.listaMedici.setListData(list);
	}

	public void setOutputNome(String outputNome) {
		OutputNome.setText(outputNome);
	}

	public void setOutputCategoriaProfessionale(String outputCategoriaProfessionale) {
		OutputCategoriaProfessionale.setText(outputCategoriaProfessionale);
	}

	public void setOutputCodiceFiscale(String outputCodiceFiscale) {
		OutputCodiceFiscale.setText(outputCodiceFiscale);
	}

	public void setOutputDataNascita(String outputDataNascita) {
		OutputDataNascita.setText(outputDataNascita);
	}

	public void setOutputCognome(String outputCognome) {
		OutputCognome.setText(outputCognome);
	}
	
	public void setListaMedici( String[] medici ){
		
		listaMedici.setListData(medici);
	}
}
