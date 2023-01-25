import java.io.*;
import java.net.*;

class Client{
	public static void main(String [] argv) throws Exception {
		String sentence;	 //stringa immessa dall'utente	
		String modifiedSentence; //string proveniente dal server
		
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in)); //stream di ingresso collegato alla tastiera
		
		Socket clientSocket = new Socket("127.0.0.1", 6789);
		
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream()); //stream di uscita del programma, verso il server
		
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); //stream di ingresso dal programma che arriva dal server
		
		sentence = inFromUser.readLine();
		
		outToServer.writeBytes(sentence + '\n');
		
		modifiedSentence = inFromServer.readLine();
		
		System.out.println("FROM SERVER: " + modifiedSentence);
		
		clientSocket.close();
	}
}