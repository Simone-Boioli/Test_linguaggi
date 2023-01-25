/**
*	Nome: 55_cap7_es4.c
*	Data: 06/23/2017	
*	Scopo:	Programma che traduce il numero telefonico alfabetico in numerico
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main (void){

	char ch;

	printf("Inserisci il numero di telefono alfabetico (MAIUSCOLO): ");

do{
	ch = getchar();

	if(ch == 'A' | ch == 'B' | ch == 'C'){
			printf("2");
	}else if(ch == 'D' | ch == 'E' | ch == 'F'){
			printf("3");
	}else if(ch == 'G' | ch == 'H' | ch == 'I'){
			printf("4");
	}else if(ch == 'J' | ch == 'K' | ch == 'L'){
			printf("5");
	}else if(ch == 'M' | ch == 'N' | ch == 'O'){
			printf("6");
	}else if(ch == 'P' | ch == 'R' | ch == 'S'){
			printf("7");
	}else if(ch == 'T' | ch == 'U' | ch == 'V'){
			printf("8");
	}else if(ch == 'W' | ch == 'X' | ch == 'Y'){
			printf("9");
	}else{
			printf("%c", ch);
	}
} while(ch != '\n');


	printf("\n");

	return 0;
}
