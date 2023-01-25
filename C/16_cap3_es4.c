/**
*	Nome: 16_cap3_es4.c
*	Data: 01/28/2017	
*	Scopo:	Cambio stampa numero telefono inserito dall'utente
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int primo_blocco = 0;
	int secondo_blocco = 0;
	int terzo_blocco = 0;

	printf("Inserisci il numero di telefono nel formato [(xxx) xxx-xxxx ]");
	scanf("(%d)%d-%d", &primo_blocco, &secondo_blocco, &terzo_blocco);

	printf("%d.%d.%d\n", primo_blocco, secondo_blocco, terzo_blocco);

	return 0;
}