/**
*	Nome: 53_cap7_es2.c
*	Data: 06/23/2017	
*	Scopo:	Programma che stampa la tavola dei quadrati e ogni 24 chiede all'utente di premere invio
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int n = 0;
	char c;



	printf("Inserisil il numero dei quadrati da stampare: ");
	scanf("%d", &n);


	for (int i = 1; i <= n; i++){

		printf("%10d%10d\n", i, i * i);

		if(i%24 == 0){
			printf("\nPress Enter to continue...\n");
			c = getchar();
		}

		
	}

	return 0;
}