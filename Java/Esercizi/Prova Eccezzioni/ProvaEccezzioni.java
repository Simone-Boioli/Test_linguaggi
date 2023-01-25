import java.io.*;

public class ProvaEccezzioni{
	public static void main(String args[]){
		try{
			throw new IOException();
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		//catch(IOException e){
		//	System.out.println("main: "+e);
		//}
	}
	
	public static int leggi() throws IOException{
		
		int letto;
		
		letto= System.in.read();
		
		return letto;
	}
	

}