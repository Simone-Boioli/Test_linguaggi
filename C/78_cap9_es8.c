/**
*	Nome: 78_cap9_es8.c
*	Data: 05/11/2017	
*	Scopo:	Programma che simula il gioco claps
*	Autore:	Boioli Simone
*/

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>

#define FACCE 6 // fecce di un dado


//dichiarazioni
int roll_dice(void);
bool play_game(void);
bool gioca_ancora(void);


int main(void){

	int vittorie = 0; //numero vittorie
	int sconfitte = 0; //numero sconfitte
	char gioca; //valore di uscita 
	bool partita; //true = vinta / false = persa
	

	do{
		partita = play_game();		

		if(partita == true){
			vittorie++;
			printf("HAI VINTO!\n");

		}else{
			sconfitte++;
			printf("HAI PERSO\n");
		}

		printf("Vuoi Rigiocare? ");
		scanf(" %c", &gioca);

	}while(gioca == 'y' || gioca == 'Y');

	printf("Vittorie: %d - Sconfitte: %d\n", vittorie, sconfitte);

	return 0;
}




//funzione che genera i numeri casuali e la somma di essi
int roll_dice(void){
	int num1 = 0; //primo numero casuale
	int num2 = 0; //secondo numero casuale
	int somma = 0; //somma dei 2 numeri casuali

	//srand((unsigned) time(NULL));

	num1 = (rand() % FACCE) + 1;
	num2 = (rand() % FACCE) + 1;

	somma = num1 + num2;

	return somma;
}


//funzione di gioco
bool play_game(void){
	int somma = 0; //somma dei 2 dadi
	int punto = 0; //
	int lanci = 0; //numero lanci
	bool vinto = false;

	do{
		somma = roll_dice();
		lanci++;
		printf("La somma è: %d\n", somma);


		//controllo se ha vinto/perso al primo lancio
		if(lanci == 1 && (somma == 7 || somma == 11)){
			return true; //VINTO
		}

		if(lanci == 1 && (somma == 2 || somma == 3 || somma == 12)){
			return false; //PERSO
		}	


		//non ha vinto al primo lancio
		if(punto == 0){
			punto = somma; 
			printf("Il punto è: %d\n", somma);
		}else{
			//controllo se la somma uscita è uguale a punto
			if(somma == punto){
				vinto = true;
				return true;
			}
		}
	}while(vinto == false);
}