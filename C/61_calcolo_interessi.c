/**
*	Nome: 61_Calcolo_interessi.c
*	Data: 13/09/2017	
*	Scopo:	il programma stampa una tabella che mostra un investimento di 100 dollari su un certo periodo di anni con diversi tassi di interesse
*	Autore:	Boioli Simone
*/

#include <stdio.h>


#define NUM_RATE ((int) (sizeof(value) / sizeof(value[0]))) //grandezza array
#define BILANCIO_INIZIALE 100.00

int main(void){

	int i; //indice cicli
	int tasso;
	int num_anni;
	int anni;

	double value[5];

	printf("Inserisci il tasso di interesse: ");
	scanf("%d", &tasso);

	printf("Inserisci il numero di anni: ");
	scanf("%d", &num_anni);

	//stampa della tabella
	printf("\nAnni");
	for(i = 0; i < NUM_RATE; i++){
		printf("%6d%%", tasso + i);
		value[i] = BILANCIO_INIZIALE; //inzializzo l'array con il bilancio iniziale
	}

	printf("\n");

	for(anni = 1; anni <= num_anni; anni++){
		printf("%3d  ", anni);

		for(i = 0; i < NUM_RATE; i++){
			value[i] = value[i] + (((tasso + i) / 100.00) * value[i]);
			printf("%7.2f", value[i]);
		}

		printf("\n");
	}


	return 0;
}