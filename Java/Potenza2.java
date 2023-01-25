/*Scrivere un programma Java che legge due numeri interi N e M tramite l'apposito metodo della classe
SavitchIn e stampa a video N^M supponendo di non avere a disposizione l'operatore di elevamento a potenza
(ovvero utilizzando solo la moltiplicazione). 
*/

public class Potenza2{
	public static void main(String[] args){
		System.out.println("Inserisci un numero intero");
		int n = SavitchIn.readLineInt();
		System.out.println("Inserisci un numero intero");
		int m = SavitchIn.readLineInt();
		int ris=1;
		for(int i=0; i<m;i++){
			ris = ris*n;
		}
		System.out.println(ris);
			
		
	}	
}