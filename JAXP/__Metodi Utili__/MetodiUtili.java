import java.io.*;
import java.util.*;
import org.w3c.dom.*;   		//libreria w3c per DOM
import org.xml.sax.SAXException; 	//casi di errore
import javax.xml.parsers.*;		//libreria della Sun

public class MetodiUtili{
	static int livello = -1;
	static String strLivello = " ";
	
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
	
	
	
	
	
	/*
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
		
		
	/* ***************ALTRI METODI DA INSERIRE*******************************/
	
} //end MetodiUtili