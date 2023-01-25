#include<stdio.h>

int main(void){
	int x;
	int risultato; //risultato di 3x^5 + 2x^4 - 5^x*3 - x^2 + 7x -6	

	printf("Inserisci il valore di x: ");
	scanf("%d", &x);

	risultato = (3 * (x*x*x*x*x)) + 
		    (2 * (x*x*x*x)) -
		    (5 * (x*x*x)) - 
		    (x * x) +
		    (7 * x) -
                    6;
	
	printf("Il risultato dell'equazione è: %d\n", risultato); 

	return 0;
}
