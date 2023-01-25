import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import org.w3c.dom.*;              //manipolano elementi DOM

public class StampaUtenti extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		MetodiUtili m = new MetodiUtili();
		
		Document d = null; //documento che contiene l'intero albero DOM
		
		String path = getServletContext().getRealPath("xml/utenti.xml");

		d = m.compilaXML(path, true);

		Node child = d.getDocumentElement(); // indica il tag utenti		

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");


		NodeList list = ((Element)child).getElementsByTagName("utente");
		int len = list.getLength();
		
		
		out.println("<!DOCTYPE html>");

		out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
		out.println("<head>");
			out.println("<meta charset=utf-8\" />");
			out.println("<title> Amministrazione </title>");
		out.println("</head>");

		out.println("<body>");	
		
			
		for(int i = 0; i < len; i++){
			Node utente = list.item(i);
					
			for(utente = utente.getFirstChild(); utente != null; utente = utente.getNextSibling()){
				if (utente.getNodeType () != Node.ELEMENT_NODE)
		   		{ 
		   			// Per evitare i nodi Text che stanno fra un tag e l'altro
		   			continue;
		   		}
		   		else
		   		{
		   			out.println(utente.getNodeName() + " = " + utente.getFirstChild().getNodeValue() + "<br>");
		   		}
			}
					
			out.println("<br>");
		}
		
		out.println("</body>");
		out.println("</html>");		
				
		out.close();

	}
} 