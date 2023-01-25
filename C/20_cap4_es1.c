/**
*	Nome: 20_cap4_es1.c
*	Data: 03/22/2017	
*	Scopo:	Programma che chiede all'utente un numero a 2 cifre e lo stampa invertito
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int num = 0; //numero inserito dall'utente
	int a = 0; //primo numero
	int b = 0; //secondo numero

	printf("Inserisci un numero a 2 cifre: ");
	scanf("%d", &num);

	a = num / 10;
	b = num % 10;

	printf("%d%d\n", b, a);


	return 0;
}