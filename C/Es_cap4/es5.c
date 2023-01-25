#include<stdio.h>

int main(void){
	int d;
	int i1, i2, i3, i4, i5;
	int j1, j2, j3, j4, j5;
	int c;
	
	printf("Inserisci il codice a barre senza l'ultima cifra: ");
	scanf("%1d%1d%1d%1d%1d%1d%1d%1d%1d%1d%1d",&d, &i1, &i2, &i3, &i4, &i5, &j1, &j2, &j3, &j4, &j5);

	int prima_somma = d + i2 + i4 + j1 + j3 + j5;
	int seconda_somma = i1 + i3 + i5 + j2 + j4;
	int totale = (3 * prima_somma) + seconda_somma;

	c = 9 - ((totale - 1)% 10);

	printf("Il codice di controllo e': %d\n", c);

	return 0;
	 
}
