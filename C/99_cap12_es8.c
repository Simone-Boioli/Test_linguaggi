/**
*	Nome: 99_cap12_es8.c
*	Data: 06/07/2018	
*	Scopo:	Programma che calcola il valore di una parola nel gioco dello scarabeo
*	Autore:	Boioli Simone
*/

#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define MAX_LETTERE 20

int calcola_punteggio(const char *parola);

int main (void){

	char *parola[MAX_LETTERE];
	int somma = 0;

	printf("Inserisci la parola: ");
	scanf("%s", parola);

	somma = calcola_punteggio(parola);

	printf("La parola vale: %d\n", somma);

	return 0;
	
}

int calcola_punteggio(const char *parola){
	int somma = 0;
    char ch;


    for(int i = 0; parola[i] != '\0'; i++){
    	ch = parola[i];
		
		if(toupper(ch) == 'A' | toupper(ch) == 'E' |
		   toupper(ch) == 'I' | toupper(ch) == 'L' |
		   toupper(ch) == 'N' | toupper(ch) == 'O' |
		   toupper(ch) == 'R' | toupper(ch) == 'S' |
		   toupper(ch) == 'T' | toupper(ch) == 'U'){

			somma = somma + 1;
		}else

		if(toupper(ch) == 'D' | toupper(ch) == 'G'){
			somma = somma + 2;
		}else

		if(toupper(ch) == 'B' | toupper(ch) == 'C' | toupper(ch) == 'M' | toupper(ch) == 'P'){
			somma = somma + 3;
		}else

		if(toupper(ch) == 'F' | toupper(ch) == 'H' | toupper(ch) == 'V' | toupper(ch) == 'W' | toupper(ch) == 'Y'){
			somma = somma + 4;
		}else

		if(toupper(ch) == 'K'){
			somma = somma + 5;
		}else

		if(toupper(ch) == 'J' | toupper(ch) == 'X'){
			somma = somma + 8;
		}else

		if(toupper(ch) == 'Q' | toupper(ch) == 'Z'){
			somma = somma + 10;
		}    	

    }

    return somma;
}