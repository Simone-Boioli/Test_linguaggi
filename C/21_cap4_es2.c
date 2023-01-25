/**
*	Nome: 21_cap4_es2.c
*	Data: 03/22/2017	
*	Scopo:	Programma che chiede all'utente un numero a 3 cifre e lo stampa invertito
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int num = 0; //numero inserito dall'utente
	int a = 0; //primo numero
	int b = 0; //secondo numero
	int c = 0; //terzo numero

	printf("Inserisci un numero a 3 cifre: ");
	scanf("%d", &num);

	a = num / 100;
	b = (num / 10) % 10;
	c = num % 10;


	printf("%d%d%d\n", c,b,a);


	return 0;
}