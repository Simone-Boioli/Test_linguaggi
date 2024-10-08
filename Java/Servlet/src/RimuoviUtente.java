import java.io.File;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import org.w3c.dom.*;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class RimuoviUtente extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		MetodiUtili m = new MetodiUtili();
		
		Document d = null;
		Node rimosso = null;  //nodo rimosso
	
		//prendo il valore del prodotto
		String idutente = request.getParameter("idUtente");
		
		//crea L'albero DOM
		String path = getServletContext().getRealPath("xml/utenti.xml");
		d = m.compilaXML(path, true);
				
		//primo elemento ELEMENT
		Node child = d.getDocumentElement(); //utenti
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
						
		NodeList list =((Element)child).getElementsByTagName("utente"); //lista di tutti gli utenti
		int len = list.getLength();
		
		for(int i = 0; i < len; i++){
			NodeList id = ((Element)list.item(i)).getElementsByTagName("idUtente");
			
			Node userId = id.item(0);
			
			String t = userId.getFirstChild().getNodeValue();

			Node root; //nodo utenti
			Node u;
			
			if(t.equals(idutente)){ // abbiamo trovato l'utente
				
				u = userId.getParentNode();
				root = userId.getParentNode().getParentNode(); // ci troviamo a utenti
								
				rimosso = root.removeChild(u);
			}
			if(rimosso != null){
				break;
			}
			
		}
		
		m.scrivi(d, new File(path));

		
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
				
				if(rimosso != null){
					out.println("UTENTE: " + idutente +"  Rimosso CORRETTAMENTE");
				}else{
					out.println("ERRORE - UTENTE NON RIMOSSO");
				}
				
				
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
								out.println("<option value=\"Monitor\">Monitor</option>");
								out.println("<option value=\"Notebook\">Notebook</option>");
								out.println("<option value=\"Hard_Disk\">Hard Disk</option>");
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
		
		
		
		out.close();
		
	}
}
