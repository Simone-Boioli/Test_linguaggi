import java.net.*;
import java.io.*;
import java.util.*;

public class Nerdz{
	
	public String username;
	public String password;
	
	public Nerdz(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	/**
	*     LOGIN
	*/
	
	public String login (String username, String password) throws Exception {
		//creo la stringa da inviare via POST
		String post = "username=" + URLEncoder.encode(username, "UTF-8")+
		              "&password=" + URLEncoder.encode(password, "UTF-8");
		
		//instauro una connessione verlo le API
		URL url = new URL("http://www.nerdz.eu/api.php?action=login");
		URLConnection connessione = url.openConnection();
		connessione.setDoOutput(true);
		
		//invio il post
		OutputStreamWriter stream = new OutputStreamWriter(connessione.getOutputStream());
		stream.write(post);
		stream.flush();
		
		//ottengo il responso
		BufferedReader buffer = new BufferedReader(new InputStreamReader(connessione.getInputStream()));
		String response = buffer.readLine();
		
		//chiudo gli stream
		stream.close();
		buffer.close();
		
		//ritorno il responso
		return response;
	}
	
	/**
	 *    LOGOUT
	 */
	
	public String logout() throws Exception{
		// instauro una connessione
		URL url = new URL("http://www.nerdz.eu/api.php?action=logout");
		URLConnection connessione = url.openConnection();
		
		//ottengo il responso
		BufferedReader buffer = new BufferedReader(new InputStreamReader(connessione.getInputStream()));
		String response = buffer.readLine();
		
		//chido lo stream
		buffer.close();
		
		//ritorno il responso
		return response;
	}
	
	/*
	 *    OTTENERE L'ID A PARTIRE DALL'USERNAME 
	 */
	public String getId() throws Exception{
		//creo una stringa da inviare via post
		String post = "username=" + URLEncoder.encode(this.username, "UTF-8");
		
		//instauro la connessione
		URL url = new URL("http://www.nerdz.eu/api.php?action=get_id");
		URLConnection connessione = url.openConnection();
		connessione.setDoOutput(true);
		
		//invio via POST
		OutputStreamWriter stream = new OutputStreamWriter (connessione.getOutputStream());
		stream.write(post);
		stream.flush();
		
		//ottengo il responso
		BufferedReader buffer = new BufferedReader( new InputStreamReader(connessione.getInputStream()));
		String response = buffer.readLine();
		
		//chido gli stream
		stream.close();
		buffer.close();
		
		//ritorno il responso
		return response;
		
	}
	
	
	/**
	 *    CREO UN NUOVO NERDZ
	 */
	public String nerdzIt(String message) throws Exception {
		//creo una nuova stringa da inviare via post
		String post = "messege="+URLEncoder.encode(message, "UTF-8")+"&id="+URLEncoder.encode(getId(), "UTF-8");
		
		//instauro la connessione
		URL url = new URL("http://www.nerdz.eu/api.php?action=nerdz_it");
		URLConnection connessione = url.openConnection();
		connessione.setDoOutput(true);
		
		//invio via POST
		OutputStreamWriter stream = new OutputStreamWriter (connessione.getOutputStream());
		stream.write(post);
		stream.flush();
		
		//ottengo il responso
		BufferedReader buffer = new BufferedReader( new InputStreamReader(connessione.getInputStream()));
		String response = buffer.readLine();
		
		//chido gli stream
		stream.close();
		buffer.close();
		
		//ritorno il responso
		return response;
		
	}
	
	/**
	 *   OTTIENE GLI ULTIMI 10 NERDZ
	 */
	public String getNerdz() throws Exception {
		//creo una nuova stringa da inviare via post
		String post = "what="+URLEncoder.encode("users", "UTF-8");
		
		//instauro la connessione
		URL url = new URL("http://www.nerdz.eu/api.php?action=nerdzs");
		URLConnection connessione = url.openConnection();
		connessione.setDoOutput(true);
		
		//invio via POST
		OutputStreamWriter stream = new OutputStreamWriter (connessione.getOutputStream());
		stream.write(post);
		stream.flush();
		
		//ottengo il responso
		BufferedReader buffer = new BufferedReader( new InputStreamReader(connessione.getInputStream()));
		StringBuffer response = new StringBuffer("");
		String output;
		
		while((output = buffer.readLine()) != null){
			response.append(output);
		}
		
		//chido gli stream
		stream.close();
		buffer.close();
		
		//ritorno il responso
		return response.toString();
	}
	
}