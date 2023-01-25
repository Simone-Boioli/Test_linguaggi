/**
*	Nome: 28_cap5_es1.c
*	Data: 03/22/2017	
*	Scopo:	Programma che calcola il numero di cifre contenute in un numero (max 4)
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int num = 0;

	printf("Inserisci un numero: ");
	scanf("%d", &num);

	if(num >= 0 && num < 10){
		printf("Il numero %d ha 1 cifra.\n", num);
	}
	else if(num >= 10 && num < 100){
		printf("Il numero %d ha 2 cifre.\n", num);
	}
	else if(num >= 100 && num < 1000){
		printf("Il numero %d ha 3 cifre.\n", num);
	}
	else if(num >= 1000 && num < 10000){
		printf("Il numero %d ha 4 cifre.\n", num);
	}
	else {
		printf("NUMERO ERRATO\n");
	}



	return 0;
}