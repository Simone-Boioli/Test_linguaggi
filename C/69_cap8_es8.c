/**
*	Nome: 69_cap8_es8.c
*	Data: 24/09/2017	
*	Scopo:	Programma che crea un matrice 5x5 di studenti e quiz
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main (void){

	int matrice[5][5];  
	int val = 0; 

	int somma_righe[5];
	int somma_colonne[5];

	printf("Inserisci il punteggio dei 5 quiz dello studente 1: ");
	for(int i = 0; i < 5; i++){
		scanf("%d", &val);
		matrice[0][i] = val;
	}

	printf("Inserisci il punteggio dei 5 quiz dello studente 2: ");
	for(int i = 0; i < 5; i++){
		scanf("%d", &val);
		matrice[1][i] = val;
	}

	printf("Inserisci il punteggio dei 5 quiz dello studente 3: ");
	for(int i = 0; i < 5; i++){
		scanf("%d", &val);
		matrice[2][i] = val;
	}

	printf("Inserisci il punteggio dei 5 quiz dello studente 4: ");
	for(int i = 0; i < 5; i++){
		scanf("%d", &val);
		matrice[3][i] = val;
	}

	printf("Inserisci il punteggio dei 5 quiz dello studente 5: ");
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

	printf("il punteggio totale dello studente 1 è: %d, mentre quello medio è: %.2f\n", somma_righe[0], (float)(somma_righe[0]/5.0) );
	printf("il punteggio totale dello studente 2 è: %d, mentre quello medio è: %.2f\n", somma_righe[1], (float)(somma_righe[1]/5.0) );
	printf("il punteggio totale dello studente 3 è: %d, mentre quello medio è: %.2f\n", somma_righe[2], (float)(somma_righe[2]/5.0) );
	printf("il punteggio totale dello studente 4 è: %d, mentre quello medio è: %.2f\n", somma_righe[3], (float)(somma_righe[3]/5.0) );
	printf("il punteggio totale dello studente 5 è: %d, mentre quello medio è: %.2f\n\n", somma_righe[4], (float)(somma_righe[4]/5.0) );

	//calcolo media, max e min, quiz
	int max = 0;   //punteggio minimo
	int min = 10;  //punteggio max

	
	for(int i = 0; i < 5; i++){ //quiz
		for(int j = 0; j < 5; j++){

			if(matrice[j][i] >= max){
				max = matrice[j][i];	
			}else if(matrice[j][i] <= min){
				min = matrice[j][i];
			}

		}
		printf("Il punteggio medio del quiz %d è: %.2f\n",i, (float)(somma_colonne[i] / 5.0));
		printf("Il punteggio massimo del quiz %d è: %d\n",i, max);
		printf("Il punteggio minimo del quiz %d è: %d\n\n",i,  min);

		max = 0; 
		min = 10;
	}
	

	return 0;
}
