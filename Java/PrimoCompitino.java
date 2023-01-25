import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

class ParameterException extends Exception{
	public ParameterException(){
		super("Parametri non validi, il numero deve essere uguale al numero di parole.");
	}
}

public class PrimoCompitino{
	public static void main(String []args) throws ParameterException{
	
		BufferedReader filein = null;
		try{	
			//lettura del numero di parole
			int nwords = Integer.parseInt(args[1]);
			String [] words = new String [nwords];
			//creazione array di parole passate come parametri, ponendo come dimensione il numero specificato
			for (int i=0; i<nwords ;i++){
				words[i] = args[2+i];
			}
			//numero di occorrenze per ogni parola
			int [] nOccorrenze = new int [nwords];
			//ciclo for che controlla ogni parola
			for (int indexVett=0; indexVett<nwords; indexVett++){
				//apertura file
				filein = new BufferedReader(new FileReader(args[0]));
				//lettura riga
				String riga = filein.readLine();
				//spezzamento della riga in singole parole
				StringTokenizer tokens = new StringTokenizer(riga);
				while (riga!=null){
					//fino a quando la riga ha parole, viene fatto il controllo se la singola parola appartiene o no all'array
					while (tokens.hasMoreTokens()){
						if (tokens.nextToken().equalsIgnoreCase(words[indexVett])){
							nOccorrenze[indexVett]++;
						}
					}
					//lettura riga successiva e spezzamento in parole
					riga = filein.readLine();
					if (riga!=null)
						tokens = new StringTokenizer(riga);
				}
				//chiusura file, se la lunghezza è maggiore di 1 allora si rientra nel ciclo for purche condizione sia verificata
				filein.close();
			}
			//ciclo che stampa per ogni parola  il numero di occorrenze
			for (int indexVett=0; indexVett<nwords; indexVett++){
				System.out.println("La parola "+words[indexVett]+" appare "+nOccorrenze[indexVett]+" volte. ");
			}
		}catch (ArrayIndexOutOfBoundsException e){
			throw new ParameterException();
		}catch (FileNotFoundException e){
			System.out.println("File non trovato");
		}catch(IOException e){
			System.out.println(e.getMessage());
	}
	
	}
}