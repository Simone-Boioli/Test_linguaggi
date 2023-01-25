import java.util.Scanner;


public class Start {
	public static void main(String[]args){	
		LCS lcs = new LCS();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci la prima sequenza: ");
		String x = scanner.next();
		
		System.out.print("Inserisci la seconda sequenza: ");
		String y = scanner.next();
		
		System.out.println("La max sottosequenza comune e' lunga: " + lcs.maxLCS(y, x));
		System.out.println(" ");
	}
}
