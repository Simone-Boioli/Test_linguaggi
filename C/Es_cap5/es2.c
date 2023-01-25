#include<stdio.h>

int main(void){
	int ora;
	int minuti;

	printf("Inserisci un'ora nel formato a 24ore (hh:mm): ");
	scanf("%d:%d", &ora, &minuti);

	if(ora <= 12){
		printf("L'ora in formato 12ore e': %d:%.2d AM\n", ora, minuti);
	}else{
		switch(ora){
			case 13: 
				printf("L'ora in formato 12 ore e': 1:%.2d PM\n", minuti);
				break;
			case 14: 
				printf("L'ora in formato 12 ore e': 2:%.2d PM\n", minuti);
				break;
			case 15: 
				printf("L'ora in formato 12 ore e': 3:%.2d PM\n", minuti);
				break;
			case 16: 
				printf("L'ora in formato 12 ore e': 4:%.2d PM\n", minuti);
				break;
			case 17: 
				printf("L'ora in formato 12 ore e': 5:%.2d PM\n", minuti);
				break;
			case 18: 
				printf("L'ora in formato 12 ore e': 6:%.2d PM\n", minuti);
				break;
			case 19: 
				printf("L'ora in formato 12 ore e': 7:%.2d PM\n", minuti);
				break;
			case 20: 
				printf("L'ora in formato 12 ore e': 8:%.2d PM\n", minuti);
				break;
			case 21: 
				printf("L'ora in formato 12 ore e': 9:%.2d PM\n", minuti);
				break;
			case 22: 
				printf("L'ora in formato 12 ore e': 10:%.2d PM\n", minuti);
				break;
			case 23: 
				printf("L'ora in formato 12 ore e': 11:%.2d PM\n", minuti);
				break;
			case 24: 
				printf("L'ora in formato 12 ore e': 00:%.2d PM\n", minuti);
				break;
		}
	}
	
	return 0;
}
