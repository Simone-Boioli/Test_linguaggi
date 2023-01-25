/**
*	Nome: 43_cap6_es1.c.c
*	Data: 03/27/2017	
*	Scopo:	Programma che chiede all'utente una serie di numeri e che mostra il più grande quando si inserisci uno 0 o num. negativo
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	float max = 0.0f;
	float n = 0.0f;

	for(;;){
		printf("Inserisci un numero (0 per terminare): ");
		scanf("%f", &n);

		if(n <= 0){
			printf("\nIl numero massimo inserito e': %f\n", max);
			break;
		}else{
			if(n > max){
				max = n;
			}
		}

	}

	return 0;
}