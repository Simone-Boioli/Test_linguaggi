/*
*	Nome: 96_cap12_es4
*	Data: 05/07/18
*	Scopo: Programma che inverte gli argomenti da riga di comando
*	Autore: Simone Boioli
*/

#include <stdio.h>
#include <string.h>

#define MAX_PAROLE 10
#define MAX_LETTERE 20

int main(int args, char *argv[]){


	char parole[MAX_PAROLE][MAX_LETTERE];
	
	int contatore = 0;

	//inserimento parole
	for(int i = 0; i < args; i++){
		strcpy(parole[i], argv[i]);
		contatore++;
	}

	for(int j = contatore-1; j > 0; j--){
		printf("%s ", parole[j]);
	}

	printf("\n\n");

	return 0;
}