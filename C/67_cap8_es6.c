/**
*	Nome: 67_cap8_es6.c
*	Data: 24/09/2017	
*	Scopo:	Programma che crea un filtro B1FF
*	Autore:	Boioli Simone
*/

#include <stdio.h>
#include <ctype.h>

#define l ((int) (sizeof(frase)) / (sizeof(frase[0])))


int main(void){

	char frase[100]; 
	char valore; // carattere della frase inserito

	int cont = 0;

	printf("Inserisci una frase: ");

	//inserimento della frase nel vettore
	do{
		scanf("%c", &valore);
		frase[cont] = valore;
		cont++;
	}while(valore != '\n');

	printf("La strase con il filtro B1FF: ");

	for(int i = 0; i < l; i++){
		if(frase[i] == '\n'){
			break;
		}else if(frase[i] == ' '){
			printf(" ");
		}else if(frase[i] == 'A' || frase[i] == 'a'){
			printf("4");
		}else if(frase[i] == 'B' || frase[i] == 'b'){
			printf("8");
		}else if(frase[i] == 'E' || frase[i] == 'e'){
			printf("3");
		}else if(frase[i] == 'I' || frase[i] == 'i'){
			printf("1");
		}else if(frase[i] == 'O' || frase[i] == 'o'){
			printf("0");
		}else if(frase[i] == 'S' || frase[i] == 's'){
			printf("5");
		}else if(islower(frase[i])){
			printf("%c", toupper(frase[i]));
		}else{
			printf("%c", frase[i]);
		}

	}


	printf("!!!!!!!!!!\n");



	return 0;
}