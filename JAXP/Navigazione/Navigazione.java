import org.w3c.dom.*; //libreria di w3c per gestire DOM
import javax.xml.parsers.*; //libreria della Sun

public class Navigazione{

	public static void main(String [] args){
		
		MetodiUtili met = new MetodiUtili();
		
		Document doc = met.compilaXML("navigazione.xml", true);
		
		Node precedente = null;
		int tipoNodo;
	
		System.out.println("==== Trattamento dei figli di radice");
		for(Node child = doc.getFirstChild(); child != null; child = child.getNextSibling()){
			
			if(child != null){
				precedente = child;
			}
			
			tipoNodo = met.leggiTipoNodo(child);
			
			if(tipoNodo == Node.ELEMENT_NODE){
				System.out.println("         " + child.getNodeName());
			}
		}
		
		System.out.println("==== Trattamento dei figli dell'ultimo figliodi radice");
		for(Node child = precedente.getFirstChild(); child != null; child = child.getNextSibling()){
	
			tipoNodo = met.leggiTipoNodo(child);
			
			if(tipoNodo == Node.ELEMENT_NODE){
				System.out.println("         " + child.getNodeName());
			}
			
		}				
		
	}
	
}
