import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.*;

public class RicercaAvanzataRegistrato extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		MetodiUtili m = new MetodiUtili();
		
		Document d = null;
	
		//prendo il valore del prodotto
		String codice = request.getParameter("codice");
		String marca = request.getParameter("marca");
		String prezzo = request.getParameter("prezzo");
			
		//crea L'albero DOM
		String path = getServletContext().getRealPath("xml/magazzino.xml");
		d = m.compilaXML(path, true);
				
		//primo elemento ELEMENT
		Node child = d.getDocumentElement(); //magazzino
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
				

		NodeList list =((Element)child).getElementsByTagName("prodotto"); //lista di tutto gli utenti
		int len = list.getLength();
		
		
		out.println("<!-- HTML 5 -->");

		out.println("<!DOCTYPE html>");

		out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
		out.println("<head>");
			out.println("<meta charset=utf-8\" />");
			out.println("<title> Ricerca Avanzata </title>");
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
				
				out.println("<p class=\"RICERCA-AVANZATA\">");
					out.println("<a href=\"ricerca_avanzata_registrato.html\"> Ricerca Avanzata </a>");
				out.println("</p>");

				out.println("<p class=\"LOGOUT\">");
				out.println("<a href=\"index.html\"> Logout </a>");
				out.println("</p>");
				
				out.println("<form action=\"s_carrello\" method=\"get\">");
				out.println("<a href=\"s_carrello\" target=\"_blank\">");
					out.println("<img class=\"CARRELLO\" src=\"immagini/carrello.gif\" />");
					out.println("</a>");
				out.println("</form>");
				
			out.println("</header> <!-- fine intestazione -->");

			out.println("<hr />");
				
		        
		        
			out.println("<div id=\"RICERCA_AVANZATA\">  <!-- inizio contenuto -->");
			out.println("<h1 class=\"TITOLO\"> Ricerca Avanzata </h1>");
		            
			out.println("<br />");
			out.println("<br />");
		            
			out.println("<div id=\"RICERCA\">");
				out.println("<form action=\"s_ricercaAvanzataRegistrato\" method=\"get\">");
					out.println("<fieldset class=\"GRANDEZZA_RICERCA\">");
						out.println("<legend> Ricerca </legend>");
					  		
							out.println("<span class=\"FONT_RICHIESTE\"> Marca: </span>   <br />");
							out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"marca\" />");
			                
							out.println("<button class=\"BOTTONE_RICERCA_MARCA\" type=\"submit\">");
								out.println("Cerca");
							out.println("</button>");
			           	
							out.println("<br />");
							out.println("<br />");
							out.println("<br />");
							
							out.println("<span class=\"FONT_RICHIESTE\"> Codice: </span>   <br />");
							out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"codice\" />");
			                
							out.println("<button class=\"BOTTONE_RICERCA_CODICE\" type=\"submit\">");
								out.println("Cerca");
							out.println("</button>");
			            	
			              	out.println("<br />");
							out.println("<br />");
							out.println("<br />");
			                      
		                    out.println("<span class=\"FONT_RICHIESTE\"> Prezzo: </span>   <br />");
		                    out.println("<input class=\"TESTO_DATI_RICHIESTE\" type=\"text\" name=\"prezzo\" />");
			                
			            	out.println("<button class=\"BOTTONE_RICERCA_CODICE\" type=\"submit\">");
								out.println("Cerca");
							out.println("</button>");
		         
			              	out.println("<br />");
							out.println("<br />");
							out.println("<br />");	

						out.println("</fieldset>");         
					out.println("</form>");
				out.println("</div>");
				
				out.println("<div id=\"RISULTATI\">");
					
				for(int i = 0; i < len; i++){
					Node articolo = list.item(i).getFirstChild();
					
					if(!codice.equals("")){
						out.println("<form action=\"compra\">");
						NodeList cod = ((Element)articolo).getElementsByTagName("codice");
						Node c = cod.item(0);
								
						String s = c.getFirstChild().getNodeValue(); // codice
						
						if(s.equals(codice)){ // abbiamo trovato il prodotto	
							
							NamedNodeMap lista = (list.item(i)).getAttributes(); // contiene i vari attributi
							String prod = lista.item(0).getFirstChild().getNodeValue();
							
							out.println("<input type=\"checkbox\" name=\"articolo\"><br>");
							
							out.println("prodotto = " + prod + "<br>");
							
							Node a = articolo.getFirstChild();
							
							for(a.getFirstChild(); a != null; a = a.getNextSibling())
					        {
					    		if (a.getNodeType () != Node.ELEMENT_NODE)
					    		{ 
					    			// Per evitare i nodi Text che stanno fra un tag e l'altro
					    			continue;
					    		}
					    		else
					    		{
					    			if(!a.getNodeName().equals("numeroPezzi")){ //non stampo numero di pezzi
					    				out.print(a.getNodeName() + " = " );
					    				
					    				// Scende al nipote per il Text node per stampare il valore
					    				Node testo = a.getFirstChild();
					    			
					    				String valore = testo.getNodeValue();
					    				out.println(valore + "<br>");
					    			}
					    		}
					        }
							out.println("<br>");
						}
						out.println("</form>");
					}else if(!marca.equals("")){
						out.println("<form action=\"compra\">");
						NodeList cod = ((Element)articolo).getElementsByTagName("marca");
						Node c = cod.item(0);
								
						String s = c.getFirstChild().getNodeValue(); // codice
						
						if(s.equals(marca)){ // abbiamo trovato il prodotto	
							
							NamedNodeMap lista = (list.item(i)).getAttributes(); // contiene i vari attributi
							String prod = lista.item(0).getFirstChild().getNodeValue();
							
							out.println("<input type=\"checkbox\" name=\"articolo\"><br>");
							
							out.println("prodotto = " + prod + "<br>");
							
							Node a = articolo.getFirstChild();
							
							for(a.getFirstChild(); a != null; a = a.getNextSibling())
					        {
					    		if (a.getNodeType () != Node.ELEMENT_NODE)
					    		{ 
					    			// Per evitare i nodi Text che stanno fra un tag e l'altro
					    			continue;
					    		}
					    		else
					    		{
					    			if(!a.getNodeName().equals("numeroPezzi")){ //non stampo numero di pezzi
					    				out.print(a.getNodeName() + " = " );
					    				
					    				// Scende al nipote per il Text node per stampare il valore
					    				Node testo = a.getFirstChild();
					    			
					    				String valore = testo.getNodeValue();
					    				out.println(valore + "<br>");
					    			}
					    		}
					        }
							
							out.println("<br>");
						}
						out.println("</form>");
					}else if(!prezzo.equals("")){
						out.println("<form action=\"compra\">");
						NodeList cod = ((Element)articolo).getElementsByTagName("prezzo");
						Node c = cod.item(0);
								
						String s = c.getFirstChild().getNodeValue(); // codice
						
						if(s.equals(prezzo)){ // abbiamo trovato il prodotto	
							
							NamedNodeMap lista = (list.item(i)).getAttributes(); // contiene i vari attributi
							String prod = lista.item(0).getFirstChild().getNodeValue();
							
							out.println("<input type=\"checkbox\" name=\"articolo\"><br>");
							
							out.println("prodotto = " + prod + "<br>");
							
							Node a = articolo.getFirstChild();
							
							for(a.getFirstChild(); a != null; a = a.getNextSibling())
					        {
					    		if (a.getNodeType () != Node.ELEMENT_NODE)
					    		{ 
					    			// Per evitare i nodi Text che stanno fra un tag e l'altro
					    			continue;
					    		}
					    		else
					    		{
					    			if(!a.getNodeName().equals("numeroPezzi")){ //non stampo numero di pezzi
					    				out.print(a.getNodeName() + " = " );
					    				
					    				// Scende al nipote per il Text node per stampare il valore
					    				Node testo = a.getFirstChild();
					    			
					    				String valore = testo.getNodeValue();
					    				out.println(valore + "<br>");
					    			}
					    		}
					        }
							
							out.println("<br>");
						}
						out.println("</form>");
					}
				}
							
				out.println("</div>");
				
			out.println("</div>");              
		        
			
		out.println("</body>");
	out.println("</html>");

		out.close();
		
	}
} 