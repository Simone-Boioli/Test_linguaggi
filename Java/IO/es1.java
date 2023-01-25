import java.io.*;
import java.util.*;

public class es1{
		public static void main(String [] args){
			String fileinput = args[0];
			int minlen = Integer.parseInt(args[1]);
			int maxlen = Integer.parseInt(args[2]);
			String fileoutput = args[3];
			
			try{
				BufferedReader inputStream = new BufferedReader(new FileReader(fileinput));
				PrintWriter outputStream= new PrintWriter (new FileOutputStream(fileoutput));
				
				Scanner input = new Scanner(inputStream);
				String line = null;
				while(input.hasNext()){
					line = input.next();
					System.out.println(line);
					if(line.length() <=maxlen && line.length() >= minlen){
						outputStream.println(line);
					}
				}	
				inputStream.close();
				outputStream.close();
			}catch(FileNotFoundException e){
				System.out.println("errore");
			}catch(IOException e){
				System.out.println("erroreIO");
			}
			
		}
}