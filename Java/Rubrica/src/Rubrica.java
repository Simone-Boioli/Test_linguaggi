
import java.sql.*;

public class Rubrica {
	
	static String arr[] = new String[9];
	
	public static void cercaUtente(String cognome, String nome){
		try{
			String driver = "com.mysql.jdbc.Driver";  
			Class.forName(driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Rubrica?user=root&password=sim130789!");
			Statement cmd = con.createStatement();
			String qry = "SELECT * FROM Persona WHERE Cognome = '"+ cognome +"' AND Nome = '"+nome+"'";  //Query di ricerca
			ResultSet res = cmd.executeQuery(qry);
			
			while(res.next()){
				arr[0] = res.getString("Cognome");
				arr[1] = res.getString("Nome");
				arr[2] = res.getString("Telefono");
				arr[3] = res.getString("Cellulare");
				arr[4] = res.getString("email");
				arr[5] = res.getString("Città");
				arr[6] = res.getString("Via");
				arr[7] = res.getString("Ncivico");
				arr[8] = res.getString("Provincia");
				
				for(int i = 0; i < arr.length; i++){
					System.out.println(arr[i]);
				}
			}  
			res.close();
			cmd.close();
			con.close();
				
		}catch(SQLException e){
			System.out.println("Connessione non riuscita o problema alla query");
		}catch(ClassNotFoundException e){
			System.out.println("Class.forName() errato!!");
		}
		Finestra fin4 = new Finestra();
		fin4.userSearch();
		
			
	}
	
	
	
	public static void inserisciUtente(String cognome, String nome, String tel, String cell,
			                           String mail, String via, String nCivico, String citta, String prov){
		try{
			String driver = "com.mysql.jdbc.Driver";  
			Class.forName(driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Rubrica?user=root&password=sim130789!");
			Statement cmd = con.createStatement();			
			String qry = "INSERT INTO Persona(Cognome,Nome,Telefono,Cellulare,email,Via,NCivico,Città,Provincia) VALUES ('"+
			cognome+"','"+nome+"',"+tel+","+cell+",'"+mail+"','"+via+"','"+nCivico+"','"+citta+"','"+prov+"')";
			int res = cmd.executeUpdate(qry);
			cmd.close();
			con.close();
			System.out.println("Utente inserito :)" + res);
			
			Finestra fin2 = new Finestra();
			fin2.userAdd();
		
		}catch(SQLException e){
			System.out.println("Connessione non riuscita o problema alla query");
		}catch(ClassNotFoundException e){
			System.out.println("Class.forName() errato!!");
		}	
	}
	
	public static void eliminaUtente(String cognome, String nome){
		try{
			String driver = "com.mysql.jdbc.Driver";  
			Class.forName(driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Rubrica?user=root&password=sim130789!");
			Statement cmd = con.createStatement();		
			
			String qry = "DELETE FROM Persona WHERE Cognome='"+cognome+"' AND Nome = '"+nome+"'";
			int res = cmd.executeUpdate(qry);
			cmd.close();
			con.close();
			System.out.println("Utente eliminato :)" + res);
			
			Finestra fin = new Finestra();
			fin.userDelete();

		}catch(SQLException e){
			System.out.println("Connessione non riuscita o problema alla query");
		}catch(ClassNotFoundException e){
			System.out.println("Class.forName() errato!!");
		}
		
		
	}

		
}

