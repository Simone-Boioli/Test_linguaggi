/*
*	Nome: 86_cap11_es1.c
*	Scopo: chiede all'utente una cifra in euro e restituisce come pagarlo utilizzando il minor n. di banconote da 500,200,100,50,20,10,5
*	Data: 29/11/2017
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


//PROTOTIPO
void pagamento(int imp, int *p_cinquecento, int *p_duecento, int *p_cento, int *p_cinquanta, int *p_venti, int *p_dieci, int *p_cinque, int *p_due, int *p_uno);

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

	pagamento(importo, &b_cinquecento, &b_duecento, &b_cento, &b_cinquanta, &b_venti, &b_dieci, &b_cinque, &m_due, &m_uno);

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

void pagamento(int imp, int *p_cinquecento, int *p_duecento, int *p_cento, int *p_cinquanta, int *p_venti, int *p_dieci, int *p_cinque, int *p_due, int *p_uno){
	*p_cinquecento = (imp / CINQUECENTO);
	imp = imp - (*p_cinquecento * CINQUECENTO);

	*p_duecento = (imp / DUECENTO);
	imp = imp - (*p_duecento * DUECENTO);

	*p_cento = (imp / CENTO);
	imp = imp - (*p_cento * CENTO);

	*p_cinquanta = (imp / CINQUANTA);
	imp = imp - (*p_cinquanta * CINQUANTA);

	*p_venti = (imp / VENTI);
	imp = imp - (*p_venti * VENTI);

	*p_dieci = (imp / DIECI);
	imp = imp - (*p_dieci * DIECI);

	*p_cinque = (imp / CINQUE);
	imp = imp - (*p_cinque * CINQUE);

	*p_due = (imp / DUE);
	imp = imp - (*p_due * DUE);

	*p_uno = (imp / UNO);
	imp = imp - (*p_uno * UNO);
}