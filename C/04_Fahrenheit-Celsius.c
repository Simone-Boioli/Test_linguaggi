/*
 *	Nome: 04_Fahrenheit-Celsius.c
 *	Data: 12/31/2016
 *	Scopo:  Converte una temperatura in Fahrenheit in Celsius
 *	Autore: Boioli Simone
 */

#include <stdio.h>

#define PUNTO_CONGELAMENTO 32.0f
#define FATTORE_SCALA (5.0f / 9.0f)

int main (void){


	float fahrenheit = 0.0f;
	float celsius = 0.0f;

	printf("Inserisci i gradi in Fahrenheit: ");
	scanf("%f", &fahrenheit);

	celsius = (fahrenheit - PUNTO_CONGELAMENTO) * FATTORE_SCALA;

	printf("Gradi Celsius: %.1f\n\n", celsius);

	return 0;
}

