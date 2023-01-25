import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import org.w3c.dom.*;

public class CercaProdotto extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//classe contente il metodo per "compilare" il file XML 
		MetodiUtili m = new MetodiUtili();
	
		//documento che contiene l'intero albero DOM
		Document d = null; 
		
		//valori inseriti dall'utente
		String prodottoU = request.getParameter("prodotti"); // corrisponde ad un elemento della lista
		String ricercaU = request.getParameter("testoRicerca");

		String path = getServletContext().getRealPath("xml/magazzino.xml");

		d = m.compilaXML(path, true);

		// indica il tag magazzino		
		Node child = d.getDocumentElement();

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	

			out.println("<!-- HTML 5 -->");

			out.println("<!DOCTYPE html>");

			out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
			out.println("<head>");
				out.println("<meta charset=utf-8\" />");
				out.println("<title> Cerca Prodotto </title>");
				out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" /> <!--  per importare il css -->");
			out.println("</head>");

			out.println("<body>");

				out.println("<header id=\"BANNER\"> <!--intestazione -->");
					out.println("<!--logo -->");
					out.println("<a href=\"index.html\">");
						out.println("<img class=\"LOGO\" src=\"immagini/logo.png\" />");	
					out.println("</a>");
	
					out.println("<!-- form per la ricerca di un articolo -->");
					out.println("<form action=\"s_cercaProdotto\" method=\"get\">");
		
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
					
					out.println("<p class=\"LOGIN\">");
	           			out.println("Benvenuto!"); 
	           			out.println("<a href=\"accesso.html\"> Accedi </a>");
	           			out.println("o");
	           			out.println("<a href=\"registrazione.html\"> Registrazione</a>");
	           		out.println("</p>");
	           		
	           		out.println("<p class=\"RICERCA-AVANZATA\">");
					out.println("<a href=\"ricerca_avanzata.html\"> Ricerca Avanzata </a>");
				out.println("</p>");

				out.println("</header> <!-- fine intestazione -->");
	
				out.println("<hr />");
				out.println("<br>");
				out.println("<h1 class=\"TITOLO\"> Prodotti </h1>");
				out.println("<br>");

			
		/*
 		 *  Selezionato "tutte le categorie" e non e' stato inserito niente nel campo di testo
 		 */
		if(prodottoU.equals("tutteLeCategorie") && ricercaU.equals("")){
			
			//lista di tutti i prodotti
			NodeList prodotti1 = ((Element)child).getElementsByTagName("prodotto");
			int len1 = prodotti1.getLength(); //numero di prodotti nel file xml

			out.println("<div id=\"CONTENUTO\"> <!--inizio contenuto -->");
			
			//scandisco tutti i prodotti
			for(int j = 0; j < len1; j++){ 
				// contiene gli l'attributi Name dei vari prodotti
				NamedNodeMap attributi1 = (prodotti1.item(j)).getAttributes();
				
				// in posizione 0 ci sara' l'articolo
				NodeList articolo1 = ((Element)prodotti1.item(j)).getElementsByTagName("articolo"); 
				
				Node tags1; //i vari tag 
				Node testo1; // elemento testo
				
				
				out.println("Articolo = " + attributi1.item(0).getNodeValue() + "<br>");					
				
				//scorro i vari figli di articolo
				for(tags1 = articolo1.item(0).getFirstChild(); tags1 != null; tags1 = tags1.getNextSibling()){
						
					if(tags1.getNodeType() != Node.ELEMENT_NODE){
							continue; // per evitare i nodi text tra un tag e l'altrp (es. rit a capo)
					}else{
						String nomeTag1 = tags1.getNodeName(); //nome del tag
							if(!nomeTag1.equals("numeroPezzi")){ //non stampo numero di pezzi
								out.println(nomeTag1 + "= ");

								//scende al figlio per il text_node
								testo1 = tags1.getFirstChild();
	
								String valoreTag1 = testo1.getNodeValue();
								out.println(valoreTag1 + "<br>");
							}
						}
					}		
				out.println("<br>");
			}
			out.println("</div> <!-- fine contenuto -->");
		
		
		
		/*
 		 * E' stata selezionata una categoria e non e' stato inserito nessun testo
 		 */
		}else if(!prodottoU.equals("tutteLeCategorie") && ricercaU.equals("")){ 
			
			//lista di tutti i prodotti
			NodeList prodotti2 = ((Element)child).getElementsByTagName("prodotto");
			int len2 = prodotti2.getLength();

			out.println("<div id=\"CONTENUTO\"> <!--inizio contenuto -->");
			
			//scorro tutti i prodotti
			for(int i = 0; i < len2; i++){
				
				//attributo del prodotto
				NamedNodeMap attributi2 = (prodotti2.item(i)).getAttributes(); 

				//se vedo che il prodotto e' tra quelli cercati
				if(attributi2.item(0).getNodeValue().equals(prodottoU)){ 
					//cerco il tag articolo
					NodeList articolo2 = ((Element)prodotti2.item(i)).getElementsByTagName("articolo");

					Node tags2; //i vari tag 
					Node testo2; // elemento testo

					//scorro i vari figli di articolo
					for(tags2 = articolo2.item(0).getFirstChild(); tags2 != null; tags2 = tags2.getNextSibling()){
						
						if(tags2.getNodeType() != Node.ELEMENT_NODE){
							continue; // per evitare i nodi text tra un tag e l'altrp (es. rit a capo)
						}else{
							String nomeTag2 = tags2.getNodeName(); //nome del tag
														
							if(!nomeTag2.equals("numeroPezzi")){
								out.println(nomeTag2 + "= ");

								//scende al figlio per il text_node
								testo2 = tags2.getFirstChild();
	
								String valoreTag2 = testo2.getNodeValue();
								out.println(valoreTag2 + "<br>");
							}
						}
					}		
				}
			out.println("<br>");
			}
			
			out.println("</div> <!-- fine contenuto -->");
				
		
		/*
 		*   Selezionato "tutte le categorie" e e' stata inserita la marca del prodotto
 		*/ 
		}else if(prodottoU.equals("tutteLeCategorie") && !ricercaU.equals("")){
			
			//lista di tutti i prodotti
			NodeList list =((Element)child).getElementsByTagName("prodotto"); 
			int len = list.getLength();
			
			out.println("<div id=\"CONTENUTO\"> <!--inizio contenuto -->");
			
			//scorro tutti i prodotti
			for(int i = 0; i < len; i++){
				Node articolo = list.item(i).getFirstChild();
				NodeList cod = ((Element)articolo).getElementsByTagName("marca");
				Node c = cod.item(0);
					
				String s = c.getFirstChild().getNodeValue(); // marca
				
				// abbiamo trovato il prodotto
				if(s.equals(ricercaU)){ 	
					
					// contiene l'attributo del prodotto
					NamedNodeMap lista = (list.item(i)).getAttributes(); 
					String prod = lista.item(0).getFirstChild().getNodeValue();
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
			    			if(!a.getNodeName().equals("numeroPezzi")){ 
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
			}
			out.println("</div> <!-- fine contenuto -->");
			
		
		/*
 		*	E' stata selezionata la categoria e inserita la marca
 		*/ 	
		}else if(!prodottoU.equals("tutteLeCategorie") && !ricercaU.equals("")){

			//tutti i prodotti
			NodeList prodotti4 = ((Element)child).getElementsByTagName("prodotto");
			int len4 = prodotti4.getLength();

			out.println("<div id=\"CONTENUTO\"> <!--inizio contenuto -->");
			
			//scorro tutti i prodotti
			for(int x = 0; x < len4; x++){

				// contiene l'attributo del prodotto
				NamedNodeMap attributi4 = (prodotti4.item(x)).getAttributes(); 
				
				 //se vedo che il prodotto e' tra quelli cercati
				if(attributi4.item(0).getNodeValue().equals(prodottoU)){
					Node articolo = prodotti4.item(x).getFirstChild();
					NodeList cod = ((Element)articolo).getElementsByTagName("marca");
					Node c = cod.item(0);
						
					String s = c.getFirstChild().getNodeValue(); // marca
					
					// abbiamo trovato il prodotto guardando la marca
					if(s.equals(ricercaU)){ 	
						
						String prod = attributi4.item(0).getFirstChild().getNodeValue();
						out.println("prodotto = " + prod + "<br>");
						
						Node a = articolo.getFirstChild();
						
						//scorro i vari figli
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
				}
			}
			
			out.println("</div> <!-- fine contenuto -->");
		}

		out.println("</body>");
		out.println("</html>");						


		out.close();
	}
} 
