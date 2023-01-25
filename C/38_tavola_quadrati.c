/**
*	Nome: 38_tavola_quadrati.c
*	Data: 03/23/2017	
*	Scopo:	Programma che stampa la tavola dei quadrati
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int n = 0;

	printf("Inserisil il numero dei quadrati da stampare: ");
	scanf("%d", &n);

	int i = 1; //counter

	while(i < n){
		printf("%10d%10d\n", i, i * i);
		i++;
	}

	return 0;
}