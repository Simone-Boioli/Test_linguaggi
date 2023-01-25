/**
*	Nome: 84_cap10_es7.c
*	Data: 15/11/2017	
*	Scopo:	Programma chiede all'utente di inserire un numero di max 10 cifre e lo stampa come un display
*	Autore:	Boioli Simone
*/

#include <stdio.h>

//COSTANTI
#define MAX_DIGITS 10

//PROTOTIPI
void clear_digit_array(void);

//VARIABILI ESTERNE
int segment_array[10][7]={{1,1,1,1,1,1,0},  //0          0
						  {0,1,1,0,0,0,0},  //1          _
						  {1,1,0,1,1,0,1},  //2.      5 |6| 1
						  {1,1,1,1,0,0,1},  //3.        |_|
						  {0,1,1,0,0,1,1},  //4.        | |
						  {1,0,1,1,0,1,1},  //5.      4 |_| 2
						  {1,0,1,1,1,1,1},  //6.         3
						  {1,1,1,0,0,0,0},  //7
						  {1,1,1,1,1,1,1},  //8
						  {1,1,1,0,1,1,1}}; //9
int digits[4][MAX_DIGITS * 4];

/*
*	Funzione main
*/
int main(void){
		
	clear_digit_array();


	return 0;
}

/*
*	Inizializza la matrice con tutti 0;
*/
void clear_digit_array(void){
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < (MAX_DIGITS * 4); j++){
			digits[i][j] = 0;
		}
	}

	for(int i = 0; i < 4; i++){
		for(int j = 0; j < (MAX_DIGITS * 4); j++){
			printf("%d ", digits[i][j]);
		}
		printf("\n");
	}
}