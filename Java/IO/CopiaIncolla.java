import java.io.*;
import java.util.*;

public class CopiaIncolla{
	public static void main(String args[]){
		/**
		*	Leggo il file con il testo
		*/
		try{
			BufferedReader inputStream = new BufferedReader(new FileReader("testo.txt"));
			String testo = null;
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("file non trovato");
			System.exit(0);
		}catch(IOException e){
			System.out.println("errore lettura file");
			System.exit(0);
		}
	}
}