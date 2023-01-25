import java.util.*;
class Prova{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		System.out.println("Inserisci un numero: ");
		int m = input.nextInt();
		
		stampa(n,m);
	}	
	public static void stampa(int n, int m){
		if(n>0){
			int a=0;
			while(a<n){
				System.out.println(m);
				a++;
			}
		}else{
			System.out.println("\n NUMERO NEGATIVO!! Error.");
		}
	}
	
	
} 