/*
*	Nome: 90_sequenza_invertita.c
*	Data: 27/06/2018
*	Scopo: inverte una sequenza di 10 numeri inseriti dall'utente
*	Autore: Simone Boioli
*/

#include <stdio.h>

#define N 10

int main(void){

int a[N]; //array di N numeri
int *p;

printf("Inserisci %d numeri:", N);

//inserimento numeri
for(p = a; p < a + N; p++){
	scanf("%d", p); 
}	

printf("In ordine inverso:\n");
for(p = a + N - 1; p >= a; p--){
	printf("%d ", *p);
} 

printf("\n\n");

return 0;
}
