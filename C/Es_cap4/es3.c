#include<stdio.h>

int main(void){
	int centinaia;
	int decine;
	int unita;

	printf("Inserisci il numero a tre cifre: ");
	scanf("%1d%1d%1d", &centinaia, &decine, &unita);

	printf("%d%d%d\n", unita, decine, centinaia);

	return 0;
}	
