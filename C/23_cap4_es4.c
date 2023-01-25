/**
*	Nome: 23_cap4_es4.c
*	Data: 03/22/2017	
*	Scopo:	Programma che chiede all'utente un numero intero e lo stampa in base ottale
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int num = 0; //numero inserito dall'utente
	int a, b, c, d, e = 0; //cifre del numero ottale



	printf("Inserisci un numero intero: ");
	scanf("%d", &num);

	e = num % 8;
	d = (num / 8) % 8;
	c = ((num / 8) / 8) % 8;
	b = (((num / 8) / 8) /8) % 8;
	a = ((((num / 8) /8) /8) /8) % 8;

	printf("il numero in ottale è %d%d%d%d%d\n", a,b,c,d,e);


	return 0;
}