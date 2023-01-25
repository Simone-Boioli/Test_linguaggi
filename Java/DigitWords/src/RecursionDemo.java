import java.util.Scanner;


public class RecursionDemo {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un intero");
		int num = scanner.nextInt();
		System.out.println("I caratteri digitati sono:");
		inWords(num);
		System.out.println("");

	}
	/*
	 * metodo ricorsivo
	 */
	public static void inWords(int n){
		if(n < 10){ // caso base
			System.out.println(digitWord(n));
		}else{  // il numero passato ha più di una cifra
			inWords(n/10); // richiama se stesso togliendo una cifra
			System.out.println(digitWord(n%10)+" ");
		}
	}
	
	private static String digitWord(int n){
		String result = null;
		switch(n){
		case 0:
			result = "zero";
			break;
		case 1:
			result = "uno";
			break;
		case 2:
			result = "due";
			break;
		case 3:
			result = "tre";
			break;
		case 4:
			result = "quattro";
			break;
		case 5:
			result = "cinque";
			break;
		case 6:
			result = "sei";
			break;
		case 7:
			result = "sette";
			break;
		case 8:
			result = "otto";
			break;
		case 9:
			result = "nove";
			break;
		
		}
		return result;
	}
}
