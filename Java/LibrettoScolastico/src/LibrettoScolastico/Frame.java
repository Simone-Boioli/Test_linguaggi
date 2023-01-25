package LibrettoScolastico;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame{
	private static final long serialVersionUID = 1L; //???????????????
	
	private JPanel menu;
	private JPanel rightPanel;
	
	private JButton riepilogoButton;
	private JButton addVotoButton;
	private JButton remouveVotoButton;
	private JButton matAddButton;
	private JButton matModButton;
	private JButton matRemoveButton;
	private JButton vediVoti;
	
	private LibrettoScolastico LS;
	
	//costruttore
	public Frame(){
		super("Libretto Scolastico");  //titolo finestra
		setLayout(new BorderLayout()); ////
		LS = new LibrettoScolastico();
		
		//creazione del menu
		this.menu = new JPanel(new GridLayout(9,1)); ///
		
		this.riepilogoButton = new JButton("Riepilogo");
		this.addVotoButton = new JButton("Inserisci Voto");
		this.remouveVotoButton = new JButton("Rimuovi Voto");
		this.matAddButton = new JButton("Aggiungi Materia");
		this.matModButton = new JButton("Modifica Materia");
		this.matRemoveButton = new JButton("Elimina Materia");
		
		this.vediVoti = new JButton("Vedi Voti");
		
		this.menu.add(new JPanel());
		this.menu.add(this.riepilogoButton);
		this.menu.add(this.addVotoButton);
		this.menu.add(this.remouveVotoButton);
		this.menu.add(this.matAddButton);
		this.menu.add(this.matModButton);
		this.menu.add(this.matRemoveButton);
		this.menu.add(this.vediVoti);
		
		this.add(menu, BorderLayout.WEST);
		
		this.rightPanel = new JPanel();
		if(LS.size() == 0){
			this.rightPanel.add(new MaterieAddPanel());
		}else{
			this.rightPanel.add(new RiepilogoPanel());
		}
		add(this.rightPanel, BorderLayout.CENTER);
	}
	
	//classe innestata per gestire le materie
		class MaterieAddPanel extends JPanel{
			private static final long serialVersionUID = 1L; //??????????
			JTextField nomeTextField;
			
			//costruttore
			MaterieAddPanel(){
				setLayout(new BorderLayout());
				JLabel titolo = new JLabel("Aggiungi una nuova materia");
				titolo.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 25));
				titolo.setHorizontalAlignment(SwingConstants.CENTER);
				
				add(titolo, BorderLayout.NORTH);
				
				JLabel nomeLabel = new JLabel("Nuova Materia: ");
				this.nomeTextField = new JTextField("", 10);
				JButton aggiungi = new JButton("Aggiungi");
				JPanel panel = new JPanel(new FlowLayout());
				
				panel.add(nomeLabel);
				panel.add(nomeTextField);
				panel.add(aggiungi);
				add(panel, BorderLayout.CENTER);
				
				//controllo se ci sono già maerie inserite o il libretto è vuoto
				if(LS.size() != 0){
					JTextArea mat = new JTextArea("Materie già inserire:\n ");
					mat.setEditable(false);
					
					for(int i = 0; i <LS.size(); i++){
						mat.append(" - " + LS.get(i).getNome() + "\n");
					}
					
					add(new JScrollPane(mat), BorderLayout.SOUTH);
				}
				
				aggiungi.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent event){
							String n = nomeTextField.getText(); //prendo la materia che inserisco nel textfield
							if(n == "")return;
							n = n.substring(0, 1).toUpperCase() + n.substring(1); //ritorna la Stringa con la prima lettera maiuscola
							nomeTextField.setText(n); // mi riscrive nel TextField la materia con la prima lettera Maiuscola
							LS.addMateria(n);  //aggiunge la materia al array
							JOptionPane.showMessageDialog(null, "Inserita nuova materia \"" + n + "\"", 
									"Nuova Materia Inserita", JOptionPane.INFORMATION_MESSAGE);
							nomeTextField.setText(" "); //cancella quello che abbiamo digitato
							rightPanel.removeAll();  //???
//^^^^^^^^^^^^^^^^^^        //rightPanel.add(new MateriaAddPanel());  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
							rightPanel.repaint(); //cancella la schermata
							rightPanel.validate();
						}
					}
				);
			}
		}
		
	//classe innestata per fare il riepilogo
		class RiepilogoPanel extends JPanel{
			private static final long serialVersionUID = 1L; ///?????????????????
			
			//costruttore
			RiepilogoPanel(){
				setLayout(new BorderLayout(5,5));
				
				//titolo del layout
				JLabel titolo = new JLabel("Riepilogo Materie");
				titolo.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 25));
				titolo.setHorizontalAlignment(SwingConstants.CENTER);
				add(titolo, BorderLayout.NORTH);
				
				JLabel riepMateriePanel = new JLabel(LS.size() != 0 ? "Materie: " + LS.size() : "Nessuna materia inserita"); //operatore ternario
				
				riepMateriePanel.setHorizontalAlignment(SwingConstants.CENTER);
				
				JPanel riepilogoLabelPanel = new JPanel(new GridLayout(2,1));
				
				riepilogoLabelPanel.add(riepMateriePanel); //aggiungo il numero di materie nel pannello
				
				add(riepilogoLabelPanel, BorderLayout.CENTER);
				
				//TExta area con l riepilogo di tutto
				JTextArea riepilogo = new JTextArea(15,22);
				riepilogo.setText(LS.riepilogo());  //metodo che riepiloga le materie inserite
				riepilogo.setEditable(false); //la zona testo non è editabile
				
				JScrollPane scroll = new JScrollPane(riepilogo, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
						                             JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				scroll.setMaximumSize(new Dimension(100,100));
				add(scroll, BorderLayout.SOUTH);
				
			}
			
		}
}
