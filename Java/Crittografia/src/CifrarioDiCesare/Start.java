package CifrarioDiCesare;

import java.util.Scanner;

public class Start {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Inserisci 1 se vuoi codificare il messaggio e 2 se vuoi decodificarlo: ");
		int valore = s.nextInt();
	
		if(valore == 1){
			//codifica
			System.out.println("Inserisci il messaggio da codificare: ");
			String msg = s.next();
			
			System.out.println("Inserisci la chiave di codifica: ");
			int chiave = s.nextInt();
			
			Codifica cod = new Codifica(msg, chiave);
			String msgCodificato = cod.codifica();
			
			System.out.println("Il messaggio codificato è: " + msgCodificato);
			
		}else if(valore == 2){
			//decodifica
			
		}else{
			System.out.println("ERRORE!!!");
			System.exit(-1);
		}
		
		
	}

}
