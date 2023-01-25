/**
*	Nome: 13_cap3_es1.c
*	Data: 01/21/2017	
*	Scopo:	prende una data dd/mm/aaaa e la scrive aaaammdd
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main (void){

	int giorno = 0;
	int mese = 0;
	int anno = 0;

	printf("Inserisci una data nel formato (dd/mm/aaaa): ");
	scanf("%d/%d/%d", &giorno, &mese, &anno);


	printf("%.4d%.2d%.2d\n", anno, mese, giorno);

	return 0;
}
