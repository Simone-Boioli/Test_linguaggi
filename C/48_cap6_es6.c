/**
*	Nome: 48_cap6_es6.c
*	Data: 04/23/2017	
*	Scopo:	Programma che chiede all'utente un numero n e stampa tutti i quadrati pari compresi tra 1 e n
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int n = 0;
	int x = 0;

	printf("Inserisci un numero n: ");
	scanf("%d", &n);

	
	for(int i = 1; x <= n; i++){
		x = i * i;
		if((x % 2) == 0){
			printf("%d\n", x);
		}
	}

	return 0;
}