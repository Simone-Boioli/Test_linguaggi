/**
*	Nome: 76_cap9_es2.c
*	Data: 05/11/2017	
*	Scopo:	Programma che chiede all'utente il pr (tramite funzione)
*	Autore:	Boioli Simone
*/

#include <stdio.h>

//dichiarazioni funzioni 
int calcoloReddito(int reddito);


int main (void){

    float reddito = 0.0f;
	float imposta = 0.0f;

	printf("Inserisci il tuo reddito: ");
	scanf("%f", &reddito);

	imposta = calcoloReddito(reddito);

	printf("L'imposta dovuta è di: %.2f\n", imposta);

	return 0;
}


int calcoloReddito(int reddito){

	float imposta = 0.0f;

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

	return imposta;
}