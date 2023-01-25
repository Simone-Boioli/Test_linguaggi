import java.io.*;
import java.util.*;

public class ioBinari{
	public static void main(String[] args){
		/**
			Scrittura
		*/
		
		try{
			DataOutputStream outputStream = new DataOutputStream ( new FileOutputStream("bin.txt"));
			System.out.println("inserisci una frase");
			Scanner tastiera = new Scanner (System.in);
			String testo = tastiera.nextLine();
			
			outputStream.writeUTF(testo);
			System.out.println("scritto");
			outputStream.close();
		}catch(IOException e){
			System.out.println("problema con il file");
		}
		
		/**
			Lettura
		*/
		
		try{
			DataInputStream inputStream = new DataInputStream(new FileInputStream("bin.txt"));
			System.out.println("vuoi leggere?y/n");
			Scanner tastiera2 = new Scanner(System.in);
			String risp = tastiera2.next();
			if(risp.equals("y")){
				String testoNuovo = inputStream.readUTF();
				System.out.println(testoNuovo);
			}else{
				System.out.println("ciao ciao");
			}
			inputStream.close();
		}catch(IOException e){
			System.out.println("problema con il file");
		}
		
		
	}
}