/*
 *	Nome: 06_cap2_es2.c
 *	Data: 12/31/2016
 *	Scopo: il programma calcola il volume di una sfera con un raggio di 10m (4/3*pigreco*r^3)
 *	Autore: Boioli Simone
 */

#include <stdio.h>

#define PIGRECO 3.1416

int main(void){

	float raggio = 10.0;
	float volume = 0.0f;

	volume = (4.0f/3.0f) * PIGRECO * (raggio*raggio*raggio);

	printf("Il volume di una sfera di raggio 10 e': %.2f\n", volume);   

	return 0;
}