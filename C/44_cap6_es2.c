/**
*	Nome: 44_cap6_es2.c.c
*	Data: 03/27/2017	
*	Scopo:	Programma che chiede all'utente 2 interi e calcola l'MCD
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int m = 0;
	int n = 0;
	int resto = 0;

	printf("Inserisci 2 interi: ");
	scanf("%d %d", &m, &n);


	if(m >= n){
		
		while(n != 0){
			resto = m%n;			
			m = n;		
			n = resto;
		}

		printf("Il MCD tra i due numeri e': %d\n", m);
	}else{
		printf("ERRORE\n");
	}



	return 0;
}