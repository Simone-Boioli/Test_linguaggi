/**
*	Nome: 25_cap4_es6.c
*	Data: 03/22/2017	
*	Scopo:	Programma che calcola il carattere di controllo nei codici EAN
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int tipologia = 0;
	int i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12 = 0;
	int controllo = 0;
	int somma_uno = 0;
	int somma_due = 0;
	
	printf("Inserisci le 11 cifre del codice EAN:");
	scanf("%1d%1d%1d%1d%1d%1d%1d%1d%1d%1d%1d%1d", &i1, &i2, &i3, &i4, &i5, &i6, &i7, &i8, &i9, &i10, &i11, &i12);


	somma_uno = i2 + i4 + i6 + i8 + i10 + i12;
	somma_due = i1 + i3 + i5 + i7 + i9 + i11;

	controllo = (9 - ((((somma_uno * 3) + somma_due) - 1) % 10));

	printf("Cifra di controllo: %d\n", controllo);


	return 0;
}
