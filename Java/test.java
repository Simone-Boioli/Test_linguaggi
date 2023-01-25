import java.io.*;
import java.util.*;

public class test{
	public static void main (String args[]){
		PrintWriter outputStream = null;

		try{
			outputStream = new PrintWriter(new FileOutputStream("test.txt"));	
		}catch(FileNotFoundException e){
			System.out.println("Errore");
			System.exit(0);
		}
		
		System.out.println("insersici una frase: ");
		Scanner tastiera = new Scanner(System.in);
		String testo = tastiera.nextLine();
		outputStream.println(testo);
		outputStream.close();
	}
} 
