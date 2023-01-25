/**
*	Nome: 62_mano_di_carte.c
*	Data: 13/09/2017	
*	Scopo:	il programma stampa una mano di carte distribuite da un mazzo standard
*	Autore:	Boioli Simone
*/

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>

#define NUM_SEMI 4
#define NUM_CARTE 13

int main(void){

	const char codici_carte[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 't', 'j', 'q', 'k'};  //t = 10, j = jack - q = regina - k = re
	const char codici_semi[] = {'C', 'Q', 'P', 'F'}; //C = cuori, Q = quadri, P=Picche, F = fiori

	bool in_mano[NUM_SEMI][NUM_CARTE] = {false}; //matrice di tutte le carte
	int num_carte; //numero di carte in mano inserito dall'utente
	int seme = 0; //valore del seme
	int carta = 0;  //valore della carta

	/*   srand: inzializza il generatore random 
	*    time: restituisce l'ora corrente codificata come singolo numero 
	*/
	srand ((unsigned) time(NULL));  //garantisce di non consegnare le stesse carte durante il programma

	printf("Inserisci il numero di carte in mano: ");
	scanf("%d", &num_carte);

	printf("La tua mano: ");
	while (num_carte > 0){
		seme = rand() % NUM_SEMI;  //sceglie un seme random  (% permette di scalare il numero in questo caso tra 0 e 3)
		carta = rand() % NUM_CARTE;  //sceglie una carta a random  (% permette di scalare il numero in questo caso tra 0 e 12) 

		if(in_mano[seme][carta] == false){
			in_mano[seme][carta] = true;
			num_carte --;
			printf(" %c%c", codici_carte[carta], codici_semi[seme]);
		}
	}

	printf("\n");
	
	return 0;
}