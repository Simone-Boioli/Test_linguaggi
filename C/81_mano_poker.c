/**
*	Nome: 81_mano_poker.c
*	Data: 08/11/2017	
*	Scopo:	Programma che classifica una mano del poker
*	Autore:	Boioli Simone
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define NUM_RANKS 13 //carte
#define NUM_SUITS 4 //semi
#define NUM_CARDS 5 //carte nella mano

/*VARIABILI ESTERNE*/
int num_in_rank[NUM_RANKS]; //array delle carte
int num_in_suit[NUM_SUITS]; //array dei semi
bool scala, colore, poker, tris; //classifiche mani
int coppia; //può essere 0 (carta alta), 1(coppia), 2(doppia coppia)

/*PROTOTIPI*/
void read_cards(void);
void analyze_hand(void);
void print_result(void);


/***********************************************************
* main: Chiama ripetutamente read_cards, analyze_hand,     *
* print_result                                             *
************************************************************/
int main(void){

	for(;;){
		read_cards();
		analyze_hand();
		print_result();
	}

	return 0;
}


/***********************************************************
*read_cards: salva le carte lette nella variabili esterne  *
* esegue il controllo per le carte errate                  *
************************************************************/
void read_cards(void){
	bool card_exists[NUM_RANKS][NUM_SUITS]; //matrice delle carte uscite
	char ch, rank_ch, suit_ch; //valori delle carte
	int rank, suit;
	bool bad_card;  //true=errore carta inserita
	int card_read = 0; //contatore delle carte lette

	//inizializzazione array e matrice
	for(rank = 0; rank < NUM_RANKS; rank++){
		num_in_rank[rank] = 0;
		for(suit = 0; suit < NUM_SUITS; suit++){
			card_exists[rank][suit] = false;
		}
	}
	for(suit = 0; suit < NUM_SUITS; suit++){
		num_in_suit[suit] = 0;
	}

	//inserimento da parte dell'utente dei valori
	while(card_read < NUM_CARDS){
		bad_card = false; //inizializzo la variabile

		printf("Inserisci una carta: ");
		rank_ch = getchar();

		switch(rank_ch){
			case '0':       exit(EXIT_SUCCESS);
			case '2':		rank = 0;
							break;
			case '3':		rank = 1;
							break;
			case '4':		rank = 2;
							break;
			case '5':		rank = 3;
							break;
			case '6':		rank = 4;
							break;
			case '7':		rank = 5;
							break;
			case '8':		rank = 6;
							break;
			case '9':		rank = 7;
							break;
			case 't':	case 'T':	rank = 8;
							break;
			case 'j':	case 'J':	rank = 9;
							break;
			case 'q':	case 'Q':	rank = 10;
							break;
			case 'k':	case 'K':	rank = 11;
							break;
			case 'a':	case 'A':	rank = 12;
							break;
			default:        bad_card = true;
		}

		suit_ch = getchar();

		switch(suit_ch){
			case 'q': case 'Q': 	suit = 0; //quadri
					break;
			case 'c': case 'C': 	suit = 1; //cuori
					break;
			case 'p': case 'P': 	suit = 0; //picche
					break;
			case 'f': case 'F': 	suit = 0; //fiori
					break;	
			default: bad_card = true;
		}

		while((ch = getchar() != '\n')){
			if(ch != ' '){
				bad_card = true;
			}
		}

		if(bad_card){
			printf("Carta sbagliata, ignorata\n");
		}else if(card_exists[rank][suit]){
			printf("Carta duplicata, ignorata\n");
		}else{
			num_in_rank[rank]++;
			num_in_suit[suit]++;
			card_exists[rank][suit] = true;
			card_read++;
		}
	}

}



/***********************************************************
* analyze_hand: Determina e classifica la mano di poker e  *
* salva le informazioni nelle variabili esterne            *
************************************************************/

void analyze_hand(void){
	int num_consec = 0;
	int rank, suit;
	//inizializzo le scale
	scala = false;
	colore = false;
	poker = false;
	tris = false;
	coppia = 0;

	/*controllo se è un colore*/
	for(suit = 0; suit < NUM_SUITS; suit++){
		if(num_in_suit[suit] == NUM_CARDS)
			colore = true;
	}

	//controllo se è una scala
	rank = 0; 
	while(num_in_rank[rank] == 0) rank++;
	for(;rank < NUM_RANKS && num_in_rank[rank] > 0; rank++){
		num_consec++;
	}
	if (num_consec == NUM_CARDS){
		scala = true;
		return;
	}

	//controlla poker, tris, coppia
	for(rank = 0; rank < NUM_RANKS; rank++){
		if(num_in_rank[rank] == 4) poker = true;
		if(num_in_rank[rank] == 3) tris = true;
		if(num_in_rank[rank] == 2) coppia++;
	}
}


/***********************************************************
* print_result: notifica all'utente il risultato usando    *
* le variabili esterne                                     *
************************************************************/
void print_result(void){
	if(scala && colore) printf ("Scala Colore");
	else if(poker) printf("Poker");
	else if(tris && coppia == 1) printf("Full");
	else if(colore) printf("Colore");
	else if(scala) printf("Scala");
	else if(tris) printf ("Tris");
	else if(coppia == 2) printf("Doppia Coppia");
	else if(coppia == 1) printf("Coppia");
	else printf("Carta Alta");

	printf("\n\n");

}

