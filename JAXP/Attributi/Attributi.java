import org.w3c.dom.*; //libreria di w3c per gestire DOM
import javax.xml.parsers.*; //libreria della Sun

public class Attributi{

	Document doc;
	static MetodiUtili met;
	
	public static void main(String [] args){
		
		met = new MetodiUtili();
		Attributi objpre = new Attributi();
		Document doc = met.compilaXML("doc.xml", true);
		
		objpre.visita(doc);
	}//end main
	
	public void visita(Node nodo){
		int tipo;
		met.incrLivello();
		
		tipo = met.leggiTipoNodo(nodo);
		
		System.out.println(nodo.getNodeName());
		
		if(tipo == Node.ELEMENT_NODE){
			leggiAttributi(nodo);
		}
		
		for(Node nodofiglio= nodo.getFirstChild(); nodofiglio != null; nodofiglio = nodofiglio.getNextSibling()){
			visita(nodofiglio);
		}
		met.decLivello();		
	}//end visita
	
	public void leggiAttributi(Node nodo){
		NamedNodeMap listaAtt = nodo.getAttributes();
		
		if(listaAtt != null){
			int len = listaAtt.getLength();
			Node att;
			
			for(int i = 0; i < len; i++){
				att = listaAtt.item(i);
				System.out.println(' '
							  + att.getNodeName()
							  + "=\""
				                          + att.getNodeValue()
							  + '"');
			}
		}
	}
}