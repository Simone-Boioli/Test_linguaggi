/*
*	Nome: 11_cap2_es7.c
*	Scopo: chiede all'utente una cifra in euro e restituisce come pagarlo utilizzando il minor n. di banconote da 500,200,100,50,20,10,5
*	Data: 01/01/2017
*	Autore: Boioli Simone
*/

#include <stdio.h>

//costanti banconote
#define CINQUECENTO 500
#define DUECENTO 200
#define CENTO 100
#define CINQUANTA 50
#define VENTI 20
#define DIECI 10
#define CINQUE 5

//costanti monete
#define DUE 2
#define UNO 1

int main (void){

	int importo = 0; //valore inserito dall'utente

	//totali banconote
	int b_cinquecento = 0;
	int b_duecento = 0;
	int b_cento = 0;
	int b_cinquanta = 0;
	int b_venti = 0;
	int b_dieci = 0;
	int b_cinque = 0;

	//totali monete
	int m_due = 0;
	int m_uno = 0;

	printf("Inserisci un importo in euro: ");
	scanf("%d", &importo);

	b_cinquecento = (importo / CINQUECENTO);
	importo = importo - (b_cinquecento * CINQUECENTO);

	b_duecento = (importo / DUECENTO);
	importo = importo - (b_duecento * DUECENTO);

	b_cento = (importo / CENTO);
	importo = importo - (b_cento * CENTO);

	b_cinquanta = (importo / CINQUANTA);
	importo = importo - (b_cinquanta * CINQUANTA);

	b_venti = (importo / VENTI);
	importo = importo - (b_venti * VENTI);

	b_dieci = (importo / DIECI);
	importo = importo - (b_dieci * DIECI);

	b_cinque = (importo / CINQUE);
	importo = importo - (b_cinque * CINQUE);

	m_due = (importo / DUE);
	importo = importo - (m_due * DUE);

	m_uno = (importo / UNO);
	importo = importo - (m_uno * UNO);

	printf("Baconote da 500: %d\n", b_cinquecento);
	printf("Baconote da 200: %d\n", b_duecento);
	printf("Baconote da 100: %d\n", b_cento);
	printf("Baconote da 50: %d\n", b_cinquanta);
	printf("Baconote da 20: %d\n", b_venti);
	printf("Baconote da 10: %d\n", b_dieci);
	printf("Baconote da 5: %d\n", b_cinque);
	printf("Monete da 2: %d\n", m_due);
	printf("Monete da 1: %d\n", m_uno);

	return 0;
}