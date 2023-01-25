/**
*	Nome: 50_cap6_es8.c
*	Data: 04/23/2017	
*	Scopo:	Programma che stampa il calendario di un mese
*	Autore:	Boioli Simone
*/


#include <stdio.h>

int main(void){

	int tot_giorni = 0;  //giorni totali del mese
	int inizio = 0;
	int giorno = 0; // varibile per ritonare a capo

	printf("Inserisci il numero dei giorni del mese: ");
	scanf("%d", &tot_giorni);

	printf("Inserisci il giorno dell'inzio del mese (Lun=1,.., Dom=7): ");
	scanf("%d", &inizio);

	switch(inizio){
		case 1: giorno = 1;	
				break;

		case 2:	giorno = 2;
				printf("\t");
				break;

		case 3: giorno = 3;
				printf("\t\t");
				break;

		case 4: giorno = 4;	
				printf("\t\t\t");
				break;
		
		case 5: giorno = 5;
				printf("\t\t\t\t");
				break;

		case 6: giorno = 6;
				printf("\t\t\t\t\t");
				break;

		case 7: giorno = 7;
				printf("\t\t\t\t\t\t");
				break;
	}

	for(int i = 1; i <= tot_giorni; i++){
		//stampo il giorno
		printf("%d\t", i);

		//stampa a capo ogni 7 giorni
		if(giorno == 7){
			printf("\n");
			giorno = 0;	
		}

		giorno++;
	}

	printf("\n");

	return 0;
}