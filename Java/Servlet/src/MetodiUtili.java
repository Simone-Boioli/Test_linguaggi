import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.w3c.dom.*;              //manipolano elementi DOM
import javax.xml.parsers.*;        //utilizzo parser
import org.xml.sax.SAXException;   //gestioni eccezione
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class MetodiUtili {
	
	
	/**
	* 	Metodo per generare un albero DOM
	*	@param nomexml nome del file Xml
	*	@param tipoValidazione true=validated | false=well-formed
	*	@return radice albero DOM generato
	*/
	public Document compilaXML(String nomeXml, boolean tipoValidazione){
		Document doc = null;
		DocumentBuilder db = null;
		
		//instanziazione di DocumentBuilderFactory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		//scelta del tipo d validazione
		dbf.setValidating (tipoValidazione);
		dbf.setIgnoringElementContentWhitespace(true);
		dbf.setIgnoringComments(true);
		
		//instanzazione di DocumentBuilder
		try{
			db = dbf.newDocumentBuilder();
		}catch(ParserConfigurationException pce){
			System.err.println("Errore per DocumentBuilder");
		}
		
		//richiamo del parser
		try{
			doc = db.parse(nomeXml);	
		}catch(SAXException se){
			System.err.println("Errore Compilazione");
		}catch(IOException ioe){
			//errori sui file di I/O
			System.err.println(ioe);
		}
		
		//la variabile doc contiene il nodo radice
		return (doc);
			
	}//end compilaXml
	
	
	
	/**
	*	Metodo che ritorna il numero che rappresenta il tipo di nodo corrente
	*	@param nodo nodo da valutare
	*	@return numero che rappresenta il tipo di nodo corrente
	*/
	public int leggiTipoNodo(Node nodo){
		
		int tipo = nodo.getNodeType();
		
		switch(tipo){
			case Node.DOCUMENT_NODE:
				System.out.println("DOCUMENT_NODE");
				break;
			
			case Node.DOCUMENT_TYPE_NODE:
				System.out.println("DOCUMENT_TYPE_NODE");
				break;
			
			case Node.ELEMENT_NODE:
				System.out.println("ELEMENT_NODE");
				break;
			
			case Node.ATTRIBUTE_NODE:
				System.out.println("ATTRIBUTE_NODE");
				break;
			
			case Node.COMMENT_NODE:
				System.out.println("COMMENT_NODE");
				break;
			
			case Node.ENTITY_REFERENCE_NODE:
				System.out.println("ENTITY_REFERENCE_NODE");
				break;
			
			case Node.CDATA_SECTION_NODE:
				System.out.println("CDATA_SECTION_NODE");
				break;
			
			case Node.TEXT_NODE:
				System.out.println("TEXT_NODE");
				break;
			
			case Node.PROCESSING_INSTRUCTION_NODE:
				System.out.println("PROCESSING_INSTRUCTION_NODE");
				break;
		}
		
		return (tipo);
	}//end leggiTipoNodo
	
	
	
	
	
	/**
	*	Metodo che scandisce l'intero albero e si ferma sul primo nodo ELEMENT 
	*	@param docradice nodo radice dell'albero
	*	@return primo nodo di tipo ELEMENT
	*/
	public Node primoElemento (Node docradice){
		int tipoNodo;
		Node nodofiglio;
		boolean continua = true;
		
		nodofiglio = docradice.getFirstChild();
		tipoNodo = nodofiglio.getNodeType();

		while(continua){
			if(tipoNodo == Node.ELEMENT_NODE){
				System.out.println("Tovato Element Node");
				continua = false;
			}else {
				nodofiglio = nodofiglio.getNextSibling();
				tipoNodo  = nodofiglio.getNodeType();
			}
		}//end while
		
		return (nodofiglio);
		
	}//end primoElemento	
	
	
	/**
	 * 	Metodo per scrivere su un file xml
	 *  @param doc documento da scrivere 
	 *  @param dest file di destinazione su cui scrivere
	 */
	public void scrivi(Document doc, File dest){
		try
	     {
	        DOMSource sorg = new DOMSource (doc);
	        StreamResult sr = new StreamResult (dest);        
	        TransformerFactory tf = TransformerFactory.newInstance();
	        Transformer transf = tf.newTransformer();
	       
	        transf.setOutputProperty(OutputKeys.INDENT, "yes");
	        transf.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, doc.getDoctype().getSystemId());
	        transf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "6");
	        
	        transf.transform (sorg, sr);
	     }
	     catch (TransformerConfigurationException tce)
	     {
	        System.out.println(tce.getMessage());
	     }
	     catch (TransformerException te)
	     {
	        System.out.println(te.getMessage());
	     }

	}
	
	
	public void visita(Node nodo){
		ArrayList <String> nomeNodi = new ArrayList <String>();
		int tipo;
		tipo = leggiTipoNodo(nodo);
		switch(tipo){
		case Node.ELEMENT_NODE:
			{
				System.out.println(nodo.getNodeName());
				nomeNodi.add(nodo.getNodeName());
				break;
			}
		case Node.TEXT_NODE:
			{
				String contenuto = nodo.getNodeValue();
				String risultante = contenuto.trim();
				
				if(risultante != ""){
					System.out.println("        " + nodo.getNodeValue());
					nomeNodi.add("     " + nodo.getNodeValue());
				}
				break;
			}
		case Node.DOCUMENT_NODE:
			{
				System.out.println(nodo.getNodeName());
				nomeNodi.add(nodo.getNodeName());
				break;
			}
			
		case Node.DOCUMENT_TYPE_NODE:
			{
				System.out.println(nodo.getNodeName());
				nomeNodi.add(nodo.getNodeName());
				break;
			}
		}
		
		for(Node nodofiglio = nodo.getFirstChild(); nodofiglio != null; nodofiglio = nodofiglio.getNextSibling()){
			visita(nodofiglio);
		}
	}
	
	
	
		
		
	/* ***************ALTRI METODI DA INSERIRE*******************************/
}
