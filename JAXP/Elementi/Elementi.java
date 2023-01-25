import org.w3c.dom.*; //libreria di w3c per gestire DOM
import javax.xml.parsers.*; //libreria della Sun

public class Elementi{
	
	Document doc;
	static MetodiUtili met;
	
	public static void main(String [] args){
		
		met = new MetodiUtili();
		Elementi objpre = new Elementi();
		Document doc = met.compilaXML("elementi.xml", true);
		
		objpre.visita(doc);
	}
	
	public void visita(Node nodo){
		int tipo;
		met.incrLivello();
		
		tipo = nodo.getNodeType();
		
		switch(tipo){
			case Node.ELEMENT_NODE:
			{
				System.out.println("ELEMENT_NODE");
				System.out.println(nodo.getNodeName());
				break;
			}
			
			case Node.TEXT_NODE:
			{
				System.out.println("TEXT_NODE");
				System.out.println(nodo.getNodeValue());
				break;
			}

			case Node.COMMENT_NODE:
			{
				System.out.println("COMMENT_NODE");
				System.out.println(nodo.getNodeValue());
				break;
			}
		}//end switch	
		
		
		for(Node nodofiglio= nodo.getFirstChild(); nodofiglio != null; nodofiglio = nodofiglio.getNextSibling()){
			visita(nodofiglio);
		}
		met.decLivello();
	}//end visita
}//end class