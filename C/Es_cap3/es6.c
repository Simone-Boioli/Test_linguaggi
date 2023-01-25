#include<stdio.h>

int main(void){
	int n1, d1;
	int n2, d2;
	int somma_n, somma_d;
	
	printf("\nInserisci la somma di frazioni: ");
	scanf("%d/%d+%d/%d", &n1, &d1, &n2, &d2);

	somma_n = n1 * d2 + n2 * d1;
	somma_d = d1 * d2;

	printf("\nLa somma è: %d/%d\n", somma_n, somma_d);

	return 0; 
}
