#include "poker.h"
#include <stdio.h>
#include <stdbool.h>
#include <time.h>
#include <stdlib.h>

#define NUM_CARTE 13
#define NUM_SEMI 4
#define CARTE_TOTALI 5
#define CARTE_GIOCATORE 2
#define CARTE_PC 2

//variabili globali
    int num_in_carte[NUM_CARTE];
    int num_in_semi[NUM_SEMI];

    const char cod_valore[] = {'2', '3', '4', '5', '6', '7', '8', '9', 't', 'j', 'q', 'k', 'a'}; //valori carte
    const char cod_semi[] = {'c', 'q', 'p', 'f'};  //valori semi

/******************************************************************
 *  main
 * ***************************************************************/
int main(void){
    estrai_carte_giocatore();
    
    return 0;
}


/*****************************************************************
 * estrai_carte_giocatore():   
 * **************************************************************/
void estrai_carte_giocatore(void){ 
	
	//inizializzazione array e matrice
    bool carta_esistente[NUM_CARTE][NUM_SEMI]; //carte già scese
    bool carta_sbagliata;
    char carta_ch;
    char seme_ch;
    int carta; // da 0 a 12
    int seme; // da 0 a 3
    int carte_lette = 0;


    //inizializzazione array e matrice
    for(carta = 0; carta < NUM_CARTE; carta++){
	num_in_carte[carta] = 0;  //mette a 0 tutto l'array
    
	for(seme = 0; seme < NUM_SEMI; seme++){
	    carta_esistente[carta][seme] = false;  //riempio la matrice di false
	}
    }
    for(seme = 0; seme < NUM_SEMI; seme++){
	num_in_semi[seme] = 0; //riempio l'array di semi
    }

    //estrazione carte
    srand((unsigned) time(NULL));

    seme = rand() % (NUM_SEMI-1);
    carta = rand() % (NUM_CARTE-1);

    printf("%d\n", seme);
    printf("%d\n", carta);
}
