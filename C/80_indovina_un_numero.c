/**
*	Nome: 80_indovina_un_numero.c
*	Data: 08/11/2017	
*	Scopo:	Programma che genera un numero casuale e l'utente lo deve indovinare
*	Autore:	Boioli Simone
*/

#include <stdio.h>

#define MAX_NUMBER 100

/* PROTOTIPI */
void inizializza_generatore_numeri(void);
void scegli_numero_segreto(void);
void legge_numeri(void);

/*VARIABILI ESTERNE*/
int numero_segreto;

int main (void){
	char comando;

	printf("IL PROGRAMMA ESTRARRA' UN NUMERO CASUALE TRA 1 E %d.\n\n", MAX_NUMBER);

	inizializza_generatore_numeri();


	do{
		scegli_numero_segreto();
		printf("Un numero è stato estratto. \n");
		legge_numeri();
		printf("Vuoi giocare ancora? (y/n)");
		scanf( " %c", &comando);

	}while(comando == 'y' || comando == 'Y');

	return 0;
}

/***********************************************************
* inizializza_generatore_numeri: inizializza il generatore *
* di numeri casuali usando l'ora corrente                  *
************************************************************/
void inizializza_generatore_numeri(void){
	srand((unsigned) time(NULL));
}


/***********************************************************
* scegli_numero_segreto: sceglie un numero casuale tra.    *
* 1 e 100 e lo salva nella variabile esterna               *
************************************************************/
void scegli_numero_segreto(void){
	numero_segreto = rand() % MAX_NUMBER + 1;
}



/***********************************************************
* legge_numeri: legge i tentativi fatti dall'utente e lo   *
* avvisa se questi sono maggiori o minori del numero.      *
* segreto. Quando l'utente lo trova, il programmi dice.    *
* il numero di tentativi fatti                             *
************************************************************/
void legge_numeri(void){
	int indovina = 0;
	int tentativi = 0;

	for(;;){
		tentativi++;
		printf("Inserisci un numero: ");
		scanf("%d", &indovina);

		if(indovina == numero_segreto){
			printf("HAI INDOVINATO in %d tentativi! \n\n", tentativi);
			return;
		}else if(indovina < numero_segreto){
			printf("Troppo basso; Riprova\n");
		}else{
			printf("Troppo alto; Riprova\n");
		}
	}




}