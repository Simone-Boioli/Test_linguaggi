/*
*	Nome: 91_cap12_es1.c
*	Data: 27-06-2018
*	Scopo: Il programma legge un mex e lo stampa al contrario
*	Autore: Simone Boioli
*/

#include <stdio.h>

#define N 50  //lunghezza dell'array

void stampa_inverso(char v[], int cont);


int main(void){

	char vet[N];
 	/**/ char *p; //puntatore
	int cont = 0; 

	printf("Inserisci il messaggio: \n");

//riempimento array
/*	for(int i = 0; i < N; i++){
		char simbolo = getchar();		

		if(simbolo != '\n'){
			vet[i] = simbolo;
			cont++; 
		}else{
			break;
		}
	}	
*/
	for(p = vet; p < vet + N; p++){
		char simbolo = getchar();
		if(simbolo != '\n'){
			*p = simbolo;
			cont++;
		}else{
			break;
		}
	}


stampa_inverso(vet, cont);

	return 0;
}	

void stampa_inverso(char v[], int cont){
	for(int i = cont; i >= 0; i--){
		printf("%c", v[i]);
	}

	printf("\n");
}
