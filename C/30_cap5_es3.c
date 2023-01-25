/**
*	Nome: 30_cap5_es3.c
*	Data: 03/22/2017	
*	Scopo:	modifica programma 26_commissioni_broker.c
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	float transazione = 0.0f;
	float commissioni = 0.0f;
	float prezzo_azione = 0.00f;
	int num_azioni = 0;

	printf("Inserisci il numero di Azioni: ");
	scanf("%d", &num_azioni);

	printf("Inserisci il prezzo dell'azione: ");
	scanf("%f", &prezzo_azione);

	transazione = num_azioni * prezzo_azione;

	printf("Il totale della transazione è: %.2f\n", transazione);


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

	printf("Commissioni: €%.2f\n", commissioni);

	return 0;
}