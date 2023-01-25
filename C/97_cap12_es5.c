/*
*	Nome: 97_cap12_es5.c
*	Data: 06/07/18
*	Scopo: Programma che somma gli argomenti da riga di comando
*	Autore: Simone Boioli
*/

#include <stdio.h>
#include <string.h>


int main(int argc, char *argv[]){

	int num = 0;
	int somma = 0;


	for(int i = 0; i < argc; i++){
		num = atoi(argv[i]);

		somma = somma + num;
	}

	printf("La somma è:%d\n", somma);




	return 0;
}