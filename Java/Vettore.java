/*Scrivere un programma Java composto dai seguenti metodi:

- metodo max riceve come parametro un vettore int e ne restituisce il massimo

- metodo main chiede all'utente la lunghezza L del vettore e la legge con l'apposito metodo
della classe SavitchIn. Il numero L letto dal programma deve essere necessariamente maggiore di 
zero (si iteri leggendo un nuovo valore fino a che l'utente non scrive un numero maggiore di zero).
Successivamente chiede all'utente L valori double e li legge tramite l'apposito metodo della SavitchIn; 
inizializza un vettore vet con tali valori, chiama il metodo max passando vet come parametro e stampa a 
video il risultato. 
*/

public class Vettore{
		public static int max(int [] vet){
			int mas=vet[0];
			for(int i=0; i<vet.length; i++){
				if(vet[i]>mas){
							mas=vet[i];
				}
			}
			return mas;
		}
		
		public static void main(String[]args){
				System.out.println("Inserisci la lunghezza del vettore");
				int L = SavitchIn.readLineInt();
				while(L<=0){
					System.out.println("Errore,Riprova!");
					L = SavitchIn.readLineInt();
				}
				int [] vet = new int [L];
				for(int i=0; i<vet.length; i++){
						System.out.println("Inserisci valore");
						vet[i] = SavitchIn.readLineInt();
				}
				
				System.out.println("Il massimo e':"+max(vet));
		}
}
