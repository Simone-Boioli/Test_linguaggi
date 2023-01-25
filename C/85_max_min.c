/**
*	Nome: 85_max_min.c
*	Data: 29/11/2017	
*	Scopo:	Programma che trova il minimo e il massimo in un vettore
*	Autore:	Boioli Simone
*/

#include <stdio.h>

#define N 10

//PROTOTIPI
void max_min(int a[], int n, int *max, int *min);


int main(void){

	int b[N]; //vettore che contiene gli N numeri
	int max; //massimo
	int min; //minimo

	//chiedo i valori
	printf("Inserisci i %d numeri: ", N);

	for(int i = 0; i < N; i++){
		scanf("%d", &b[i]);
	}

	max_min(b, N, &max, &min);  //passo i puntatori ai 2 valori

	printf("Il valore massimo è: %d\n", max);
	printf("Il valore minimo è: %d\n", min);

	return 0;
}

void max_min(int a[], int n, int *max, int *min){

	*max = *min = a[0];

	for(int i = 1; i < n; i++){
		if(a[i] > *max){
			*max = a[i];
		}else if(a[i] < *min){
			*min = a[i];
		}
	}
}