/*Scrivere un programma Java che:

o Legge un valore intero positivo N con l'apposito metodo della classe SavitchIn (qualora il valore digitato non sia strettamente positivo, 
itera finche' l'utente non inserisce un valore positivo).

o Definisce un vettore vet di N interi.

o Assegna, ad ogni posizione del vettore vet, un valore int letto tramite l'apposito metodo della classe SavitchIn.

o Stampa a video il vettore vet 
*/

public class Vettore2{
		public static void main(String[]args){
			int N=0;
			do{
				System.out.println("Inserisci un intero");
				N=SavitchIn.readLineInt();
			}
			while (N<0);
			
			int[] vet = new int [N];
			int M=0;
			for (int i=0; i<vet.length; i++){
				System.out.println("Inserisci un numero");
				vet[i]=SavitchIn.readLineInt();
				
			}
			
			for(int j=0; j<vet.length;j++){
					System.out.println(vet[j]);
			}
			
		}
}