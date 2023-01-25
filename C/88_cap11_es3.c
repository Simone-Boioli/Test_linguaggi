/**
*	Nome: 88_cap11_es3.c
*	Data: 04/08/2017	
*	Scopo:	Programma che chiede all'utente una frazione e la riduce ai minimi termini
*	Autore:	Boioli Simone
*/

#include <stdio.h>

//PROTOTIPI
void riduci(int numeratore, int denominatore, int *num_ridotto, int *den_ridotto);

int main(void){

	int num = 0;  //numeratore
	int den = 0;  //denominatore
	
	int n_ridotto = 0;
	int d_ridotto = 0;


	printf("Inserisci la frazione (a/b): ");
	scanf("%d/%d", &num, &den);

	riduci(num, den, &n_ridotto, &d_ridotto);

	printf("In minimi termini e': %d/%d\n", n_ridotto, d_ridotto);

	return 0;
}

void riduci(int numeratore, int denominatore, int *num_ridotto, int *den_ridotto){
	int resto = 0;
    int MCD = 0;

	    //copia dati
	int num2 = numeratore;
	int den2 = denominatore;

	while(denominatore != 0){
		resto = numeratore%denominatore;			
		numeratore = denominatore;		
		denominatore = resto;
	}

	MCD = numeratore;

	*num_ridotto = num2 / MCD;
	*den_ridotto = den2 / MCD;
}