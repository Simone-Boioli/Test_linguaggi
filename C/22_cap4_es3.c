/**
*	Nome: 22_cap4_es3.c
*	Data: 03/22/2017	
*	Scopo:	Programma che chiede all'utente un numero a 3 cifre e lo stampa invertito senza usare calcli matematici
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int a = 0; //primo numero
	int b = 0; //secondo numero
	int c = 0; //terzo numero

	printf("Inserisci un numero a 3 cifre: ");
	scanf("%1d%1d%1d", &a, &b, &c);

	printf("%d%d%d\n", c,b,a);


	return 0;
}