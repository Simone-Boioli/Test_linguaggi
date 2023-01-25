#include<stdio.h>

int main(void){
	int nome; 
	int cognome;
	
	printf("Inserisci nome e cognome: ");
	scanf("%d %d", &nome, &cognome);

	printf("%c, %1c", cognome, nome);

	return 0;

}	
