import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import org.w3c.dom.*;              //manipolano elementi DOM

public class ModificaUtente extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		MetodiUtili m = new MetodiUtili();
		
		Document d = null;
		Node modifica = null;
		
		//prendo i valori dalla pagina html
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String userId = request.getParameter("idutente");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		//crea L'albero DOM
		String path = getServletContext().getRealPath("xml/utenti.xml");
		d = m.compilaXML(path, true);
				
		//primo elemento ELEMENT
		Node child = d.getDocumentElement(); //utenti
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
			
		Node u; //utente
		Node n; //nome
		Node c; //cognome
		Node ID; //user id
		Node p; //password
		Node e; //email
		Node punti; //punti
		Node den; //denaro
		
		u = d.createElement("utente"); // Nodo di utente
		
		n = d.createElement("nome");
		n.appendChild(d.createTextNode(nome));
		u.appendChild(n);
		
		c = d.createElement("cognome");
		c.appendChild(d.createTextNode(cognome));
		u.appendChild(c);
	       
		ID = d.createElement("idUtente");
		ID.appendChild(d.createTextNode(userId));
		u.appendChild(ID);
		
		p = d.createElement("pass");
		p.appendChild(d.createTextNode(pass));
		u.appendChild(p);
		
		e = d.createElement("email");
		e.appendChild(d.createTextNode(email));
		u.appendChild(e);
		
		den = d.createElement("denaro");
		den.appendChild(d.createTextNode("100"));
		u.appendChild(den);
		
		punti = d.createElement("punti");
		punti.appendChild(d.createTextNode("0"));
		u.appendChild(punti);
				
		NodeList list = ((Element)child).getElementsByTagName("idUtente"); //lista degli idUtente
		int len = list.getLength();

		for(int i = 0; i < len; i++){
			Node idu = list.item(i);

			if(idu.getFirstChild().getNodeValue().equals(userId)){
				Node utente = idu.getParentNode();
				Node root = utente.getParentNode();
				
				modifica = root.replaceChild(u, utente);
			}

			if(modifica != null){
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
			
					out.println("Utente Modificato CORRETTAMENTE");
							
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
