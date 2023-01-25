/**
*	Nome: 72_countdown.c
*	Data: 08/10/2017	
*	Scopo:	Programma che stampa un countdown
*	Autore:	Boioli Simone
*/

#include <stdio.h>


/*
*  FUNZIONE CHE STAMPA UN VALORE INTERO PASSATO
*/
void stampa_conto(int i){
	printf("%d\n", i);
}



int main (void){
	int i;

	for(i = 10; i > 0; i--){
		stampa_conto(i);
	}

	return 0;
}
