/**
*	Nome: 29_cap5_es2.c
*	Data: 03/22/2017	
*	Scopo:	Programma che trasforma un orario da 24 a 12ore
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main (void){

	int ora = 0;
	int minuti = 0;

	printf("Inserisci l'ora nel formato 24 ore (hh:mm): ");
	scanf("%d:%d", &ora, &minuti);

	// calcolo ora
	if(ora <= 12){
		printf("L'equivalente nel formato 12 ore e': %d:%d AM\n", ora, minuti);
	}
	else{
		switch(ora){
			case 13: printf("L'equivalente nel formato 12 ore e': 1:%.2d PM\n", minuti);
					 break;
			case 14: printf("L'equivalente nel formato 12 ore e': 2:%.2d PM\n", minuti);
					 break;
			case 15: printf("L'equivalente nel formato 12 ore e': 3:%.2d PM\n", minuti);
					 break;
			case 16: printf("L'equivalente nel formato 12 ore e': 4:%.2d PM\n", minuti);
					 break;
			case 17: printf("L'equivalente nel formato 12 ore e': 5:%.2d PM\n", minuti);
					 break;
			case 18: printf("L'equivalente nel formato 12 ore e': 6:%.2d PM\n", minuti);
					 break;
			case 19: printf("L'equivalente nel formato 12 ore e': 7:%.2d PM\n", minuti);
					 break;
			case 20: printf("L'equivalente nel formato 12 ore e': 8:%.2d PM\n", minuti);
					 break;
			case 21: printf("L'equivalente nel formato 12 ore e': 9:%.2d PM\n", minuti);
					 break;
			case 22: printf("L'equivalente nel formato 12 ore e': 10:%.2d PM\n", minuti);
					 break;
			case 23: printf("L'equivalente nel formato 12 ore e': 11:%.2d PM\n", minuti);
					 break;
			case 24: printf("L'equivalente nel formato 12 ore e': 0:%.2d PM\n", minuti);
					 break;
		}
	}


	return 0;
}