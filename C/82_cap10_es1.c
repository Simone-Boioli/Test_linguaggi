/**
*	Nome: 82_cap10_es1.c
*	Data: 08/11/2017	
*	Scopo:	Programma che implementa uno stack da utilizzare per contare le parentesi inserite
*	Autore:	Boioli Simone
*/

#include <stdbool.h>
#include <stdio.h>

#define STACK_SIZE 100

//VARIABILI ESTERNE
char contenitore[STACK_SIZE]; //array che contiene i dati
int top = 0; //indice che indica l'ultimo elemento inserito

//PROTOTIPI
void make_empty(void);
bool is_empty(void);
bool is_full(void);
void push(char i);
void pop(void);
void stack_overflow(void);
void stampa_stack(void);


int main(void)
{
	char parentesi;
	char estratto;
	stampa_stack();
	printf("Inserisci le parentesi: ");
	
	do{
		parentesi = getchar();
		if(parentesi == '(' || parentesi == '[' || parentesi == '{'){
			push(parentesi);
			stampa_stack();
		}else if(parentesi == ')'){		
			if(contenitore[top - 1] == ')'){
				pop();
				stampa_stack();
			}else{
				printf("ERRORE!");
			}
		}/*else if(parentesi == ']'){
			if(contenitore[top--] == ']'){
				pop();
			}else{
				printf("ERRORE!");
			}
		}else if(parentesi == '}'){
			if(contenitore[top--] == '}'){
				pop();
			}else{
				printf("ERRORE!");
			}
		}*/
	}while(parentesi != '\n');
/*
	if(is_empty)
		printf("TUTTO CORRETTO");
	else
		printf("ERRORE FINALE");
*/
	return 0;
}


//funzione che svuota lo stack
void make_empty(void){
	top = 0;
}

//funzione che dice se lo stack è vuoto
bool is_empty(void){
	if(top == 0){
		return true;
	}else{
		return false;
	}
}

//funzione che indica se lo stack è pieno
bool is_full(void){
	return top == STACK_SIZE;
}

//funzione per inserire un elemento
void push(char i){
	if(is_full()){
		stack_overflow();
	}else{
		contenitore[top] = i;
		top++;
	}
}

//funzione per togliere un elemento
void pop(void){
	if(is_empty()){
		stack_overflow();
	}else{
		top--;
	}
}

void stack_overflow(void){
	printf("STACK OVERFLOW");
}

void stampa_stack(void){
	printf("----------STACK----------\n");
	printf("TOP = %d\n", top);
	for (int i = 0; i <= top; i++){
		printf("%c\n", contenitore[i]);
	}
	printf("---------------------------\n\n");
}