#include<stdio.h>

int main(void){
	
	int giorno;
	int mese;
	int anno;

	printf("Inserisci la data nel formato mese/giorno/anno: ");
	scanf("%d/%d/%d", &mese, &giorno, &anno);

	printf("%d%.2d%d\n", anno, mese, giorno);

	return 0;
}	
