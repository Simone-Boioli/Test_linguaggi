using System;

namespace Calcolatrice
{
    public class Calcolatrice{
			
    public static void Main(){
	Console.WriteLine("-------------------------------------");
	Console.WriteLine("------------ Calcolatrice -----------");
	Console.WriteLine("-------------------------------------");
			
	Console.WriteLine("0x00 -- Indice");
	Console.WriteLine("1 --> Somma ");
	Console.WriteLine("2 --> Sottrazione");
	Console.WriteLine("3 --> Moltiplicazione");
	Console.WriteLine("4 --> Divisione");
			
	Console.WriteLine("\nInserisci il numero dell'operazione: ");
	String op = Console.ReadLine();
			
	int val;
			
	switch(op){
	    case 1:
		Console.WriteLine("Inserisci il numero di valori da sommare ");
		val = Console.Read();
				
		for(int i = 0; i < val; i++){
						
		}
				
		somma();
		break;
					
	}
				
				
		}
		
		public int somma(int v1, v2){
			return v1 + v2	
		}
		
		public int sottrazione(int v1, int v2){
			return v1 - v2;
		}
		
		public int moltiplicazione(int v1, int v2){
			return v1 * v2;	
		}
		
		public int divisione(int v1, int v2){
			return v1 / v2;	
		}
	}
}

