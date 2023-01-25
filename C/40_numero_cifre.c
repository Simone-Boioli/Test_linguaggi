/**
*	Nome: 40_numero_cifre.c
*	Data: 03/23/2017	
*	Scopo:	Programma che calcola il numero di cifre di un intero 
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int n = 0;
	int cifre = 0;

	printf("Inserisci un intero: ");
	scanf("%d", &n);

	do{
		n = n / 10;
		cifre++;

	}while(n > 0);


	printf("Il numero inserito ha: %d cifre\n", cifre);

	return 0;
}