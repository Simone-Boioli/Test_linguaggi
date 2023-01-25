import java.io.*;
import java.net.*;
import java.lang.*;

public class SimpleClient{
	public static void main(String[]args){
		try{
			String host = "127.0.0.1";
			if(args.length != 0){
				host = args[0];
			}
			Socket s = new Socket(host,9999);			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println(br.readLine());
			br.close();
			s.close();
		}catch(ConnectException connExc){
			System.out.println("nonriesco a connettermi al server");
		}catch(IOException e){
			System.out.println("Problemi");
		} 	
	}
}
