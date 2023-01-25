#include<stdio.h>

int main(void){
	float val_azioni;
	float commissione;
	int num_azioni;
	float val_azione;

	
	printf("Inserisci il valore delle azioni: ");
	scanf("%f", &val_azioni);

	if(val_azioni < 2500){
		commissione = 30 + ((val_azioni * 1.7) / 100);
	}
	else if(val_azioni > 2500 && val_azioni < 6250){
		commissione = 56 + ((val_azioni * 0.66) / 100);
	}
	else if(val_azioni > 6250 && val_azioni < 20000){
		commissione = 76 + ((val_azioni * 0.34) / 100);		
	}
	else if(val_azioni > 20000 && val_azioni < 50000){
		commissione = 100 + ((val_azioni * 0.22) / 100);
	}		
	else if(val_azioni > 50000 && val_azioni < 500000){
		commissione = 155 + ((val_azioni * 0.11) / 100);
	}
	else if(val_azioni > 500000){
		commissione = 255 + ((val_azioni * 0.09) / 100);
	}

	printf("La commissione vale: %.2f$\n", commissione);

	return 0;
}	
