
// Client si connette in remoto sulla porta 13 (daytime) e recupera
//data e ora e li visualizza


import java.net.*;   // packege net
import java.io.*;   // packege input/output
public class Net1{
	public static void main(String [] args){
		Socket s = null;
		try{		System.out.println("0");
			//creo una socket sulla porta 13
			 s = new Socket(localhost ,13);
				System.out.println("1");
			//creo un input stream
			InputStream is = s.getInputStream();
				System.out.println("2");
			//creo un stream reader
			InputStreamReader ir = new InputStreamReader(is);
				System.out.println("3");
			//creo un bufferedReader
			BufferedReader r = new BufferedReader(ir);
				System.out.println("4");
			//salvo la prima stringa letta
			String line = r.readLine();
				System.out.println("5");
			//stampo la linea
			System.out.println(line);

			//chiudo lo stream
			s.close();

		}catch(UnknownHostException e){
			System.out.println("Errore di connessione");
		}catch(Exception e){
			System.err.println(e);
		}	
	}
} 
