import org.w3c.dom.*; //libreria di w3c per gestire DOM
import javax.xml.parsers.*; //libreria della Sun

public class Preorder{
	
	Document doc;
	static MetodiUtili met;
	
	public static void main(String [] args){
		
		met = new MetodiUtili();
		Preorder objpre = new Preorder();
		Document doc = met.compilaXML("preorder.xml", true);
		
		objpre.visita(doc);
	}
	
	public void visita(Node nodo){
		int tipo;
		met.incrLivello();
		
		tipo = met.leggiTipoNodo(nodo);
		System.out.println(nodo.getNodeName() + "\n");
		for(Node nodofiglio= nodo.getFirstChild(); nodofiglio != null; nodofiglio = nodofiglio.getNextSibling()){
			visita(nodofiglio);
		}
		met.decLivello();
	}
	
}