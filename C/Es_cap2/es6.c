#include<stdio.h>

int main(void){
	int x;
	int risultato;

	printf("Inserisci il valore di x: ");
	scanf("%d", &x);

	risultato = (((((((((3 * x) + 2) * x) - 5) * x) -1) * x) +7) * x) -6;

	printf("Il risultato e': %d\n", risultato);

	return 0;
}
