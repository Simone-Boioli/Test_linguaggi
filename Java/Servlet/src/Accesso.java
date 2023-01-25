import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.w3c.dom.*;

public class Accesso extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//creo la sessione
		HttpSession sessione = request.getSession();
			
		MetodiUtili m = new MetodiUtili();
		Document d = null;
		
		//prendo i valori dalla pagina html
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		
		//crea L'albero DOM
		String path = getServletContext().getRealPath("xml/utenti.xml");
		d = m.compilaXML(path, true);
		
		
		//primo elemento ELEMENT
		//Node child = primoElemento(d); // indica il tag utenti
		Node child = d.getDocumentElement();		

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean trovato = false;		
			
		if(userId.equals("admin") && userId.equals("admin")){
			out.println("<!-- HTML 5 -->");

			out.println("<!DOCTYPE html>");

			out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
			out.println("<head>");
				out.println("<meta charset=utf-8\" />");
				out.println("<title> Amministrazione </title>");
				out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" /> <!--  per importare il css -->");
			out.println("</head>");

			out.println("<body>");		
				out.println("<fieldset class=\"OPERAZIONE\">");
					out.println("<legend> Operazione </legend>");
				out.println("</fieldset>");
				
				out.println("<div id=\"AMMINISTRAZIONE\"> <!-- inizio contenuto -->");
					out.println("<h1 class=\"TITOLO\"> Amministrazione </h1>");
		    
					out.println("<form action=\"index.html\">");
						out.println("<button class=\"LOGOUT_ADMIN\" type=\"submit\">");
							out.println("LOGOUT");
						out.println("</button>");
					out.println("</form>");	
					
					out.println("<br />");
					out.println("<br />");
			
					out.println("<div id=\"UTENTI\"> <!-- parte sinistra -->");
				
						out.println("<fieldset class=\"GRANDEZZA\">");
							out.println("<legend> Gestione Utenti </legend>");
							
							out.println("<span class=\"TITOLETTO\"> Aggiungi utente </span>"); 
								
							out.println("<form action=\"s_aggiungiUtente\" method=\"get\">");
							
								out.println("<span class=\"FONT_RICHIESTE\"> Nome utente: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"nome\" /><br /><br />");
				    
								out.println("<span class=\"FONT_RICHIESTE\"> Cognome utente: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"cognome\" /><br /><br />");
				    
								out.println("<span class=\"FONT_RICHIESTE\"> ID Utente: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"idutente\" /><br /><br />");
						
								out.println("<span class=\"FONT_RICHIESTE\"> Password: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"password\" name=\"pass\" /><br /><br />");
				    
								out.println("<span class=\"FONT_RICHIESTE\"> E-mail: <span><br>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"email\" name=\"email\" /><br /><br />");
					
								out.println("<button class=\"BOTTONE_AGGIUNGI_UTENTE\" type=\"submit\">");
									out.println("Aggiungi Utente");
								out.println("</button>");
							out.println("</form>");
					
							out.println("<br />");
							out.println("<br />");
							out.println("<br />");        
			
			
							out.println("<span class=\"TITOLETTO\"> Rimuovi Utente </span>");
		       
								out.println("<form action=\"s_rimuoviUtente\" method=\"get\">");
				
								out.println("<span class=\"FONT_RICHIESTE\"> ID Utente: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"idUtente\" /><br /><br />");
				
								out.println("<button class=\"BOTTONE_RIMUOVI_UTENTE\" type=\"submit\">");
									out.println("Rimuovi Utente");
								out.println("</button>");
			 
							out.println("</form>");
					
							out.println("<br />");
							out.println("<br />");
							out.println("<br />");
					
							
							out.println("<span class=\"TITOLETTO\">Modifica Utente </span>");
							out.println("<form action=\"s_modificaUtente\" method=\"get\">");
				
								out.println("<span class=\"FONT_RICHIESTE\"> ID Utente: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"idutente\" /><br /> <br>");
				    
								out.println("<span class=\"FONT_RICHIESTE\"> Nuovo nome utente: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"nome\" /><br /> <br />");
				    
								out.println("<span class=\"FONT_RICHIESTE\"> Nuovo cognome utente: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"cognome\" /><br /> <br />");
				    
								out.println("<span class=\"FONT_RICHIESTE\"> Nuova password: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"password\" name=\"pass\" /><br /> <br />");
				    
								out.println("<span class=\"FONT_RICHIESTE\"> Nuova E-mail: <span>");	
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"email\" name=\"email\" /><br /> <br />");
			
				
								out.println("<button class=\"BOTTONE_MODIFICA_UTENTE\" type=\"submit\">");
									out.println("Modifica Utente");
								out.println("</button>");
							out.println("</form>");
							
							out.println("<br />");
							out.println("<br />");
							out.println("<br />");
				
				
							out.println("<span class=\"TITOLETTO\">Stampa Utente </span>");
							out.println("<form action=\"s_stampaUtente\" method=\"get\">");
				
								out.println("<span class=\"FONT_RICHIESTE\"> ID Utente: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"idutente\" /><br /> <br>");
					
								out.println("<button class=\"BOTTONE_STAMPA_UTENTE\" type=\"submit\">");
									out.println("Stampa Utente");
								out.println("</button> <br />");
					
							out.println("</form>");	
				
							out.println("<br />");
					
							out.println("<form action=\"s_stampaUtenti\" method=\"get\">");
								out.println("<button class=\"BOTTONE_STAMPA_TUTTI_UTENTI\" type=\"submit\">");
									out.println("Stampa TUTTI gli Utenti");
								out.println("</button>");
							out.println("</form>");
				
							out.println("<br />");
							out.println("<br />");
						out.println("</fieldset>");        
					out.println("</div>");
			    
					out.println("<div id=\"PRODOTTI\">");
						out.println("<fieldset class=\"GRANDEZZA\">");
							out.println("<legend>Gestione Prodotti</legend>");
					
							out.println("<span class=\"TITOLETTO\"> Aggiungi prodotto </span>"); 
						
							out.println("<form action=\"s_aggiungiProdotto\" method=\"get\">");
							
								out.println("<span class=\"FONT_RICHIESTE\"> Prodotto: <span> <br />");
								out.println("<select name=\"nomeProdotto\">");
									out.println("<option value=\"monitor\">Monitor</option>");
									out.println("<option value=\"notebook\">Notebook</option>");
									out.println("<option value=\"hd\">Hard Disk</option>");
								out.println("</select> <br /> <br />");
								
								out.println("<span class=\"FONT_RICHIESTE\"> Marca articolo: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"nomeArticolo\" /><br /> <br />");
		    
								out.println("<span class=\"FONT_RICHIESTE\"> Codice articolo: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"codiceArticolo\" /><br /> <br />");
		    
								out.println("<span class=\"FONT_RICHIESTE\"> Prezzo Articolo: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"prezzoArticolo\" /><br /> <br />");
			
								out.println("<button class=\"BOTTONE_AGGIUNGI_PRODOTTO\" type=\"submit\">");
									out.println("Aggiungi Prodotto");
								out.println("</button>");
							out.println("</form>");
					
							out.println("<br />");
							out.println("<br />");
							out.println("<br />");        
							
							out.println("<span class=\"TITOLETTO\"> Rimuovi Prodotto </span>");
		       
							out.println("<form action=\"s_rimuoviProdotto\" method=\"get\">");
								out.println("<span class=\"FONT_RICHIESTE\"> Codice Prodotto: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"codice\" /><br /><br />");
				
								out.println("<button class=\"BOTTONE_RIMUOVI_PRODOTTO\" type=\"submit\">");
									out.println("Rimuovi Prodotto");
								out.println("</button>");
				
							out.println("</form>"); 
			
							out.println("<br />");
							out.println("<br />");
							out.println("<br />");  
							
							out.println("<span class=\"TITOLETTO\"> Modifica Prodotto </span>");
							
							out.println("<form action=\"s_modificaProdotto\" method=\"get\">");
								out.println("<span class=\"FONT_RICHIESTE\"> Codice Prodotto: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"codice\" /><br /><br />");
								
								out.println("<span class=\"FONT_RICHIESTE\">Nuovo prezzo: <span>");
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"prezzo\" /><br /><br />");
								
								out.println("<button class=\"BOTTONE_MODIFICA_PRODOTTO\" type=\"submit\">");
									out.println("Modifica Prodotto");
								out.println("</button>");
							out.println("</form>"); 
					
							out.println("<br />");
							out.println("<br />");
							out.println("<br />");  
					
							out.println("<span class=\"TITOLETTO\"> Stampa Prodotto </span>");
							out.println("<form action=\"s_stampaProdotto\" method=\"get\">");
			
								out.println("<span class=\"FONT_RICHIESTE\"> Codice prodotto: </span>"); 
								out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"codiceProdotto\" /><br /> <br />");
				
								out.println("<button class=\"BOTTONE_STAMPA_PRODOTTO\" type=\"submit\">");
									out.println("Stampa Prodotto");
								out.println("</button>");
							out.println("</form>");
	    
							out.println("<br />");
							out.println("<br />");
				
							out.println("<form action=\"s_stampaProdotti\" method=\"get\">");
								out.println("<button class=\"BOTTONE_STAMPA_TUTTI_PRODOTTI\" type=\"submit\">");
									out.println("Stampa TUTTI i prodotti");
								out.println("</button>");
							out.println("</form>");
				
							out.println("<br />");
							out.println("<br />");	
								
					
						out.println("</fieldset>");
					out.println("</div>"); //fine prodotti    
				out.println("</div>"); //fine amministrazione
			out.println("</body>");
			out.println("</html>");
		
		//E' un utente
		}else{  
			NodeList list = ((Element)child).getElementsByTagName ("idUtente"); //cerca i tag idUtente
			int len = list.getLength();
						
			for (int i=0; i < len; i++){
					
				String text = (list.item(i).getFirstChild().getNodeValue());	//valore di idUtente
				
				if(text.equals(userId)){
					String password = list.item(i).getNextSibling().getFirstChild().getNodeValue(); // password

					if(password.equals(pass)){	
						trovato = true;
													
						out.println("<!-- HTML 5 -->");

						out.println("<!DOCTYPE html>");

						out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
						out.println("<head>");
							out.println("<meta charset=utf-8\" />");
							out.println("<title> Home </title>");
							out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" /> <!--  per importare il css -->");
						out.println("</head>");

						out.println("<body>");

							out.println("<header id=\"BANNER\"> <!--intestazione -->");
								out.println("<!--logo -->");
								
									out.println("<img class=\"LOGO\" src=\"immagini/logo.png\" />");	
				
								out.println("<!-- form per la ricerca di un articolo -->");
								out.println("<form action=\"s_cercaProdottoRegistrato\" method=\"get\">");
					
									out.println("<!-- selezione -->");
									out.println("<select class=\"SELEZIONE_RICERCA\" name=\"prodotti\">");
										out.println("<option value=\"tutteLeCategorie\" selected=\"selected\">Tutte le Categorie</option>");
										out.println("<option value=\"monitor\">Monitor</option>");
										out.println("<option value=\"notebook\">Notebook</option>");
										out.println("<option value=\"hd\">Hard Disk</option>");
									out.println("</select>");
				
									out.println("<!--testo ricerca -->");
									out.println("<input class=\"TESTO_RICERCA\" type=\"search\" name=\"testoRicerca\" />");
				
									out.println("<!-- bottone ricerca -->");
									out.println("<button class=\"BOTTONE_INVIO\" type=\"submit\">");
										out.println("Cerca");
									out.println("</button>");
								out.println("</form>");	
														
								if(sessione == null){
									out.println("<span class=\"NOME_UTENTE\"> Benvenuto " + userId + "</span>");
								}else{
									out.println("<span class=\"NOME_UTENTE\"> Buongiorno " + userId + "</span>");
								}
								
								out.println("<p class=\"LOGOUT\">");
									out.println("<a href=\"index.html\"> Logout </a>");
								out.println("</p>");
			
								out.println("<form action=\"s_carrello\" method=\"get\">");
								out.println("<a href=\"s_carrello\" target=\"_blank\">");
									out.println("<img class=\"CARRELLO\" src=\"immagini/carrello.gif\" />");
									out.println("</a>");
							out.println("</form>");
								
								out.println("<p class=\"RICERCA-AVANZATA\">");
									out.println("<a href=\"ricerca_avanzata_registrato.html\"> Ricerca Avanzata </a>");
								out.println("</p>");
								
							out.println("</header> <!-- fine intestazione -->");
				
							out.println("<hr />");

		
							out.println("<div id=\"CONTENUTO\"> <!--inizio contenuto -->");
								out.println("<img src=\"immagini/monitor1.jpg\" width=\"380\" height=\"285\" class=\"IMM1\"/>");
								out.println("<img src=\"immagini/pc1.jpg\" width=\"361\" height=\"271\" class=\"IMM2\"/>");
								out.println("<img src=\"immagini/hd2.jpg\" width=\"279\" height=\"184\" class=\"IMM3\"/>");
								out.println("<img src=\"immagini/pc2.jpg\" width=\"287\" height=\"235\" class=\"IMM4\"/>");
								out.println("<img src=\"immagini/hd1.jpg\" width=\"248\" height=\"204\" class=\"IMM5\"/>");
							out.println("</div> <!-- fine contenuto -->");
		
							out.println("<footer id=\"FOOTER\"> <!-- inizio pie di pagina -->");
								out.println("<p class=\"FOO\">Copyright &copy; 2013 Simone Boioli </p>");
							out.println("</footer> <!-- fine pie di pagina -->");
	
						out.println("</body>");
						out.println("</html>");						
					}
				}
				
				if(trovato){
					break;
				}
			}
			//non e' stata trovata nessuna corrispondenza
			if(trovato == false){
				out.println("<html>");
				out.println("<head>");
				out.println("<title> errore </title>" );
				out.println("</head>");
			
				out.println("<body>");
		
				
				out.println("ERRORE - NESSUNA CORRISPONDENZA TROVATA" + "<br>");
				out.println("<a href=\"accesso.html\"> Torna Indietro </a>");
				
				out.println("<body>");
				out.println("</html>");
			}
		}

		out.close();
	}	
}
