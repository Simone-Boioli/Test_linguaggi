import java.util.*;
import java.io.*;

public class WordsFrequencyDemo{

    public static String quote(String s)
    {
	return "\"" + s + "\"";
    }
    
    public static void main(String[] args){

	WordsFrequency tree = new WordsFrequency();
	WordsFrequencyDemo demo = new WordsFrequencyDemo();
	
	try
	    {
		BufferedReader inputStream = 
		    new BufferedReader(new FileReader(args[0])); 
               
		// Lettura del file e riempimento dell'albero
		String line = inputStream.readLine( );
		while (line != null)
		    {
			// aggiornamento dell'albero con le parole contenute in line
			demo.updateTree(line, tree); 
			line = inputStream.readLine( );
		    }

		inputStream.close( );
	    }
	catch(FileNotFoundException e)
	    {
		System.out.println("File " + args[0] + " was not found");
		System.out.println("or could not be opened.");
		System.exit(0);
	    }
	catch(IOException e)
	    {
		System.out.println("Error reading from file " + args[0]);
		System.exit(0);
	    }
	catch(ArrayIndexOutOfBoundsException e)
	    {
		System.out.println("Usage: WordsFrequencyDemo nomefile");
		System.exit(0);
	    }
       
	// Stampa a video di vari dati dell'albero
	System.out.println("La parola piu' grande e' :" + quote(tree.max()));
	System.out.println("La parola piu' piccola e' :" + quote(tree.min()));
	System.out.println("Premere <Return> per proseguire.");
	Scanner keyboard = new Scanner(System.in); 
	keyboard.nextLine();

	System.out.print("Visualizzazione dell'intero albero...");
	System.out.println("Premere <Return> per proseguire.");
	tree.inOrderTreeWalk();

    } // end main


    /*
     * Carica nell'albero le parole contenute nella stringa line
     * Salta le parole di una sola lettera
     */
    public void updateTree(String line, WordsFrequency tree){

	String parola = null;
	StringTokenizer word = new StringTokenizer(line,",.;: ()");

	while(word.hasMoreTokens())
	    {
		parola = word.nextToken();
		if (parola.length() != 1) // elimino le singole lettere 
		    tree.add(parola);
	    }
    }

} // end class WordsFrequencyDemo
