/**
*	Nome: 49_cap6_es7.c
*	Data: 04/23/2017	
*	Scopo:	Programma che stampa la tavola dei quadrati RIVISITATO
*	Autore:	Boioli Simone
*/


#include <stdio.h>

int main(void){

	int i;
	int n;
	int odd;
	int square;

	printf("Inserisil il numero dei quadrati da stampare: ");
	scanf("%d", &n);


	i = 1;
	odd = 3;

	for (square = 1; i <= n; odd += 2){
		printf("%10d%10d\n", i, square);
		++i;
		square += odd;
	}

	return 0;
}