/**
*	Nome: 66_cap8_es4.c
*	Data: 24/09/2017	
*	Scopo:	Inverte una serire di numeri inseriti dall'utente
*	Autore:	Boioli Simone
*/

#include <stdio.h>

#define N ((int) (sizeof(vet)) / (sizeof(vet[0])))

int main(void){

	int valori = 5;
	int vet[valori];
	int i;


	//riempimento array
	printf("Inserisci %d numeri: ", valori);
	for(i = 0; i < N; i++){
		scanf("%d", &vet[i]);
	}

	//inversone ordine
	for(i = N-1; i >= 0; i--){
		printf("%d ", vet[i]);
	}

	printf("\n");

	return 0;
}