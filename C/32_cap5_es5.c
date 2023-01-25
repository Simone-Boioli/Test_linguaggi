/**
*	Nome: 32_cap5_es5.c
*	Data: 03/22/2017	
*	Scopo:	Programma che chiede all'utente il proprio reddito e tampa l'imposta dovuta
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	float reddito = 0.0f;
	float imposta = 0.0f;

	printf("Inserisci il tuo reddito: ");
	scanf("%f", &reddito);

	if(reddito <= 750.00f){
		imposta = (0.001f * reddito);
	}
	else if(reddito <= 2250.00f){
		imposta = 7.50 + (0.002 * (reddito - 750.00f));
	}
	else if(reddito <= 3750.00f){	
		imposta = 37.50 + (0.003 * (reddito - 2250.00f));
	}
	else if(reddito <= 5250.00f){
		imposta = 82.50 + (0.004 * (reddito - 3750.00f));
	}
	else if(reddito <= 7000.000){
		imposta = 142.50 + (0.005 * (reddito - 5250.00f));
	}
	else{
		imposta = 230.00 + (0.006 * (reddito - 7000.00f));
	}


	printf("L'imposta dovuta è di: %.2f\n", imposta);

	return 0;
}