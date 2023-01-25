/**
*	Nome: 39_somma.c
*	Data: 03/23/2017	
*	Scopo:	Programma che somma una serie di numeri inseriti dall'utente 
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int n = 0;
	int somma = 0;

	printf("Inserisci i numeri(0 per terminare): ");
	scanf("%d", &n);

	while(n != 0){
		somma = somma + n;
		scanf("%d", &n);
	}

	printf("la somma e': %d\n", somma);

	return 0;
}