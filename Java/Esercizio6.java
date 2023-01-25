/*
-Metodo controlla Riceve in ingresso un numero intero n e restituisce un booleano. Il valore restituito deve
essere true nel caso in cui n sia divisibile sia per 2 che per 3 oppure che n sia divisibile sia per 5 che per 7.


-Metodo main invoca il metodo controlla 1000 volte passando come parametri tutti i numeri interi 
compresi tra 1 e 1000 e ne stampa a video il risultato.
*/


public class Esercizio6{
		public static void main(String[]args){
			for(int i=0; i<=1000;i++){
					System.out.println(controlla(i));
			}
			
		}
		
		public static boolean controlla (int n){
			return (((n%2==0)&&(n%3==0))||((n%5==0)&&(n%7==0)));
				
		}
}