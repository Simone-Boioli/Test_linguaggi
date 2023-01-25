/*
 *  Calcolare il peso di un pacco (Migliorato) facendo inserire dall'utente la dimensione del pacco
*/

#include <stdio.h>

int  main(void){
	int larghezza;
	int altezza;
	int profondita;

	int volume;
	int peso;

	printf("Inserisci la larghezza del pacco: ");
	scanf("%d", &larghezza);

	printf("Inserisci l'altezza del pacco: ");
	scanf("%d", &altezza);

	printf("Inserisci la profondita' del pacco: ");
	scanf("%d", &profondita);

	volume = larghezza * altezza * profondita;
	peso = (volume + 165) / 166;

	printf("Le dimensioni del pacco sono: %dx%dx%d\n", larghezza, altezza, profondita);
	printf("Il volume del pacco e': %d\n", volume);
	printf("Il peso del pacco e': %d\n", peso);

	return 0;

}
