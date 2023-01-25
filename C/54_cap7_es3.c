/**
*	Nome: 54_cap7_es3.c
*	Data: 06/23/2017	
*	Scopo:	Programma che somma una serie di numer double
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	double n = 0;
	double somma = 0;

	printf("Inserisci i numeri(0 per terminare): ");
	scanf("%lf", &n);

	while(n != 0){
		somma = somma + n;
		scanf("%lf", &n);
	}

	printf("la somma e': %lf\n", somma);

	return 0;
}
