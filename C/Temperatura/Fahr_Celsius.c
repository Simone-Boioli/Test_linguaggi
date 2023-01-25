/*
 *	Convertitore Fahrenheit a Celsius
 */ 

#include <stdio.h>

#define PUNTO_CONGELAMENTO 32.0f  //costante
#define FATTORE_SCALA (5.0f / 9.0f) 

int main(void){
	float fahrenheit;
	float celsius;
	
	printf("Inserisci la temperatura in Fahrenheit: ");
	scanf("%f", &fahrenheit);

	celsius = (fahrenheit - PUNTO_CONGELAMENTO) * FATTORE_SCALA;

	printf("La temperature è di: %.1f gradi celcius\n", celsius);


	return 0;
}
