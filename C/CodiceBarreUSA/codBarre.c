#include<stdio.h>

int main(void){
	int d; //prima cifra --> identifica la tipologia del prodotto
	int i1, i2, i3, i4, i5; //dalla seconda alla 6 cifra --> identifica il produttore
	int j1, j2, j3, j4, j5; //dalla 7 alla 11 cifra --> identifica il prodotto
	int c; //ultima cifra --> cifra di controllo

	int prima_somma;	
	int seconda_somma;
	int parziale;

	printf("Inserici la prima cifra: ");
	scanf("%1d", &d);

	printf("Inserisci il primo gruppo di cifre: ");
	scanf("%1d%1d%1d%1d%1d", &i1, &i2, &i3, &i4, &i5);

	printf("Inserisci il secondo guppo di cifre: ");
	scanf("%1d%1d%1d%1d%1d", &j1, &j2, &j3, &j4, &j5);

	prima_somma = d + i2 + i4 + j1 + j3 + j5;
	seconda_somma = i1 + i3 + i5 + j2 + j4;
	
	parziale = (prima_somma * 3) + seconda_somma;
	parziale = parziale -1;
	parziale = parziale % 10;
	c = 9 - parziale;
	
	printf("\nLa cifra di controllo vale: %1d\n", c);
	
	return 0;
			 
}
