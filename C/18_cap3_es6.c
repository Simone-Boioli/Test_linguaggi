/**
*	Nome: 18_cap3_es6.c
*	Data: 01/29/2017	
*	Scopo:	modifica prograam frazioni 12_somma_frazioni.c
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

	printf("Insserisci le due frazioni separati da +: ");
	scanf("%d/%d+%d/%d", &num1, &denom1, &num2, &denom2);

	ris_num = (num1 * denom2) + (denom1 * num2);
	ris_denom = (denom2 * denom1);

	printf("la somma delle 2 frazioni e': %d/%d\n",ris_num, ris_denom);


	return 0;
}