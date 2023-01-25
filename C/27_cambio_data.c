/**
*	Nome: 27_cambio_data.c
*	Data: 03/22/2017	
*	Scopo:	Programma che trasforma una data da gg/mm/aaaa nel formato legale
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main (void){

	int giorno = 0; //giorno
	int mese = 0; //mese
	int anno = 0; //anno

	printf("Inserisci la data nel formato gg/mm/aaa: ");
	scanf("%d/%d/%d", &giorno, &mese, &anno);

	printf("Oggi è il %d", giorno);

	switch(mese){
		case 1: printf(" Gennaio ");
				break;
		case 2: printf(" Febbraio ");
				break;
		case 3: printf(" Marzo ");
				break;
		case 4: printf(" Aprile ");
				break;
		case 5: printf(" Maggio ");
				break;
		case 6: printf(" Giugno ");
				break;
		case 7: printf(" Luglio ");
				break;
		case 8: printf(" Agosto ");
				break;
		case 9: printf(" Settembre ");
				break;
		case 10: printf(" Ottobre ");
				break;
		case 11: printf(" Novembre ");
				break;
		case 12: printf(" Dicembre ");
				break; 
	}

	printf("%d.\n", anno);

	return 0;
}
