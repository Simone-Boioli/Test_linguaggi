/*
 *	Nome: 03_Peso_Volumetrico2.c
 *	Data: 16/12/16
 *	Scopo: Calcolo Peso volumetrico di un pacco con dimensioni inserite dall'utente
 *	Autore: Boioli Simone
 *
 */

#include <stdio.h>

int main (void){

	//dimensioni pacco
	int lunghezza = 0;
	int larghezza = 0;
	int altezza = 0;

	//coefficente di calcolo
	float coefficente = 0.0f;

	//volume pacco
	float volume = 0.0f;

	//peso volumetrco pacco
	float peso = 0.0f;


	printf("Inserisci la lunghezza in cm del pacco: \n");
	scanf("%d", &lunghezza);

	printf("Inserisci la larghezza in cm del pacco: \n");
	scanf("%d", &larghezza);

	printf("Inserisci l'altezza in cm del pacco: \n");
	scanf("%d", &altezza);

	printf("\n\n");

	printf("|******************|\n");
	printf("| DHL       | 5000 |\n");
	printf("| Bartolini | 3000 |\n");
	printf("| SDA       | 3333 |\n");
	printf("| UPS       | 5000 |\n");
	printf("|******************|\n");
	
	printf("Inserisci il coefficente in base allo spedizionere: \n");
	scanf("%f", &coefficente);

	volume = (lunghezza * larghezza * altezza);

	peso = (volume / coefficente);

	printf("Dimensioni: %dx%dx%d\n", lunghezza, larghezza, altezza);
	printf("Volume: %.0fcm^3\n", volume);
	printf("Peso voumetrico: %.2fkg\n\n\n", peso);

	return 0;
}
