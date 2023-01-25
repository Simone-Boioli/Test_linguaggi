import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
@SuppressWarnings("serial")
public class Finestra extends JFrame {
	
			JTextField textCognome;
			JTextField textNome;
			JButton buttonCercaUtente;
			JLabel searchCognome;
			JLabel searchNome;
			JLabel utenteTrovato1;
			JLabel utenteTrovato2;
			JLabel utenteTrovato3;
			JLabel utenteTrovato4;
			JLabel utenteTrovato5;
			JLabel utenteTrovato6;
			JLabel utenteTrovato7;
			JLabel utenteTrovato8;
			JLabel utenteTrovato9;
			
			JTextField textAddCognome;
			JTextField textAddNome;
			JTextField textAddTel;
			JTextField textAddCell;
			JTextField textAddEmail;
			JTextField textAddVia;
			JTextField textAddNCivico;
			JTextField textAddCitta;
			JTextField textAddProv;
			JButton buttonAggiungiUtente;
			JLabel addCognome;
			JLabel addNome;
			JLabel addTel;
			JLabel addCell;
			JLabel addEmail;
			JLabel addVia;
			JLabel addNCivico;
			JLabel addCitta;
			JLabel addProv;
			JLabel utenteAggiunto;

			
			
			JTextField textDeleteCognome;
			JTextField textDeleteNome;
			JButton buttonEliminaUtente;
			JLabel deleteCognome;
			JLabel deleteNome;
			JLabel eliminato;
			
			
			Ascoltatore search;
			Ascoltatore add;
			Ascoltatore delete;
			
			public Finestra(){
				
				/**
				 * 
				 * 	//////////////////////MODULO CERCA UTENTE//////////////////////////////
				 * 
				 */
				
				/*
				 * TEXTFIELD
				 */
				
				//cognome
				textCognome = new JTextField();
				textCognome.setBounds(100,10,150,25);
				this.add(textCognome);   // aggiungi al frame di base il textfield
				
				//nome
				textNome = new JTextField();
				textNome.setBounds(100,45,150,25);
				this.add(textNome);
				
				/*
				 * LABEL
				 */
				
				//cognome
				searchCognome = new JLabel("Cognome:");   //text field del nome
				searchCognome.setBounds(10,18,100,15);
				this.add(searchCognome);
				
				//nome
				searchNome = new JLabel("Nome:");   //text field del nome
				searchNome.setBounds(10,50,100,10);
				this.add(searchNome);
				
				/*
				 * BUTTON
				 */
				
				//cerca utente
				buttonCercaUtente = new JButton("CERCA UTENTE");
				buttonCercaUtente.setBounds(30,80,200,25);
				this.add(buttonCercaUtente);   
				
				/*
				 * LISTENER
				 */
				
				search = new Ascoltatore(this.textCognome, this.textNome);
				buttonCercaUtente.addActionListener(search);
				
				
				/**
				 * 
				 *  ///////////////////////MODULO INSERISCI UTENTE////////////////////////// 
				 * 
				 */
				
				/*
				 * TEXTFIELD
				 */
				
				//cognome
				textAddCognome = new JTextField();
				textAddCognome.setBounds(450,10,150,25);
				this.add(textAddCognome);
				
				//nome
				textAddNome = new JTextField();
				textAddNome.setBounds(450,45,150,25);
				this.add(textAddNome);
				
				//telefono
				textAddTel = new JTextField();
				textAddTel.setBounds(450,80,150,25);
				this.add(textAddTel);
				
				//cellulare
				textAddCell = new JTextField();
				textAddCell.setBounds(450,115,150,25);
				this.add(textAddCell);
				
				//e-mail
				textAddEmail = new JTextField();
				textAddEmail.setBounds(450,150,150,25);
				this.add(textAddEmail);
				
				//via
				textAddVia = new JTextField();
				textAddVia.setBounds(450,185,150,25);
				this.add(textAddVia);
				
				// numero civico
				textAddNCivico = new JTextField();
				textAddNCivico.setBounds(450,220,150,25);
				this.add(textAddNCivico);
				
				//città
				textAddCitta = new JTextField();
				textAddCitta.setBounds(450,255,150,25);
				this.add(textAddCitta);
				
				//provincia
				textAddProv = new JTextField();
				textAddProv.setBounds(450,290,150,25);
				this.add(textAddProv);
				
				/*
				 * LABEL
				 */
				
				//cognome
				addCognome = new JLabel("Cognome: ");
				addCognome.setBounds(350,18,100,15);
				this.add(addCognome);
				
				//nome
				addNome = new JLabel("Nome: ");
				addNome.setBounds(350,50,100,10);
				this.add(addNome);
				
				//telefono
				addTel = new JLabel("Telefono: ");
				addTel.setBounds(350,85,100,10);
				this.add(addTel);
				
				//cellulare
				addCell = new JLabel("Cellulare: ");
				addCell.setBounds(350,120,100,10);
				this.add(addCell);
				
				//email
				addEmail = new JLabel("E-mail: ");
				addEmail.setBounds(350,155,100,10);
				this.add(addEmail);
				
				//via
				addVia = new JLabel("Via: ");
				addVia.setBounds(350,190,100,10);
				this.add(addVia);
				
				//n°civico
				addNCivico = new JLabel("N° Civico: ");
				addNCivico.setBounds(350,225,100,10);
				this.add(addNCivico);
				
				//città
				addCitta = new JLabel("Città: ");
				addCitta.setBounds(350,260,100,10);
				this.add(addCitta);
				
				//provincia
				addProv = new JLabel("Provincia: ");
				addProv.setBounds(350,295,100,10);
				this.add(addProv);
				
				
				/*
				 *  BUTTON
				 */
				
				buttonAggiungiUtente = new JButton("AGGIUNGI UTENTE");
				buttonAggiungiUtente.setBounds(380,325,200,25);
				this.add(buttonAggiungiUtente);
				
				/*
				 * LISTENER
				 */
				add = new Ascoltatore(this.textAddCognome, this.textAddNome, this.textAddTel,
					                  this.textAddCell, this.textAddEmail, this.textAddVia,
					                  this.textAddNCivico, this.textAddCitta, this.textAddProv);
				buttonAggiungiUtente.addActionListener(add);
				
				
				
				
				
				/**
				 * 
				 *  /////////////////MODULO ELIMINA UTENTE////////////////////
				 * 
				 */
				
				/*
				 * TEXTFIELD
				 */
				
				//cognome
				textDeleteCognome = new JTextField();
				textDeleteCognome.setBounds(800,10,150,25);
				this.add(textDeleteCognome);
				
				//nome
				textDeleteNome = new JTextField();
				textDeleteNome.setBounds(800,45,150,25);
				this.add(textDeleteNome);
				
				/*
				 * LABEL
				 */
				
				//cognome
				deleteCognome = new JLabel("Cognome: ");
				deleteCognome.setBounds(690,18,100,15);
				this.add(deleteCognome);
				
				//nome
				deleteNome = new JLabel("Nome: ");
				deleteNome.setBounds(690,50,100,10);
				this.add(deleteNome);
								
				
				/*
				 * BUTTON
				 */
				
				//elimina utente
				buttonEliminaUtente = new JButton("ELIMINA UTENTE");
				buttonEliminaUtente.setBounds(725,80,200,25);
				this.add(buttonEliminaUtente);
				
				/*
				 * LISTENER
				 */

				delete = new Ascoltatore(this.textDeleteCognome, this.textDeleteNome);
				buttonEliminaUtente.addActionListener(delete);
				
				
				
				/**
				 * 
				 *  ////////////////////////////SETUP/////////////////////////////////// 
				 * 
				 */
				
				this.setLayout(null);
				this.setSize(1050,600);
				this.setVisible(true);
			}
			public void userDelete(){
				eliminato = new JLabel("Utente eliminato!");
				eliminato.setBounds(760,125,200,25);
				this.add(eliminato);
			}
			
			public void userAdd(){
				utenteAggiunto = new JLabel("Utente Aggiunto");
				utenteAggiunto.setBounds(380,360,200,25);
				this.add(utenteAggiunto);
			}
			
			public void userSearch(){
				utenteTrovato1 = new JLabel("COGNOME:                 "+ Rubrica.arr[0]);
				utenteTrovato1.setBounds(10,130,200,15);
				this.add(utenteTrovato1);
				
				utenteTrovato2 = new JLabel("NOME:                         "+ Rubrica.arr[1]);
				utenteTrovato2.setBounds(10,160,200,15);
				this.add(utenteTrovato2);
				
				utenteTrovato3 = new JLabel("TELEFONO:                 "+ Rubrica.arr[2]);
				utenteTrovato3.setBounds(10,190,200,15);
				this.add(utenteTrovato3);
				
				utenteTrovato4 = new JLabel("CELLULARE:                "+ Rubrica.arr[3]);
				utenteTrovato4.setBounds(10,220,200,15);
				this.add(utenteTrovato4);
				
				utenteTrovato5 = new JLabel("E-MAIL:                        "+ Rubrica.arr[4]);
				utenteTrovato5.setBounds(10,250,200,15);
				this.add(utenteTrovato5);
				
				utenteTrovato6 = new JLabel("ABITA A:                       "+ Rubrica.arr[5]);
				utenteTrovato6.setBounds(10,280,200,15);
				this.add(utenteTrovato6);
				
				utenteTrovato7 = new JLabel("IN VIA:                          "+ Rubrica.arr[6]);
				utenteTrovato7.setBounds(10,310,200,15);
				this.add(utenteTrovato7);
				
				utenteTrovato8 = new JLabel("AL N° CIVICO:              "+ Rubrica.arr[7]);
				utenteTrovato8.setBounds(10,340,200,15);
				this.add(utenteTrovato8);
				
				utenteTrovato9 = new JLabel("IN PROVINCIA DI:         "+ Rubrica.arr[8]);
				utenteTrovato9.setBounds(10,370,200,15);
				this.add(utenteTrovato9);
				
			}
}
