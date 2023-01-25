/**
*	Nome: 34_cap5_es7.c
*	Data: 01/30/2017	
*	Scopo:	Programma che calcola il max e il minimo tra 4 numeri inseriti dall'utente
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int a = 0;
	int b = 0;
    int c = 0;
	//int d = 0;

	int max = 0;
	int min = 0;

	printf("Inserisci 3 numeri interi: ");
	scanf("%d%d%d", &a, &b, &c; 
/*
// 3 NUMERI //

	if(a > b){
		if(a > c){
			max = a;
			if(b > c){
				min = c;
			}else{
				min = b;
			}
		}else{
			max = c;
			min = b;
		}
	}else{
		if(b > c){
			max = b;
			if(a > c){
				min = c;
			}else{
				min = a;
			}
		}else{
			max = c;
			min = a;
		}
	}
*/

	printf("Massimo: %d\n", max);
	printf("Minimo: %d\n", min);


	return 0;
}
