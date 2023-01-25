#include<stdio.h>

int main(void){
	int soldi;
	int parziale;
	int num_20;
	int num_10;
	int num_5;
	int num_1;
	
	printf("Inserisci l'importo: ");
	scanf("%d", &soldi);

	num_20 = soldi/ 20;
	parziale = soldi - num_20 * 20;

	num_10 = parziale / 10;
	parziale = parziale - num_10 * 10;

	num_5 = parziale / 5;
	parziale = parziale - num_5 * 5;

	num_1 = parziale;
	

	printf("Banconote da 20 = %d\n", num_20); 
	printf("Banconote da 10 = %d\n", num_10);
	printf("Banconote da 5  = %d\n", num_5);
	printf("Banconote da 1  = %d\n", num_1);

	return 0;
}
