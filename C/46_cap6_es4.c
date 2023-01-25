/**
*	Nome: 46_cap6_es4.c
*	Data: 04/22/2017	
*	Scopo:	Programma che calcola la commissione del broker
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	float transazione = 0.0f;
	float commissioni = 0.0f;
	int uscita = -1;

	while(1){
		printf("Inserisci il valore della transazione: (0 per terminare)");
		scanf("%f", &transazione);

		if(transazione != 0){
			if(transazione < 2500.00f){
				commissioni = 30.00f + (0.017f * transazione);
			}
			else if(transazione < 6250.00f){
				commissioni = 56.00f + (0.0066f * transazione);
			}
			else if(transazione < 20000.00f){
				commissioni = 76.00f + (0.0034f * transazione);
			}
			else if(transazione < 50000.00f){
				commissioni = 100.00f + (0.0022f * transazione);
			}
			else if(transazione < 500000.00f){
				commissioni = 155.00f + (0.0011f * transazione);
			}
			else {
				commissioni = 255.00f + (0.0009f * transazione);
			}

			printf("Commissioni: €%.2f\n\n", commissioni);
		}else{
			break;
		}
	}	

	return 0;
}