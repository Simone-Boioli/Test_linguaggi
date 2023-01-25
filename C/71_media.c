/**
*	Nome: 71_media.c
*	Data: 08/10/2017	
*	Scopo:	Programma che legge 3 numeri e calcola la media sulle diverse coppie
*	Autore:	Boioli Simone
*/

#include <stdio.h>


/*
* 	CALCOLA LA MEDIA TRA 2 NUMERI
*/
double media (double a, double b){
	return ((a + b) / 2);
}


int main (void){

	double x, y, z;

	printf("Inserisci 3 numeri double: ");
	scanf("%lf%lf%lf", &x, &y, &z);

	printf("La media tra %g e %g è: %g\n", x, y, media(x,y));
	printf("La media tra %g e %g è: %g\n", y, z, media(y,z));
	printf("La media tra %g e %g è: %g\n", x, z, media(x,z));

	return 0;
}


