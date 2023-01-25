/**
*	Nome: 52_lungh_mex.c
*	Data: 04/23/2017	
*	Scopo:	Programma che determina la lunghezza di un messaggio
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	char ch;
	int len = 0;

	printf("Inserisci il messaggio: ");

	while(ch = getchar() != '\n'){
		len++;
	}
	
	printf("\nIl messaggio ha %d caratteri.\n", len);

	return 0;
}