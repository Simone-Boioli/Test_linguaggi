/*
*	Nome: 98_cap12_es6.c
*	Data: 06/07/2018
*	Scopo: programma che legge dei nomi inseriti da riga di comando e dirà se sono pianeti
*	Autore: Simone Boioli
*/

#include<stdio.h>
#include<string.h>

#define NUM_PIANETI 9

int main(int argc, char *argv[]){
	
	//vettore con il nome dei pianeti
	char *pianeti[] = {"Mercurio", "Venere", "Terra", 
					   "Marte", "Giove", "Saturno", 
					   "Urano", "Nettuno", "Plutone"};

	int i = 0;
	int j = 0;

	for(i = 1; i < argc; i++){
		for(j = 0; j < NUM_PIANETI; j++){
			if(strcasecmp(argv[i], pianeti[j]) == 0){
				printf("%s è il %d pianeta.\n", argv[i], j+1);
				break; 
			}
		} 
		if(j == NUM_PIANETI){
			printf("%s non è un pianeta\n", argv[i]);
		}
	}

	return 0;
} 
