import java.util.*;

public class Start {
	public static void main(String [] a)throws Exception{
		Scanner scanner = new Scanner(System.in);
		int choice;
		String username;
		String password;
		String messege;
		
		System.out.println("Username:");
		username = scanner.nextLine();
		System.out.println("Password:");
		password = scanner.nextLine();
		
		Nerdz nerdz = new Nerdz(username, password);
		
		do{
			System.out.println("Scegli cosa vuoi fare: \n\n [1]login \n\n[2]logaut\n\n[3]nuovo_nerdz\n\n[4]ultimi_10_post\n\n[5]uscire");
			choice = scanner.nextInt();
			
			switch(choice){
			case 1:
					System.out.println(nerdz.login(username, password));
					break;
			case 2:
					System.out.println(nerdz.logout());
					break;
			case 3:
					System.out.println("nerdz:");
					messege = scanner.next();
					System.out.println(nerdz.nerdzIt(messege));
					break;
			case 4:
					System.out.println(nerdz.getNerdz());
					break;
			case 5:
					System.out.println("ciao");
			}
		}while(choice != 5);
	}
}
