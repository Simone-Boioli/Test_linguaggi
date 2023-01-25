/**
*	Nome: 45_cap6_es3.c
*	Data: 04/08/2017	
*	Scopo:	Programma che chiede all'utente una frazione e la riduce ai minimi termini
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int num = 0;  //numeratore
	int den = 0;  //denominatore
	int resto = 0;
	int MCD = 0;

	printf("Inserisci la frazione (a/b): ");
	scanf("%d/%d", &num, &den);

	//copia dati
	int num2 = num;
	int den2 = den;

	while(den != 0){
		resto = num%den;			
		num = den;		
		den = resto;
	}

	MCD = num;

	printf("In minimi termini e': %d/%d\n", num2/MCD, den2/MCD);




	return 0;
}