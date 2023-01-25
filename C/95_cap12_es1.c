/*
*	Nome: 95_cap12_es1
*	Data: 05/07/18
*	Scopo: Programma che cerca la parola "maggiore" e quella "minore" tra una serie parole inserite
*	Autore: Simone Boioli
*/

#include <stdio.h>
#include <string.h>

#define MAX_LETTERE 20  //numero massimo di lettere nella parola
#define MAX_PAROLE 10  //numero massimo di parole inserite

int main(void){
	
	char min_word[MAX_LETTERE];
	char max_word[MAX_LETTERE];

	char parole[MAX_PAROLE][MAX_LETTERE];


	for(int i = 0; i <= MAX_PAROLE; i++){
		printf("Inserisci la parola: ");
		scanf("%s", parole[i]);


		//primo elemento
		if(min_word[0] == '\0'){
			strcpy(min_word,parole[i]);
			strcpy(max_word,parole[i]);
		}

		//controllo min e max
		if(strcmp(parole[i], min_word) < 0){
			strcpy(min_word,parole[i]);
		}else{
			if(strcmp(parole[i], max_word) > 0){
				strcpy(max_word,parole[i]);
			}
		}

		//controllo di uscita
		int len = strlen(parole[i]);
		if(len == 4 || i == (MAX_PAROLE-1)){
			break;
		}
	}


	printf("------------------\n");
	printf("MINIMO: %s\n", min_word);
	printf("MASSIMO: %s\n", max_word);
	printf("------------------\n");

	return 0;
}