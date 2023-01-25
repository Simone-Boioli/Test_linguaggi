import java.io.*;
import java.util.Scanner;

public class WriteRead {
	public static void main(String[] args){
		System.out.println("Hello!");
		PrintWriter numeristream = null;
		try {
			numeristream = new PrintWriter ("numeri.txt");
		}catch (IOException e) {
			System.out.println("Errore durante l'apertura.");
			System.exit(0);
		}
		System.out.println("Inizio scrittura...");
		numeristream.print("1\n3\n2\n4\n5\n6");
		numeristream.close();
		System.out.println("Scrittura terminata.\n");
		
		
		
		Scanner numeriscanner = null;
		try {
			numeriscanner = new Scanner(new FileReader("numeri.txt"));
		}catch (IOException e) {
			System.out.println("Not found.");
			System.exit(0);
		}
		//numeriscanner.useDelimiter(",");

		System.out.println("Inizio lettura...");
		int [] numeri=new int[6];
		int i=0;
		while (numeriscanner.hasNext()) {
			numeri[i]=numeriscanner.nextInt();
			i++;
		}
		System.out.print("eccoli: ");
		for (int k=0; k<numeri.length; k++) 
			System.out.println(""+ numeri[k]);
		numeriscanner.close();
		
	}
}
