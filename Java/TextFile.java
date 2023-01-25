import java.io.*;
import java.util.*;
public class TextFile{
	public static void main(String [] args){
		//nome file di input
		String inputFile = args[0];


		//nome file di output
		String outputFile = args[1];	
		
		//numero di parole da cercare
		int nwords = Integer.parseInt(args[2]);
		
		//inserimento parole nell'array
		String [] vet = new String [nwords];

		for(int i = 0; i < nwords; i++){
			vet[i] = args[i+3];
		}
		
		//array per i valori
		int [] vetCount = new int [nwords];
		for(int i = 0; i < nwords; i++){
			vetCount[i] = 0;
		}	
	
		try{
			//apertura stream di input
			BufferedReader inputStream = new BufferedReader(new FileReader(inputFile));
			
			//apertura stream di output
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFile));
			
			
			//ciclo per scandire gli elementi di inputFile
			Scanner scanner = new Scanner(inputStream);
			while(scanner.hasNext()){
				String line = scanner.next();
				for(int i = 0; i < nwords; i++){
					if(line.equals(vet[i])){
						int v =	vetCount[i];
						v++;
						vetCount[i] = v;
					}
				}
			}
			for(int i = 0; i < nwords; i++){
				outputStream.println(vet[i] + "--->" + vetCount[i] + "volte");
			}
			
			//chiusura stream di input
			inputStream.close();

			//chiusura stream di output
			outputStream.close();
		
		}catch(FileNotFoundException e){
			System.out.println("errore lettura file");
		}catch(IOException e){
			System.out.println("errore i/o");
		}


	}
}
