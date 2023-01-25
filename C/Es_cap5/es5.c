#include<stdio.h>

int main(void){
	float reddito;
	float imposta;

	printf("Inserisci il reddito: ");
	scanf("%f", &reddito);

	if(reddito < 750){
		imposta = reddito + (reddito/100);	
		printf("L'imposta e': %.2f$\n", imposta); 		
	}else if(reddito >= 750 && reddito < 2250){
		imposta = 7.50 + reddito + ((reddito * 2)/100);
		printf("L'imposta e': %.2f$\n", imposta);
	}else if(reddito >= 2250 && reddito < 3750){
		imposta = 37.50 + reddito + ((reddito * 3)/100);
		printf("L'imposta e': %.2f$\n", imposta);
	}else if(reddito >= 3750 && reddito < 5250){
		imposta = 82.50 + reddito + ((reddito * 4)/100);
		printf("L'imposta e': %.2f$\n", imposta);
	}else if(reddito >= 5250 && reddito < 7000){
		imposta = 124.50 + reddito + ((reddito * 5)/100);
		printf("L'imposta e': %.2f$\n", imposta);
	}else if(reddito >= 7000){
		imposta = 230 + reddito + ((reddito * 6)/100);
		printf("L'imposta e': %.2f$\n", imposta);
	}

	return 0; 
}
