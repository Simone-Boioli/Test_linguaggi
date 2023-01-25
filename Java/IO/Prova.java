import java.io.*;
import java.util.*;

public class Prova{
		public static void main(String [] args){
			/**
			*	Apriamo un file e scriviamolo
			*/
			
			PrintWriter outputStream = null;
			try{
				outputStream = new PrintWriter(new FileOutputStream("prova.txt"));
			}catch(FileNotFoundException e){
				System.exit(0);
			}
			
			System.out.println("inserisci la grandezza dell'array");
			
			Scanner tastiera = new Scanner(System.in);
			int n = tastiera.nextInt();
			
			System.out.println("inserisci il valore da cercare: ");
			int key = tastiera.nextInt();
			
			int vet [] = new int [n];
			
			for(int i = 0; i < n; i++){
				outputStream.println(i);
			}
			outputStream.close();
			System.out.println("Scritto");
			
			
			/**
			*      Leggiamo e cerchiamo il valore
			*/
			
			try{
				BufferedReader inputStream = new BufferedReader(new FileReader("prova.txt"));
				int vet2[] = new int [n];
				
				for(int i = 0; i < n; i++){
					String line = null;
					line = inputStream.readLine();
					int val = Integer.parseInt(line);
					vet2[i] = val;
				}
				
				inputStream.close();
				
				System.out.println("Letto");
				
				System.out.println("il valore cercato è in posizione: "+ ricerca(vet2, key));
				
			}catch(FileNotFoundException e){
				System.out.println("file non trovato");
				System.exit(0);
			}catch(IOException e){
				System.out.println("errore lettura file");
				System.exit(0);
			}
		}
		
		public static int ricerca(int vet[], int k){
			int i = 0; 
			int f = vet.length;
			int m = ((i+f)/2);
			
			while(i<f && vet[m] != k){
				if(k>vet[m]){
					i = m+1;
					m = ((i+f)/2);
				}else{
					f=m-1;
					m = (i+f)/2;
				}
			}
			
			if(m >= vet.length){
				return (-1);
			}else{
				return m;
			}
		}
}