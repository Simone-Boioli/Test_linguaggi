import java.net.*;
import java.io.*;

class Client{
	
	static void mandaMail(String nomeHost,int porta,String from,String to,String subject,String body) throws Exception{	//manda una mail da from a to con titolo subject e corpo body
		
		Socket clientSocket;							//Socket client che ha  2 stream: entrata e uscita
		BufferedReader inFromServer;						//Stream di entrata
		DataOutputStream outToServer;					//Stream di uscita
		
		clientSocket=new Socket(nomeHost,porta);		//apro il socket al numero di porta e all'host passati nel costruttore
		
		inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		outToServer=new DataOutputStream(clientSocket.getOutputStream());
		
		aspetta(100);System.out.println(inFromServer.readLine());					//ricevo il primo messaggio di connessione
		
		//saluto
		String messaggio="HELO hotmail\n"; System.out.print("C:"+messaggio);			//preparo il messaggio da mandare e lo mostro
		outToServer.writeBytes(messaggio);								//mando la domanda
		System.out.println("S:"+inFromServer.readLine());						//ascolto la risposta
		
		//dico da chi
		messaggio="MAIL FROM:<"+from+">\n";	System.out.print("C:"+messaggio);		//preparo il messaggio da mandare e lo mostro
		outToServer.writeBytes(messaggio);								//mando la domanda
		System.out.println("S:"+inFromServer.readLine());						//ascolto la risposta				
		
		//a chi
		messaggio="RCPT TO:<"+to+">\n";	System.out.print("C:"+messaggio);			//preparo il messaggio da mandare e lo mostro
		outToServer.writeBytes(messaggio);								//mando la domanda
		System.out.println("S:"+inFromServer.readLine());						//ascolto la risposta	
	
		
		//inizio coi dati
		messaggio="DATA\n";	System.out.print("C:"+messaggio);					//preparo il messaggio da mandare e lo mostro
		outToServer.writeBytes(messaggio);								//mando la domanda
		System.out.println("S:"+inFromServer.readLine());						//ascolto la risposta	
		
		//header
		messaggio= "From: " + from + "\nTo: "+to+"\nSubject: "+subject+"\n\n";		//preparo il messaggio da mandare e lo mostro
		System.out.print("C:"+messaggio);	
		outToServer.writeBytes(messaggio);								//mando l'header

		//body
		messaggio=body+"\n";	System.out.print("C:"+messaggio);					//preparo il messaggio da mandare e lo mostro
		outToServer.writeBytes(messaggio);								//mando la domanda
		//punto finale
		messaggio="\r\n"+"."+"\r\n";	System.out.print("C:"+messaggio);				//preparo il messaggio da mandare e lo mostro	SENZA \r\n non va
		outToServer.writeBytes(messaggio);								//mando la domanda
		System.out.println("S:"+inFromServer.readLine());						//ascolto la risposta	
		
		outToServer.writeBytes("QUIT\n");
		//System.out.println("S:"+inFromServer.readLine());
		clientSocket.close();
	}
	
	@SuppressWarnings("static-access")  //per togliere i warning
	static void aspetta(int millisec){			//Funzione che stoppa il programma per tot millisecondi
		
		
		//System.out.println("Starting pause......");
        
		// pause for a while
		Thread thisThread = Thread.currentThread();
		try{
			thisThread.sleep(millisec);
			}
		catch (Throwable t){
			throw new OutOfMemoryError("An Error has occured");
			}
			
		//System.out.println("Ending......");
	}
	
}