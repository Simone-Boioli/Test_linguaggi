/******************************************************************
 *	Programma che classifica una mano di poker	
 *	ovvero prende una mano di 5 carte e le classifica in una
 *	delle categorie:
 *	-scala colore
 *	-poker
 *	-full
 *	-colore
 *	-scala
 *	-tris
 *	-doppia coppia
 *	-coppia
 *	-carta alta
 *
 *	useremo i valori: 2 3 4 5 6 7 8 9 t j q k a
 *	        e i semi: c(cuori) q(quadri) p(picche) f(fiori)
 *
 ******************************************************************/

#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

#define NUM_CARTE 13
#define NUM_SEMI 4
#define CARTE 5

/* variabili esterne */
int num_in_carte[NUM_CARTE]; //vettore contenente le 13 carte
int num_in_semi[NUM_SEMI]; //vettore contenente i 4 semi
bool scala;
bool colore;
bool poker;
bool tris;
int coppia; //può essere 0 1 o 2

/* prototipi */
void leggi_carte(void);
void analizza_mano(void);
void stampa_risultato(void);

/******************************************************************
 *  main: chiama in un ciclo infinito i 3 metodi                  *
 ******************************************************************/
int main(void){
    while(true){
	leggi_carte();
	analizza_mano();
	stampa_risultato();
    }

    return 0;
}

/******************************************************************
 * leggi_carte(): salva le carte lette in variabili esterne,      *
 *                esegue il controllo per le carte errate e       *
 *                duplicate                                       *
 ******************************************************************/
void leggi_carte(void){
    bool carta_esistente[NUM_CARTE][NUM_SEMI]; // matrice per capire se le carte inserite sono duplicate
    bool carta_sbagliata;
    char ch;
    char carta_ch;
    char seme_ch;
    int carta; //da 0 a 12
    int seme; // da 0 a 3
    int carte_lette = 0;

    for(carta = 0; carta < NUM_CARTE; carta++){
	num_in_carte[carta] = 0; //riempio l'array con 0

	for(seme = 0; seme < NUM_SEMI; seme++){
	    carta_esistente[carta][seme] = false;  //riempio la matrice di false
	}
    }

    for(seme = 0; seme < NUM_SEMI; seme++){
	num_in_semi[seme] = 0; //riempio l'array con 0
    }

    while(carte_lette < CARTE){
	carta_sbagliata = false;

	printf("Inserisci una carta: ");
	carta_ch = getchar(); //prendo il primo carattere della carta inserita
	
	/*salvo nella variabile carta il numero di carta inserito*/
	switch(carta_ch){
	    case '0': exit(EXIT_SUCCESS); //esce dal programma se inserisco 0
	    case '2':           carta = 0; break; 	      
	    case '3':           carta = 1; break; 	      
	    case '4':           carta = 2; break; 	      
	    case '5':           carta = 3; break; 	      
	    case '6':           carta = 4; break; 	      
	    case '7':           carta = 5; break; 	      
	    case '8':           carta = 6; break; 	      
	    case '9':           carta = 7; break; 	      
	    case 't': case 'T': carta = 8; break; 	      
	    case 'j': case 'J': carta = 9; break; 	      
	    case 'q': case 'Q': carta = 10; break; 	      
	    case 'k': case 'K': carta = 11; break; 	      
	    case 'a': case 'A': carta = 12; break; 
	    default: carta_sbagliata = true;		    
	}

	seme_ch = getchar(); //prendo il secondo carattere(seme)

	/*salvo nella variabile seme il seme della carta inserita*/
	switch(seme_ch){
	    case 'c': case 'C': seme = 0; break; 
	    case 'q': case 'Q': seme = 1; break; 
	    case 'p': case 'P': seme = 2; break; 
	    case 'f': case 'F': seme = 3; break;
	    default: carta_sbagliata = true;	
	}

	while((ch = getchar()) != '\n'){
	    if(ch != ' '){
		carta_sbagliata = true;
	    }
	}

	/*controllo sulla carta inserita*/
	if(carta_sbagliata == true){
	    printf("La carta Inserita è sbagliata! IGNORATA!!!\n");
	}else if(carta_esistente[carta][seme] == true){
	    printf("Carta già inserita! IGNORATA!!!\n");
	}else{
	    num_in_carte[carta]++;
	    num_in_semi[seme]++;
	    carta_esistente[carta][seme] = true;
	    carte_lette++;
	}
    }

}



/******************************************************************
 * analizza_mano(): determina e classifica la mano, e salva il    *
 *                  risultato in variabili esterne.               *
 *****************************************************************/
void analizza_mano(void){
    int num_consecutivi = 0;
    int carta;
    int seme;
    scala = false;
    colore = false;
    poker = false;
    tris = false;
    coppia = 0;

    /* controllo del colore */
    for(seme = 0; seme < NUM_SEMI; seme++){
	if(num_in_semi[seme] == CARTE){  //se l'array dei semi nella posizione di un seme è uguale a 5 allora è colore
	    colore = true;
	}
    }

    /* controllo della scala */
    carta = 0;

    
    while(num_in_carte[carta] == 0){  //ciclo finchè non trovo la prima carta 
	carta++;
    }

    for(;carta < NUM_CARTE && num_in_carte[carta] > 0; carta++){
	num_consecutivi++;
    }
    if(num_consecutivi == CARTE){
	scala = true;
	return;
    }

    /* controllo del poker, tris e coppia */

    for(carta = 0; carta < NUM_CARTE; carta++){
	if(num_in_carte[carta] == 4)
	    poker = true;

	if(num_in_carte[carta] == 3)
	    tris = true;

	if(num_in_carte[carta] == 2)
	    coppia++;	
    }
}



/*****************************************************************
 * stampa_risultato(): notifica il risultato usando le variabili *
 *                     esterne.                                  *
 *****************************************************************/
void stampa_risultato(void){
    if(scala == true && colore== true){
	    printf("SCALA COLORE\n");
    }else if(poker == true){
	    printf("POKER\n");
    }else if(tris == true && coppia == 1){
	    printf("FULL\n");
    }else if(colore == true){
	    printf("COLORE\n");
    }else if(scala == true){
	    printf("SCALA\n");
    }else if(tris == true){
	    printf("TRIS\n");
    }else if(coppia == 2){
	    printf("DOPPIA COPPIA");
    }else if(coppia == 1){
	    printf("COPPIA");
    }else{
	    printf("CARTA ALTA");
    }

    printf("\n\n");

    
}
