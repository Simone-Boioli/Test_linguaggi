#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define MAX_NUMERO 100

//variabili esterne
int numero_segreto;

//prototipi
void generatore_numeri(void);
void scegli_numero_segreto(void);
void indovina(void);


/**************************************************************************************
 *	main                                                                          *
 *                                                                                    *
 **************************************************************************************/
int main(void){
    char comando;
   
    printf("\nIndovina il numero tra 1 e %d\n\n", MAX_NUMERO);

    generatore_numeri();

    do{
	scegli_numero_segreto();
	printf("Un numero è stato scelto.\n");
		
	indovina();

	printf("Giocare ancora? (y/n) ");
	scanf(" %c", & comando);

	printf("\n");
    }while(comando == 'y' || comando == 'Y');
	

    return 0;
}


/**************************************************************************************
 *	generatore_numeri: inizializza il generatore dei numeri casuali               *
 *                         usando l'ora corrente                                      *
 **************************************************************************************/

void generatore_numeri(){
    srand((unsigned) time(NULL));  //cambio il 'seme' del generatore casuale, prendendo
	                           //la codifica dell'ora corrente (time)
}





/**************************************************************************************
 *	scegli_numero_segreto: sceglie un numero segreto tra 1 e max                  *
 *                             e lo salva in numero_segreto                           *
 **************************************************************************************/

void scegli_numero_segreto(){
    numero_segreto = rand() % MAX_NUMERO + 1;
}




/**************************************************************************************
 *	indovina: legge ripetutamente i tentativi dell'utente, e lo avvisa se         *
 *                questi sono maggiori, minori o uguali al numero segreto.            *
 *                Quando l'utente indovina, viene stampato il numero tot di tentaivi  *
 **************************************************************************************/

void indovina(){
    int num;
    int tentativi = 0;  //numeri tentativi

    while(1){
	tentativi++;
	printf("\nInserisci numero: ");
	scanf("%d", &num);

	if(num == numero_segreto){
	    printf("Complimenti hai indovinato con %d tentativi\n", tentativi);
	    return;
	}else if(num < numero_segreto){
	    printf("Troppo basso. Riprova.");
	}else{
	    printf("Troppo alto. Riprova.");
	}
    }
}
