/**
*	Nome: 74_Quicksort.c
*	Data: 04/11/2017	
*	Scopo:	Programma che ordina un array di numeri tramite quicksort
*	Autore:	Boioli Simone
*/

#include <stdio.h>

#define N 10 //numeri da ordinare


int dividi (int a[], int inizio, int fine){
	int elemento = a[inizio];

	for(;;){
		while(inizio < fine && elemento <= a[fine])
			fine--;

		if(inizio > fine) break;

		a[inizio++] = a[fine];

		while(inizio < fine && a[inizio] <= elemento)
			inizio++;

		if(inizio >= fine) break;
		
		a[fine--] = a[inizio];
	}
	a[fine] = elemento;
	return fine;
}


//funzione ricorsiva del quicksort
void quicksort(int a[], int inizio, int fine){
	int meta;

	if(inizio >= fine) return;

	meta = dividi(a, inizio, fine);
	quicksort(a, inizio, meta-1);
	quicksort(a, meta+1, fine);
}


int main (void){

	int a[N]; //array contente i numeri da ordinare
	int i;

	printf("Inserisci %d numeri da ordinare: ", N);
	for(i = 0; i < N; i++){
		scanf("%d", &a[i]);
	}

	quicksort(a, 0, N-1);

	printf("In Ordine: ");

	for (i = 0; i < N; i++){
		printf("%d ", a[i]);
	}
	printf("\n");


	return 0;
}