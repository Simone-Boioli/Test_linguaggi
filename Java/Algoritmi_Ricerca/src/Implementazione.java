import java.util.Scanner;

import Algoritmi_Ricerca.BinarySearch;


public class Implementazione {
	public static void main(String[] args) {
		int [] a = new int [10];
		System.out.println("Inserisci 10 interi in ordine crescente");
		System.out.println("uno per linea.");
		
		Scanner keyboard = new Scanner(System.in);
		int i;
		for(i = 0; i < 10; i++){
			a[i]=keyboard.nextInt();
		}
		
		System.out.println("");
		for(int j = 0; j < 10; j++){
			System.out.println(a[j]);
		}
		System.out.println("");
		System.out.println("");
		
		BinarySearch finder = new BinarySearch(a);
		
		System.out.println("inserisci un valore da cercare");
		int target = keyboard.nextInt();
		int result = finder.findHelper(target);
		
		if(result < 0){
			System.out.println("elemento inesistente nell'array");
		}else{
			System.out.println("l'elemnto cercato si trova in posizione: "+result);
		}
		
	}

}
