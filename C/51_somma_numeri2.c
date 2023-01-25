/**
*	Nome: 51_somma_numeri2.c
*	Data: 04/23/2017	
*	Scopo:	Programma che somma una serie di numeri inseriti dall'utente  (rivisitato con numeri long) 
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	long n = 0;
	long somma = 0;

	printf("Inserisci i numeri(0 per terminare): ");
	scanf("%ld", &n);

	while(n != 0){
		somma = somma + n;
		scanf("%ld", &n);
	}

	printf("la somma e': %ld\n", somma);

	return 0;
}