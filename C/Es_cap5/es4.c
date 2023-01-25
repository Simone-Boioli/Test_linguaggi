#include<stdio.h>

int main(void){
	int vento;

	printf("Inserisci la velocita' del vento: ");
	scanf("%d", &vento);

	if(vento < 1){
		printf("Descrizione: CALMO.\n");
	}else if(vento <= 3){
		printf("Descrizione: BAVA DI VENTO. \n");
	}else if(vento <= 27){
		printf("Descrizione: BREZZA. \n");
	}else if(vento <= 48){
		printf("Descrizione: BURRASCA.\n");
	}else if(vento <= 63){
		printf("Descrizione: TEMPESTA.\n");
	}else{
		printf("Descrizione: URAGANO.\n");
	}

	return 0;
}
