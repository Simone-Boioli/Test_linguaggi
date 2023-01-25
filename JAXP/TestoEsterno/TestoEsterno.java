import org.w3c.dom.*; //libreria di w3c per gestire DOM
import javax.xml.parsers.*; //libreria della Sun

public class TestoEsterno{
	
	Document doc;
	static MetodiUtili met;
	
	public static void main(String [] args){
		
		met = new MetodiUtili();
		TestoEsterno objpre = new TestoEsterno();
		Document doc = met.compilaXML("doc.xml", true);
		
		objpre.visita(doc);
	}//end main
	
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
				String contenuto = nodo.getNodeValue();
				String risultStr = contenuto.trim();
				System.out.println("  Testo originale: ###" + contenuto + "%%%");
				System.out.println("  Testo dopo trim(): ###" + risultStr + "%%%");
				
				if(risultStr.equals("")){
					System.out.println("TESTO ESTERNO");
					System.out.println(nodo.getNodeValue());
				}else{
					System.out.println("VERO TESTO");
					System.out.println(nodo.getNodeValue());
				}
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