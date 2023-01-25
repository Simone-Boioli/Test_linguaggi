/**
*	Nome: 77_cap9_es6.c
*	Data: 05/11/2017	
*	Scopo:	Programma che calcola un polinomio
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int calcola_polinomio(int val);

int main(void){
	int valore = 0;


	printf("Inserisci un valore: ");
	scanf("%d", &valore);

	printf("Il risultato è: %d\n", calcola_polinomio(valore));

	return 0;
}


int calcola_polinomio(int val){
int ris = 0;

ris = (3*(val*val*val*val*val)) +
      (2*(val*val*val*val)) - 
      (5*(val*val*val)) -
      (val*val) +
      (7*(val)) -
      6;	

return ris;

}