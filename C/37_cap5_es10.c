/**
*	Nome: 37_cap5_es10.c
*	Data: 01/30/2017	
*	Scopo:	Programma che converte il voto da numero a lettera
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int voto = 0;

	printf("Inserisci il voto in numero: ");
	scanf("%d", &voto);

	//controllo voto
	if(voto > 100 || voto < 0){
		printf("ERRORE INSERIMENTO\n");
		return 0;
	}

	int dec = voto / 10; //prondo la prima cifra

	switch(dec){
		case 10: printf("Voto in lettere: A\n");
				 break;
		case 9: printf("Voto in lettere: A\n");
				 break;
		case 8: printf("Voto in lettere: B\n");
				 break;
		case 7: printf("Voto in lettere: C\n");
				 break;
		case 6: printf("Voto in lettere: D\n");
				 break;
		default: printf("Voto in lettere: F\n");
				 break;
	}


	return 0;
}