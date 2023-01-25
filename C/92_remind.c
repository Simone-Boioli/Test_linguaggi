/*
*	Nome: 92_remind.c
*	Data: 27/06/2018
*	Scopo: Programma che crea una lista di promemoria e li stampa
*	Autore: Simone Boioli
*/

#include <stdio.h>
#include <string.h>


#define MAX_PROM 50 //numero massimo di promemoria
#define MSG_LEN 60 //lunghezza massima mex

/***************
*   PROTOTIPI  *
****************/
int read_line(char str[], int n);


/*******************
*   Funzione main  *
********************/
int main(void){

	char promemoria[MAX_PROM][MSG_LEN+3];  //matrice che conterrà per ogni riga un promemoria
	char day_str[3]; // array che contiene il giorno in formato stringa
	char msg_str[MSG_LEN+1]; //
	int day;  //variabile che contiene il giorno
	int i = 0; //indice
	int j = 0; //indice
	int num_prom = 0;

	for(;;){
		if(num_prom == MAX_PROM){
			printf("ERRORE: Non c'è più spazio\n");
			break;			
		}

		printf("Inserisci il giorno e il promemoria: \n"); 
		scanf("%2d", &day);

		//controllo sull'uscita
		if(day == 0){
			break;
		}

		sprintf(day_str, "%2d", day);  //simile a printf ma stampa l'output in stringa

		read_line(msg_str, MSG_LEN);

		for(i = 0; i < num_prom; i++){
			if(strcmp(day_str, promemoria[i]) < 0){
				break;
			}
		}

		for(j = num_prom; j > i; j--){
			strcpy(promemoria[j], promemoria[j-1]);
		}

		strcpy(promemoria[i], day_str);
		strcat(promemoria[i], msg_str);

		num_prom++;

	}

	printf("\n PROMEMORIA \n");
	for(i = 0; i < num_prom; i++){
		printf("%s\n", promemoria[i]);
	}

	return 0;
}

/***************************************
*   Funziona per leggere i promemoria  *
****************************************/
int read_line(char str[], int n){
	int ch = 0;
	int i = 0;

	while((ch = getchar() != '\n')){
		if(i < n){
			str[i++] = ch;
		}
	}
	str[i] = '\0';
	return i; 
}
