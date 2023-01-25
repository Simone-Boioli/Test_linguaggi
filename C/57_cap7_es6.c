/**
*	Nome: 57_cap7_es6.c
*	Data: 06/23/2017	
*	Scopo:	Programma che calcola il valore di sizeof
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	printf("Grandezza int: %lu byte\n", (unsigned long)(sizeof(int)));
	printf("Grandezza short: %lu byte\n", (unsigned long)(sizeof(short)));	
	printf("Grandezza long: %lu byte\n", (unsigned long)(sizeof(long)));
	printf("Grandezza float: %lu byte\n", (unsigned long)(sizeof(float)));
	printf("Grandezza double: %lu byte\n", (unsigned long)(sizeof(double)));
	printf("Grandezza long double: %lu byte\n", (unsigned long)(sizeof(long double)));

	return 0;
}