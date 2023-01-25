import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Simulazione {
	public static void main(String [] args){
		BufferedReader inputStream=null;
		try{
			if(args.length==0)
				throw new ArgsEmptyException("Non hai inserito niente da linea di comando!");
		}catch(ArgsEmptyException e){
			System.out.println(e.getMessage());
			System.exit(-1);
		}
		try{
			inputStream=new BufferedReader(new FileReader(args[0]));
		}catch(FileNotFoundException e){
			System.out.println("Impossibile aprire file");
			System.exit(-1);
		}
		try{
			int nwords=Integer.parseInt(args[1]);
			int wordsEffettive=args.length-2;
			if(nwords!=wordsEffettive)
				throw new MismatchWordsException("Non hai inserito il numero di parole dichiarato");
		}catch(NumberFormatException e){
			System.out.println("Non hai inserito un numero!");
			System.exit(-1);
		}catch(MismatchWordsException e){
			System.out.println(e.getMessage());
			System.exit(-1);
		}
		ArrayList<String> listaParole =new ArrayList<String>();
		String totale="";
		try{
			String line=inputStream.readLine();
			while(line!=null){
				listaParole.add(line);
				totale+=line+" ";
				line=inputStream.readLine();
			}
		}catch(IOException e){
			System.out.println("Impossibile leggere dal file");
			System.exit(-1);
		}
		for(int i=2;i<args.length;i++){
			Scanner wordFinder=new Scanner(totale);
			int count=0;
			while(wordFinder.hasNext()){
				if(args[i].equalsIgnoreCase(wordFinder.next()))
					count++;
			}
			System.out.println("La parola "+args[i]+" e' contenuta "+count+" volte");
		}
		try{
			inputStream.close();
		}catch(IOException e){
			System.out.println("Impossibile chiudere file");
		}
	}
}
