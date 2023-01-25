/*
*	Nome: 08_cap2_es4.c
*	Data: 01/01/2017
*	Scopo: chiede all'utente una cifra in euro e centsimi e restitisce il valore con i 5% inpiù
*	Autore: Boioli Simone	
*/

#include <stdio.h>

int main(void){

	float cifra = 0.0f;
	float totale = 0.0f;

	printf("Inserisci la cifra (euro.centesimi): \n");
	scanf("%f", &cifra);

	totale = cifra + ((cifra * 5) / 100);

	printf("Con la tassa e': %.2f", totale);

	return 0;
}