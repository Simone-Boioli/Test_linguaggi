import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.*;

public class StampaProdotti extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		MetodiUtili m = new MetodiUtili();
		
		Document d = null;
				
		//crea L'albero DOM
		String path = getServletContext().getRealPath("xml/magazzino.xml");
		d = m.compilaXML(path, true);
				
		//primo elemento ELEMENT
		Node child = d.getDocumentElement(); //magazzino
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
				

		NodeList list =((Element)child).getElementsByTagName("prodotto"); //lista di tutti i prodotti
		int len = list.getLength();
		
		
		out.println("<!-- HTML 5 -->");
		
		out.println("<!DOCTYPE html>");

		out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
		out.println("<head>");
			out.println("<meta charset=utf-8\" />");
			out.println("<title> Amministrazione </title>");
		out.println("</head>");

		out.println("<body>");	
		
				for(int i = 0; i < len; i++){
										
						NamedNodeMap lista = (list.item(i)).getAttributes(); // contiene i vari attributi
						String prod = lista.item(0).getFirstChild().getNodeValue();
						out.println("prodotto = " + prod + "<br>");
						Node articolo = list.item(i).getFirstChild();  //articolo
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
				    			out.print(a.getNodeName() + " = " );
				    				
				    			// Scende al nipote per il Text node per stampare il valore
				    			 Node testo = a.getFirstChild();
				    			
				    			String valore = testo.getNodeValue();
				    			out.println(valore + "<br>");
				    		}
				        }	
						out.println("<br>");
				}
			
				out.println("</body>");
				out.println("</html>");		
				
		out.close();
		
	}
} 
