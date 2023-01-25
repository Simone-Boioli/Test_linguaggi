/**
*	Nome: 47_cap6_es5.c
*	Data: 04/08/2017	
*	Scopo:	Programma che chiede all'utente un numero e lo stampa invertito
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int num = 0; //numero inserito dall'utente
	int x = 0;

	printf("Inserisci un numero: ");
	scanf("%d", &num);

	do{
		x = num % 10;
		num = num / 10;

		printf("%d", x);

	}while(num != 0);

	printf("\n");
	
	return 0;
}