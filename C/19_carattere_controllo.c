/**
*	Nome: 19_carattere_controllo.c
*	Data: 01/30/2017	
*	Scopo:	Programma che calcola il carattere di controllo nei codici a barre
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int tipologia = 0;
	int i1, i2, i3, i4, i5 = 0;
	int j1, j2, j3, j4, j5 = 0;
	int somma_uno = 0;
	int somma_due = 0;
	int controllo = 0;

	printf("Inserisci la prima cifra (singola): ");
	scanf("%d", &tipologia);
	
	printf("Inserisci il primo gruppo d 5 cifre: ");
	scanf("%1d%1d%1d%1d%1d", &i1, &i2, &i3, &i4, &i5);

	printf("Inserisci il secondo gruppo d 5 cifre: ");
	scanf("%1d%1d%1d%1d%1d", &j1, &j2, &j3, &j4, &j5);

	somma_uno = tipologia + i2 + i4 + j1 + j3 + j5;
	somma_due = i1 + i3 + i5 + j2 + j4;

	controllo = (9 - ((((somma_uno * 3) + somma_due) - 1) % 10));

	printf("Cifra di controllo: %d\n", controllo);


	return 0;
}
