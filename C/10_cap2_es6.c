/*
*	Nome: 10_cap2_es6.c
*	Scopo: chiede all'utente un valore di x e risolve un polinomio
*	Data: 01/01/2017
*	Autore: Boioli Simone
*/

#include <stdio.h>

int main (void){

	int x = 0;
	int ris = 0; //risultato polinomio

	printf("Inserisci il valore di x: ");
	scanf("%d", &x);

	ris = ((((3*x + 2)*x - 5)*x - 1)*x + 7)*x - 6;

	printf("Il risultato del polinomio e': %d\n", ris);

	return 0;
}