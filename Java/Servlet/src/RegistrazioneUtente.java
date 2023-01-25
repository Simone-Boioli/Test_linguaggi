import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.*;

public class RegistrazioneUtente extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		MetodiUtili m = new MetodiUtili();
		
		Document d = null; //utenti
		Document conto = null; //conto da inserire
		
		//prendo i valori dalla pagina html
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String userId = request.getParameter("idutente");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		//crea L'albero DOM
		String path = getServletContext().getRealPath("xml/utenti.xml");
		d = m.compilaXML(path, true);
		
		String path2 = getServletContext().getRealPath("xml/conti.xml");
		conto = m.compilaXML(path2, true);
				
		//primo elemento ELEMENT
		Node child = d.getDocumentElement(); //utenti
		Node child2 = conto.getDocumentElement(); // conti
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
							
		Node u; //utente
		Node n; //nome
		Node c; //cognome
		Node ID; //user id
		Node p; //password
		Node e; //email
		Node den; //denaro
		Node punti; //punti
		
		Node contoUtente; //conto
		
		/* ricerca se c'è già l'id inserito*/
		NodeList utenti = ((Element)child).getElementsByTagName("utente"); //tutti tag prodotto
		int l = utenti.getLength();
		boolean esistente = false;
		
		//scorro tutti gli elemnti in cerca di un id uguale
		for(int i = 0; i < l; i++){
			NodeList id = ((Element)utenti.item(i)).getElementsByTagName("idUtente");
			String testoId = (id.item(0).getFirstChild().getNodeValue());
			
			if(testoId.equals(userId)){
				esistente = true;
			}
		}
		
		if(!esistente){
			
			/*
			 * Aggiunta Utente
			 */
			u = d.createElement("utente"); // Nodo di un Prodotto
			
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
			
			child.appendChild(u); //aggancio utente a utenti
			
			m.scrivi(d, new File(path));
			
			/*
			 * Aggiunta conto del cliente
			 */
			contoUtente = conto.createElement("conto");
			((Element)contoUtente).setAttribute ("idUtente", userId);
			
			child2.appendChild(contoUtente); //aggancio conto a conti
			
			m.scrivi(conto, new File(path2));
			
			
			//apre la pagina di home
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
									
					out.println("<span class=\"NOME_UTENTE\"> Buongiorno " + userId + "</span>");
					
					out.println("<p class=\"LOGOUT\">");
						out.println("<a href=\"index.html\"> Logout </a>");
					out.println("</p>");
						
					
					out.println("<form action=\"s_carrello\" method=\"get\">");
						out.println("<a href=\"s_carrello\" target=\"_blank\">");
							out.println("<img class=\"CARRELLO\" src=\"immagini/carrello.gif\" />");
							out.println("</a>");
					out.println("</form>");
					
					out.println("<p class=\"RICERCA-AVANZATA\">");
						out.println("<a href=\"ricerca_avanzata.html\"> Ricerca Avanzata </a>");
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
					
				out.println("<body>");
			out.println("</html>");
		}else{
			out.println("ERRORE ID GIA' ESISTENTE!!!");
			out.println("<br>");
			out.println("<a href=\"registrazione.html\"> Torna Indietro </a>");
			
		}
		
		out.close();
	}
}
