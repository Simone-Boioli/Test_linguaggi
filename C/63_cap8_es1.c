/**
*	Nome: 63_cap8_es1.c
*	Data: 14/09/2017	
*	Scopo:	controlla se in un numero inserito dall'utente ci sono cifre ripetute e le stampa
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int digit_seen[10] = {0}; //array contenete le cifre da 0 a 9 inizializzate a 0
	int digit = 0; // tiene in memoria una cfra alla volta del numero
	long n = 0; //numero inserito dall'utente

	printf("Inserisci un numero: ");
	scanf("%ld", &n);

	while(n > 0){
		digit = n % 10;

		digit_seen[digit] = digit_seen[digit] + 1; 
		
		n = n / 10;
	}

	printf("Le cifre ripetute sono: ");

	for(int i = 0; i < 10; i++){
		//printf("%d  ", digit_seen[i]);

		
		if(digit_seen[i] > 1){
			printf("%d ", i);
		}
		
	}

	printf("\n");

	return 0;
}