/*Scrivere un programma Java composto dai seguenti metodi:

   1. metodo moltiplica: riceve come parametri due numeri double N e M e restituisce il prodotto tra N e M 
      supponendo di non poter utilizzare l'operatore di moltiplicazione standard di Java *.
   2. metodo main: legge un numero intero N tramite l'apposito metodo della classe SavitchIn e stampa a 
   video il quadrato di tutti i numeri compresi tra 1 e N (estremi compresi). In altri termini, andrà stampato
   un messaggio come il seguente:
           il quadrato di 1 è 1
           il quadrato di 2 è 4
           ...
           il quadrato di N è ...
      si utilizzi il metodo moltiplica per calcolare i prodotti, ovunque ve ne sia necessità. 
*/

public class Moltiplica {
		public static double moltiplica(double N, double M){
			double ris=0;	
			for(int i=0;i<M;i++){
					ris=ris+N;
			}
			return (ris);
		}
		
		public static void main(String[]args){
				System.out.println("Inserisci una numero");
				double n = SavitchIn.readLineInt();
				double m=2;
				for(int i=1;i<=n;i++){
					System.out.println("Il quadrato di "+ i +" "+"e"+" "+moltiplica(i,i));
					
				}	
			
		}
}