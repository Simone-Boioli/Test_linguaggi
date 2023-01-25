/**
*	Nome: 65_cap8_es3.c
*	Data: 23/09/2017	
*	Scopo:	controlla se n numeri inseriti dall'utente ci sono cifre ripetute
*	Autore:	Boioli Simone
*/

#include <stdio.h>
#include <stdbool.h>

int main(void){

	int digit_seen[10] = {0}; //array contenete il numero di cifre da 0 a 9 inizializzate a 0
	long n = -1; //numero inserito dall'utente per uscire
	
	long num[100] = {0}; //vettore valori inseriti dall'utente
	int cont = 0; //contatore

	//inizializzazione vettore a -1
	for(int i = 0; i < 100; i++){
		num[i] = -1;
	}	

	do{
		printf("Inserisci un numero: ");
		scanf("%ld", &n);
		num[cont] = n;
		cont++;
	}
	while(n != 0);



	for(int i = 0; i < 100; i++){
		int numero = num[i];  //tiene in memoria un numero alla volta
		int digit = 0; // tiene in memoria una cifra alla volta del numero


		while(numero > 0){
			digit = numero % 10;

			digit_seen[digit] = digit_seen[digit] + 1;

			numero = numero / 10;
		}
	}


	printf("Le cifre ripetute nei numeri sono: ");
	for(int i = 0; i < 10; i++){
		if(digit_seen[i] > 1){
			printf("%d ", i);
		}
	}

	printf("\n");


	return 0;
}