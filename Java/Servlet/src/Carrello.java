import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Carrello extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
			//apre la pagina di home
			out.println("<!-- HTML 5 -->");
	
			out.println("<!DOCTYPE html>");
	
			out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
			out.println("<head>");
				out.println("<meta charset=utf-8\" />");
				out.println("<title> Carrello </title>");
				out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" /> <!--  per importare il css -->");
			out.println("</head>");
	
			out.println("<body>");
				out.println("<img src=\"immagini/under_construction.png\" />");	
					
				out.println("<body>");
			out.println("</html>");

		out.close();
	}
}
