/**
*	Nome: 56_cap7_es5.c
*	Data: 06/23/2017	
*	Scopo:	Programma che calcola il valore di una parola nel gioco dello scarabeo
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main (void){

	char ch;
	int somma = 0; //somma delle lettere

	printf("Inserisci la parola: ");


	do{
		ch = getchar();

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


	}while(ch != '\n');

	printf("La parola vale: %d\n", somma);

	return 0;
}