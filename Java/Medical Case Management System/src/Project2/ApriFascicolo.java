package Project2;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ApriFascicolo extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3629984093807568252L;
	private JTextField ricercaNome;
	private JTextField ricercaCognome;
	private JTextField ricercaCodiceFiscale;
	private JLabel selezioneCorrente;
	
	public JButton btnConsultaSelezionato;
	public JList listaFascicoli;
	public JButton btnCerca;
	
	private boolean isSearch = false;

	/**
	 * Create the panel.
	 */
	public ApriFascicolo() {
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Elenco Fascicoli", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Ricerca", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Consulta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		btnConsultaSelezionato = new JButton("Consulta Selezionato");
		
		selezioneCorrente = new JLabel("Nessuna Selezione");
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnConsultaSelezionato)
						.addComponent(selezioneCorrente))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(selezioneCorrente)
					.addGap(15)
					.addComponent(btnConsultaSelezionato)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblNome = new JLabel("Nome ");
		
		ricercaNome = new JTextField();
		ricercaNome.setColumns(15);
		
		JLabel lblCognome = new JLabel("Cognome");
		
		ricercaCognome = new JTextField();
		ricercaCognome.setColumns(15);
		
		JLabel lblCodiceFiscale = new JLabel("Codice Fiscale");
		
		ricercaCodiceFiscale = new JTextField();
		ricercaCodiceFiscale.setColumns(15);
		
		btnCerca = new JButton("Cerca");
		
		JLabel lblNotaEPossibile = new JLabel("Nota: E' possibile riempire solo alcuni campi");
		lblNotaEPossibile.setForeground(Color.BLUE);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNome)
						.addComponent(ricercaNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCognome)
						.addComponent(ricercaCognome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodiceFiscale)
						.addComponent(ricercaCodiceFiscale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCerca)
						.addComponent(lblNotaEPossibile))
					.addContainerGap(227, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ricercaNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCognome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ricercaCognome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCodiceFiscale)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ricercaCodiceFiscale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCerca)
					.addGap(18)
					.addComponent(lblNotaEPossibile)
					.addContainerGap(223, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
				
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		listaFascicoli = new JList();
		
		listaFascicoli.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String selezione = (String) listaFascicoli.getSelectedValue();
				
				if( selezione != null){
				
					selezione.trim();
					
					selezione = selezione.substring(selezione.length()-16, selezione.length());
					
					setSelezioneCorrente(selezione);
				}
			}
		});
		listaFascicoli.setVisibleRowCount(15);
		listaFascicoli.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(listaFascicoli);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}

	public void setListaFascicoli( String[] listaFascicoli ) {
		
		this.listaFascicoli.setListData( listaFascicoli );
	}
	
	public void setSelezioneCorrente(String cf){
		
		selezioneCorrente.setText(cf);
	}

	public String getInputNome() {
		
		return ricercaNome.getText();
	}

	public String getInputCognome() {
		
		return ricercaCognome.getText();
	}

	public String getInputCodiceFiscale() {
		
		return ricercaCodiceFiscale.getText();
	}
	
	public boolean isSearch(){
		
		return isSearch;
	}
	
	public void setSearch(boolean s){
		
		this.isSearch = s;
	}
}

