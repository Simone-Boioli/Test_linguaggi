/**
*	Nome: 59_inverte_numeri.c
*	Data: 10/09/2017	
*	Scopo:	Inverte una serire di numeri inseriti dall'utente
*	Autore:	Boioli Simone
*/

#include <stdio.h>

#define N 10

int main(void){

	int vet[N];
	int i;


	//riempimento array
	printf("Inserisci %d numeri: ", N);
	for(i = 0; i < N; i++){
		scanf("%d", &vet[i]);
	}

	//inversone ordine
	for(i = N-1; i >= 0; i--){
		printf("%d", vet[i]);
	}

	printf("\n");

	return 0;
}