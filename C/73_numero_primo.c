/**
*	Nome: 73_numero_primo.c
*	Data: 08/10/2017	
*	Scopo:	Programma che controlla se un numero è primo
*	Autore:	Boioli Simone
*/


#include <stdio.h>
#include <stdbool.h>


bool primo (int num){

	if(num <= 1){
		return false;
	}

	for(int divisore = 2; divisore*divisore <= num; divisore++){
		if(num % divisore == 0){
			return false;
		}
	}

	return true;
}




int main(void){

	int n = 0;

	printf("Inserisci un numero: ");
	scanf("%d", &n);

	if(primo(n) == true){
		printf("Il numero è primo!\n");
	}else{
		printf("Il numero non è primo!\n");
	}
}
