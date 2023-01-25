/**
*	Nome: 41_tavola_quadrati2.c
*	Data: 03/27/2017	
*	Scopo:	Programma che stampa la tavola dei quadrati RIVISITATO
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int n = 0;

	printf("Inserisil il numero dei quadrati da stampare: ");
	scanf("%d", &n);


	for (int i = 1; i <= n; i++){
		printf("%10d%10d\n", i, i * i);
	}

	return 0;
}