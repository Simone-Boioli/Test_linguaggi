/**
*	Nome: 60_cifre_ripetute.c
*	Data: 13/09/2017	
*	Scopo:	controlla se in un numero inserito dall'utente ci sono cifre ripetute
*	Autore:	Boioli Simone
*/

#include <stdio.h>
#include <stdbool.h>

int main(void){

	bool digit_seen[10] = {false}; //arrey contenete le cifre da 0 a 9 inizializzate a false
	int digit = 0; // tiene in memoria una cfra alla volta del numero
	long n = 0; //numero inserito dall'utente

	printf("Inserisci un numero: ");
	scanf("%ld", &n);

	while(n > 0){
		digit = n % 10;

		if(digit_seen[digit] == true){
			break;
		}
		
		digit_seen[digit] = true;
		n = n / 10;

	}

	if(n > 0){
		printf("Ci sono cifre ripetute\n");
	}else{
		printf("Non ci sono cifre ripetute\n");
	}


	return 0;
}