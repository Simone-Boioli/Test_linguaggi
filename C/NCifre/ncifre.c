#include<stdio.h>

int main(void){
	int numero;
	int cifre = 0;
	
	printf("Inserisci il numero: ");
	scanf("%d", &numero);

	do{
		numero = numero/10;
		cifre++;
	}while(numero != 0);

	printf("Le cifre del numero sono: %d\n", cifre);

	return 0;
}
