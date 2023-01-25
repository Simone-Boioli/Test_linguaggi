#include <stdbool.h> // solo C99  per avere i valori bool true e false

#include <stdio.h>
#include <stdlib.h> //libreria per il generatore random
#include <time.h>  //libreria per la funzione che codifica l'ora corrente

#define SEMI 4
#define CARTE 13

int main(void){
	int carte; //carte in mano
	int seme;  //Seme estratto a caso
	int valore;  //valore estratto a caso

	bool in_mano[SEMI][CARTE] = {false};  //matrice che rappresenta le carte uscite

	const char cod_valore[] = {'2', '3', '4', '5', '6', '7', '8', '9', 't', 'j', 'd', 'k', 'a'};  //valori carte (t=10)
	const char cod_semi[] = {'c','q','p','f'};  //valori semi
	
	srand((unsigned) time(NULL));
	
	printf("Inserisci il numero di carte in mano:");
	scanf("%d", &carte);
	
	printf("Le tue carte: ");
	while(carte > 0){
		seme = rand() % SEMI; //sceglie un seme a random
		valore = rand() %  CARTE;  //sceglie una carta a caso

		if(!in_mano[seme][valore]){
			in_mano[seme][valore] = true;
			carte --;
			printf(" %c%c", cod_valore[valore], cod_semi[seme]);
		}
	}	
	printf("\n");
	
	return 0;
}
