/**
*	Nome: 79_stack.c
*	Data: 08/11/2017	
*	Scopo:	Programma che implementa uno stack
*	Autore:	Boioli Simone
*/

#include <stdbool.h>
#include <stdio.h>

#define STACK_SIZE 100

//VARIABILI ESTERNE
int contenitore[STACK_SIZE]; //array che contiene i dati
int top = 0; //indice che indica l'ultimo elemento inserito


//funzione che svuota lo stack
void make_empty(void){
	top = 0;
}

//funzione che dice se lo stack è vuoto
bool is_empty(void){
	return top == 0;
}

//funzione che indica se lo stack è pieno
bool is_full(void){
	return top == STACK_SIZE;
}

//funzione per inserire un elemento
void push(int i){
	if(is_full()){
		stack_overflow();
	}else{
		contenitore[top++] = i;
	}
}

//funzione per togliere un elemento
int pop(void){
	if(is_empty()){
		stack_overflow();
	}else{
		return(contenitore[--top]);
	}
}