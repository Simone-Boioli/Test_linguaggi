/**
*	Nome: 13_Somma_frazioni.c
*	Data: 01/21/2017	
*	Scopo:	programma che fa la somma di 2 frazioni inserite dall'utente
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int num1 = 0;  //numeratorore frazione 1
	int denom1 = 0; //denominatore frazione 1
	int num2 = 0; //numeratore frazione 2
	int denom2 = 0; //denominatore frazione 2
	int ris_num = 0;  //risultato numeratori
	int ris_denom = 0; //risultato denominatori

	printf("Inserisci la prima frazione (a/b): ");
	scanf("%d/%d", &num1, &denom1);

	printf("Inserisci la seconda frazione (a/b): ");
	scanf("%d/%d", &num2, &denom2);

	ris_num = (num1 * denom2) + (denom1 * num2);
	ris_denom = (denom2 * denom1);

	printf("la somma delle 2 frazioni e': %d/%d\n",ris_num, ris_denom);


	return 0;
}