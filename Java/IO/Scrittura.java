import java.io.*;
import java.util.*;

public class Scrittura{
	public static void main(String[]args){
		PrintWriter outputStream = null;
		
		try{
			outputStream = new PrintWriter ( new FileOutputStream("scrivi.txt"));
		}catch(FileNotFoundException e){
			System.out.println("errore");
			System.exit(0);
		}
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("inserisci una parola da salvare su file");
		
		String testo= tastiera.nextLine();
		outputStream.println(testo);
		System.out.println("Scritto");
		
		outputStream.close();
		
		
		/**
		  leggi
		*/
		System.out.println("vuoi leggere? y/n");
		String risp = tastiera.nextLine();
		
		if(risp.equals("y")){
			try{
				BufferedReader inputStream = new BufferedReader(new FileReader("scrivi.txt"));
				
				String testoScritto = null;
				testoScritto = inputStream.readLine();
				
				System.out.println("il testo e': " + testoScritto);
				
				inputStream.close();
			}catch(FileNotFoundException e){
				System.out.println("errore lettura file");
			}catch(IOException e){
				System.out.println("errore i/o");
			}
		}
		
		
	}
}