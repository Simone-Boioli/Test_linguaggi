#include<stdio.h>

int main(void){
	int d; //prima cifra --> identifica la tipologia del prodotto
	int i1, i2, i3, i4, i5; //dalla seconda alla 6 cifra --> identifica il produttore
	int j1, j2, j3, j4, j5; //dalla 7 alla 11 cifra --> identifica il prodotto
	int c; //ultima cifra --> cifra di controllo

	int prima_somma;	
	int seconda_somma;
	int parziale;
	int controllo;
	

	printf("Inserisci il codice UPC: ");
	scanf("%1d%1d%1d%1d%1d%1d%1d%1d%1d%1d%1d%1d", &d, &i1, &i2, &i3, &i4, &i5, &j1, &j2, &j3, &j4, &j5, &c);
	
	prima_somma = d + i2 + i4 + j1 + j3 + j5;
	seconda_somma = i1 + i3 + i5 + j2 + j4;
	
	parziale = (prima_somma * 3) + seconda_somma;
	parziale = parziale -1;
	parziale = parziale % 10;
	controllo = 9 - parziale;

	if(controllo == c){
		printf("VALIDO\n");
	}else{
		printf("NON VALIDO\n");
	}

	return 0;
			 
}
