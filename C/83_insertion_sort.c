/**
*	Nome: 83_insertion sort.c
*	Data: 13/11/2017	
*	Scopo:	Programma che implementa l'insertion sort
*	Autore:	Boioli Simone
*/

#include <stdio.h>

#define NUMERI 10

//prototipi
void insertion_sort(int A[]);
void stampa_vettore(int vettore[]);


int main (void){

	int array[10] = {0};

	printf("Inserisci 10 numeri da ordinare: ");

	for(int i = 0; i < NUMERI; i++){
		scanf("%d", &array[i]);
	}

	insertion_sort(array);

	return 0;
}


void insertion_sort(int A[]){
	int key;
	int i; 

	for(int j = 1; j < NUMERI; j++){
		key = A[j]; //metto il valore da confrontare nella variabile key
		i = j - 1; //contatore

		while(i >= 0 && A[i] > key){ //finchè il contatore non arriva a 0 e gli elementi dell'array sono maggiori di key
			A[i + 1] = A[i]; //sposto i valori di una posizione per fare spazio al valore più piccolo
			i = i - 1; //decremento il contatore
		}

		A[i + 1] = key; //inserisco il valore nella posizione corretta
	}

	stampa_vettore(A);
}

void stampa_vettore(int vettore[]){
	for(int i = 0; i < NUMERI; i++){
		printf("%d ", vettore[i]);
	}
	printf("\n");
}