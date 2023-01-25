/**
*	Nome: 68_cap8_es7.c
*	Data: 24/09/2017	
*	Scopo:	Programma che crea un matrice 5x5 e stampa la somma delle righe e delle colonne
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main (void){

	int matrice[5][5];
	int val = 0; 

	int somma_righe[5];
	int somma_colonne[5];

	printf("Inserisci la prima riga 1: ");
	for(int i = 0; i < 5; i++){
		scanf("%d", &val);
		matrice[0][i] = val;
	}

	printf("Inserisci la prima riga 2: ");
	for(int i = 0; i < 5; i++){
		scanf("%d", &val);
		matrice[1][i] = val;
	}

	printf("Inserisci la prima riga 3: ");
	for(int i = 0; i < 5; i++){
		scanf("%d", &val);
		matrice[2][i] = val;
	}

	printf("Inserisci la prima riga 4: ");
	for(int i = 0; i < 5; i++){
		scanf("%d", &val);
		matrice[3][i] = val;
	}

	printf("Inserisci la prima riga 5: ");
	for(int i = 0; i < 5; i++){
		scanf("%d", &val);
		matrice[4][i] = val;
	}


	somma_righe[0] = matrice[0][0] + matrice[0][1] + matrice[0][2] + matrice[0][3] + matrice[0][4]; 
	somma_righe[1] = matrice[1][0] + matrice[1][1] + matrice[1][2] + matrice[1][3] + matrice[1][4];
	somma_righe[2] = matrice[2][0] + matrice[2][1] + matrice[2][2] + matrice[2][3] + matrice[2][4];
	somma_righe[3] = matrice[3][0] + matrice[3][1] + matrice[3][2] + matrice[3][3] + matrice[3][4];
	somma_righe[4] = matrice[4][0] + matrice[4][1] + matrice[4][2] + matrice[4][3] + matrice[4][4];

	somma_colonne[0] = matrice[0][0] + matrice[1][0] + matrice[2][0] + matrice[3][0] + matrice[4][0];
	somma_colonne[1] = matrice[0][1] + matrice[1][1] + matrice[2][1] + matrice[3][1] + matrice[4][1];
	somma_colonne[2] = matrice[0][2] + matrice[1][2] + matrice[2][2] + matrice[3][2] + matrice[4][2];
	somma_colonne[3] = matrice[0][3] + matrice[1][3] + matrice[2][3] + matrice[3][3] + matrice[4][3];
	somma_colonne[4] = matrice[0][4] + matrice[1][4] + matrice[2][4] + matrice[3][4] + matrice[4][4];

	printf("matrice intera: \n");

	for(int i = 0; i < 5; i++){
		for(int j = 0; j < 5; j++){
			printf("%d ", matrice[i][j]);
		}

		printf("\n");
	}


	printf("La somma delle righe è: ");
	for(int i = 0; i < 5; i++){
		printf("%d ", somma_righe[i]);
	}

	printf("\n");

	printf("La somma delle colonne è: ");
	for(int i = 0; i < 5; i++){
		printf("%d ", somma_colonne[i]);
	}

	printf("\n");

	return 0;
}
