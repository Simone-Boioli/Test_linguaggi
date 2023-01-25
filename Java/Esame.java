import java.util.*;
import java.io.*;

public class Esame{
	public static void main(String [] args){
		String filein = args[0];
		int nwords = Integer.parseInt(args[1]);
		String vet[] = new String [nwords];
		try{
			for(int i = 0; i < nwords; i++){
				vet[i] = args[i+2];
			} 
		}catch(Exception e){
			System.out.println("oltrepassato il valore max dell'array"); 
		}

		try{
			DataInputStream inputStream = new DataInputStream(new FileInputStream(filein));
			int count = 0;
			Scanner input = new Scanner(inputStream);
			String line = null;
			while(input.hasNext()) {
				line = input.next();
				for(int i = 0; i < vet.length; i++){
					if(line.equals(vet[i])){
						count++;
					}
				}
			}
			System.out.println(count);
			inputStream.close();
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
