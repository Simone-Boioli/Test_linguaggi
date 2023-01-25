/**
*	Nome: 31_cap5_es4.c
*	Data: 03/22/2017	
*	Scopo:	Programma che chiede all'utente di inserire la velocità del vento e visualizza la descrizione adeguata
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int vel = 0; //velocità vento

	printf("Inserisci la velocità del vento in nodi: ");
	scanf("%d", &vel);

	if(vel < 1){
		printf("CALMO\n");
	}
	else if(vel >=1 && vel <= 3){
		printf("BAVA DI VENTO\n");
	}
	else if(vel >= 4 && vel <= 27){
		printf("BREZZA\n");
	}
	else if(vel >=28 && vel <= 47){
		printf("BURRASCA\n");
	}
	else if(vel >= 48 && vel <= 63){
		printf("TEMPESTA\n");
	}
	else{
		printf("URAGANO\n");
	}


	return 0;
}