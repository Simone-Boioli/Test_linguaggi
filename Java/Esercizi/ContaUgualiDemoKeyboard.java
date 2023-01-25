/************************************************
 Scrivere un metodo ricorsivo in Java che dati due array di interi (A e B) calcola e ritorna al chiamante
 il numero di posizioni in cui appare lo stesso elemento sia in A che in B.

 Ad esempio dati gli array :

 int A[] = {5, 7, 2, 3, 10, 8, 4};
 int B[] = {11, 7, 3, 8, 10, 1, 5};

 il risultato e' 2 perche' A[1] == B[1] e A[4] == B[4]

 E' richiesto di completare il codice Java seguente in modo tale da:
 1) Implementare utilizzando la RICORSIONE il metodo contaUguali che calcola e ritorna al 
 chiamante il numero di posizioni in cui appare lo stesso numero intero sia in A che in B.
 Se non ci sono posizioni uguali ritornera' 0.

 2) Richiedere l'array B di interi da tastiera utilizzando la classe Scanner. 
 Per semplificare il compito l'array B sara' sempre della stessa lunghezza di A.

 3) Gestire (intercettare) l'eccezione che si puo' presentare nel caso l'utente inserisca valori non interi 
  (ad es. 2,2); il codice di gestione dell'eccezione puo' limitarsi a stampare un messaggio
  appropriato sullo schermo.
 ***********************************************/
import java.util.*;
import java.io.*;

public class ContaUgualiDemoKeyboard {

public static void main(String args[])
{

	int A[] = {5, 7, 2, 3, 10, 8, 4};
	int B[] = {0, 0, 0, 0, 0, 0, 0};
	int quantiUguali = 0;

	Scanner keyboard = new Scanner(System.in);

// Ciclo di richiesta degli interi con cui riempire l'array B da tastiera
		
	for (int i=0; i< B.length;i++)
	{
		try
		{		
			System.out.println("Inserisci un numero intero:");
			B[i] = keyboard.nextInt();
		}
		catch (InputMismatchException e)
		{	
			keyboard.nextLine();
			System.out.println("Il valore che hai scelto per questo elemento dell'array non e' consentito.");
			System.out.println("Riprova, per favore. ");
			i--;		
		} 
		// i++;
	}

	quantiUguali = ContaUgualiDemoKeyboard.contaUguali(A, B, 0, A.length-1);

	System.out.println("L'array A e B hanno " + quantiUguali + " numeri uguali e nella stessa posizione.");

}

	public static int contaUguali(int a[], int b[], int from, int to)
	{
		// assumendo che i due vettori hanno la medesima dimensione
		// from e' l'indice del primo elem, to e' l'indice dell'ultimo elem

		if (from == to) 
			return a[from] == b[from] ? 1 : 0;
		//if (from < to) 
		return a[from] == b[from] ? (1 + contaUguali(a, b, ++from, to)) : contaUguali(a, b, ++from, to);			
	}


} 