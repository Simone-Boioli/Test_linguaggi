/**
*	Nome: 15_cap3_es3.c
*	Data: 01/21/2017	
*	Scopo:	Divisione codice ISBN
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main (void){

	int GS1 = 0;
	int id_gruppo = 0;
	int cod_editore = 0;
	int cod_articolo = 0;
	int controllo = 0;

	printf("Inseirisci il codice ISBN con i trattini: ");
	scanf("%d-%d-%d-%d-%d", &GS1, &id_gruppo, &cod_editore, &cod_articolo, &controllo);

	printf("Prefisso GS1: %d\n", GS1);
	printf("Identificativo Gruppo: %d\n", id_gruppo);
	printf("Codice editore: %d\n", cod_editore);
	printf("Codice articolo: %d\n", cod_articolo);
	printf("Cifra Controllo: %d\n", controllo);

	return 0;
}
