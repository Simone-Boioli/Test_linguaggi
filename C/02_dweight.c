/*
 * 	Nome: dweght.c
 * 	Data: 15/12/16
 * 	Scopo: calcola il peso volumetrico di un pacco 12"x10"x8"
 * 	Autore: Simone Boioli
 */
 
#include <stdio.h>

int main(void){

	/* Dimensioni pacco */
	int lunghezza = 0;
	int larghezza = 0;
	int altezza = 0;

	/*volume del pacco */
	float volume = 0;
	
	/*peso volumetrico del pacco*/
	float peso = 0.00f;

	/*coefficente di calcolo*/
	int coefficente = 0;


	altezza = 33;
	lunghezza = 40;
	larghezza = 45;

	coefficente = 5000; //DHL

	volume = altezza * lunghezza * larghezza;

	
	peso = volume / coefficente;


	printf("Dimensioni: %dx%dx%d\n",lunghezza,larghezza,altezza);
	printf("Volume: %.2fcm^3\n", volume);
	printf("Peso volumetrico: %.2fKg\n", peso);

	return 0;
}
