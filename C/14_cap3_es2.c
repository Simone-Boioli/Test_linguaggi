/**
*	Nome: 14_cap3_es2.c
*	Data: 01/21/2017	
*	Scopo:	formattare delle informazioni inserite dall'utente
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int cod_articolo = 0;
	float prezzo = 0.0f;

	//data
	int giorno = 0;
	int mese = 0;
	int anno = 0;


	printf("Inserisci il codice dell'articolo: \n");
	scanf("%d", &cod_articolo);

	printf("Inserisci il prezzo dell'articolo: \n");
	scanf("%f", &prezzo);

	printf("inserisci la data di acquisto (gg/mm/aaaa): ");
	scanf("%d/%d/%d", &giorno, &mese, &anno);


	printf("Articolo\tPrezzo\t\tData Acquisto\n");

	printf("%d", cod_articolo);
	printf("\t\t€%.2f", prezzo);
	printf("\t\t%.2d/%.2d/%.4d\n", giorno, mese, anno);

	return 0;
}