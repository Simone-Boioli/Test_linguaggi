package Project2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class MedicalSystem{
	
	private static final String pathFascicoli = "Fascicoli/";
	
	Fascicolo fascicoloCorrente = null;
	ArrayList <Fascicolo> fascicoli;
	ArrayList <Fascicolo> fascicoliCercati;
	
	MedicalSystem(){
		
		fascicoli = new ArrayList <Fascicolo> ();
	}
	
	public int aggiungiFascicolo(Fascicolo f){

		try {
    		
    		File file = new File(getPathfascicoli() + f.getCodiceFiscale() + ".dat");
    		
    		if( file.exists() ){
    			
    			throw new FileExistException();
    		}
    		
			FileOutputStream fos = new FileOutputStream( file );
			
			ObjectOutputStream scrittore = new ObjectOutputStream( fos ); 
			
			scrittore.writeObject(f);
			
			scrittore.flush();
			
			scrittore.close();
			
			if( fascicoli.size() > 0){
				
				fascicoli.add(f);
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		
			return 0;
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
			return 0;
	
		} catch (FileExistException e) {
			
			e.printStackTrace();
			
			return -1;
		}
		
		return 1;

	}
	
	public Fascicolo getFascicoloFromList( int index ){
		
		return fascicoli.get(index);
	}
	
	public Fascicolo getFascicoloFromList( int index, boolean isSearch ){
		
		if( !isSearch ){
		
			return fascicoli.get(index);
		}
		else{
			
			return fascicoliCercati.get(index);
		}
	}
	
	public String[] listaFascicoli(){
		
		ArrayList <String> listaFascicoli = new ArrayList<String>();
		
		Fascicolo f;
		
		if( fascicoli.size() == 0 ){
		
			File file = new File (getPathfascicoli());
		
			File[] fileList = file.listFiles();
			
			FileInputStream fis;
			
			ObjectInputStream lettore;
			
			for(int i=0; i<fileList.length;i++){
				
				System.out.println(fileList[i].getAbsolutePath());
				
				try {
					fis = new FileInputStream( fileList[i] );
					
					lettore = new ObjectInputStream( fis );
					
					f = (Fascicolo) lettore.readObject();
					
					fascicoli.add(f);
					
					listaFascicoli.add( f.getNome() + " " + f.getCognome() + " - " + f.getCodiceFiscale() );
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else{
			
			for(int i=0; i<fascicoli.size();i++){
			
				f = fascicoli.get(i);
				
				listaFascicoli.add( f.getNome() + " " + f.getCognome() + " - " + f.getCodiceFiscale() );
			}
		}
		
		String[] list = new String[listaFascicoli.size()];
		
		return listaFascicoli.toArray(list);
	}
	
	public void setFascicoloCorrente(Fascicolo f){
		
		this.fascicoloCorrente = f;
	}
	
	public String[] cercaFascicolo(String nome, String cognome, String cf){
		
		ArrayList <String> listaFascicoli = new ArrayList <String>();
		ArrayList <Fascicolo> fascicoli = new ArrayList <Fascicolo>();
		Fascicolo f;
		
		
		
		for(int i=0;i<this.fascicoli.size();i++){
		
			f = this.fascicoli.get(i);
			
			if( cf.isEmpty() ){
				
				if( cognome.isEmpty() && !nome.isEmpty() && f.getNome().equalsIgnoreCase(nome)){
					
					fascicoli.add(f);
				}
				
				if( nome.isEmpty() && !cognome.isEmpty() && f.getCognome().equalsIgnoreCase(cognome)){
					
					fascicoli.add(f);
				}
				
				if( f.getNome().equalsIgnoreCase(nome) && f.getCognome().equalsIgnoreCase(cognome)){
					
					fascicoli.add(f);
				}
			}
			else if( f.getCodiceFiscale().equalsIgnoreCase(cf) ){
				
				System.out.print("CF GIUSTO");
				
				listaFascicoli.add( f.getNome() + " " + f.getCognome() + " - " + f.getCodiceFiscale() );
				
				String[] listaFinale = new String[1];
				
				return listaFascicoli.toArray(listaFinale);
			}
		}
		
		for(int i=0;i<fascicoli.size();i++){
			
			f = fascicoli.get(i);
			
			listaFascicoli.add( f.getNome() + " " + f.getCognome() + " - " + f.getCodiceFiscale() );
		}
		
		fascicoliCercati = fascicoli;
		
		String[] listaFinale = new String[listaFascicoli.size()];
		
		return listaFascicoli.toArray(listaFinale);
	}
	
	public void cancellaFascicolo() {
		
		File fascicoloDaCancellare = new File( getPathfascicoli() + fascicoloCorrente.getCodiceFiscale() + ".dat");
		
		fascicoloDaCancellare.delete();
		
		fascicoli.remove(fascicoloCorrente);
		
		fascicoloCorrente = null;
	}

	public static int getGiornoFromMese(String mese) {
		
		if( mese == "Gennaio" )
			return 0;
		if( mese == "Febbraio" )
			return 1;
		if( mese == "Marzo" )
			return 2;
		if( mese == "Aprile" )
			return 3;
		if( mese == "Maggio" )
			return 4;
		if( mese == "Giugno" )
			return 5;
		if( mese == "Luglio" )
			return 6;
		if( mese == "Agosto" )
			return 7;
		if( mese == "Settembre" )
			return 8;
		if( mese == "Ottobre" )
			return 9;
		if( mese == "Novembre" )
			return 10;
		if( mese == "Dicembre" )
			return 11;
		
		return 0;
	}

	public String getPathfascicoli() {
		return pathFascicoli;
	}

	public String[] getListaMediciString() {
		
		return fascicoloCorrente.getListaMediciString();
	}

	public void aggiornaFile() {
		
		File file = new File(getPathfascicoli() + fascicoloCorrente.getCodiceFiscale() + ".dat");
		
		try{
			FileOutputStream fos = new FileOutputStream( file );
			
			ObjectOutputStream scrittore = new ObjectOutputStream( fos ); 
			
			scrittore.writeObject(fascicoloCorrente);
		} 
		catch (FileNotFoundException e) {
		
			e.printStackTrace();

		}
		catch (IOException e) {
		
			e.printStackTrace();

		}
	}
}

