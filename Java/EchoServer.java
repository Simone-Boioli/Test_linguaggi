import java.net.*;
import java.io.*;

public class EchoServer{
	public static void main(String[] args){
		int count = 1;
		try{
			ServerSocket ss = new ServerSocket(2222);
			Socket s = ss.accept();
			BufferedReader in = new BufferedReader(new InputReader(s.getInputStream()));
			PrintWriten out = new PrintWriten(s.getOutputStream(), true);
			String letto = in.readLine();
			while(!letto.equals("FINE")){
				out.println(letto+" "+count);
				count++;
				letto = in.readLine();
			}
			ss.close();
			s.close();
		}catch (IOException e ){
			e.printStackTrace();
		}
	}
}
