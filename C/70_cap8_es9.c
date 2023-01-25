/**
*	Nome: 70_cap8_es9.c
*	Data: 24/09/2017	
*	Scopo:	Programma che crea un matrice 10x10 con un cammino casuale
*	Autore:	Boioli Simone
*/


#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>

int main(void){

	char mat[10][10];
	int spostamento = 0;   //(0 in su, 1 a dx, 2 in giu, 3 a sx)
	int i = 0; //riga
	int j = 0; //colonna

	char lettere[] = {'A', 'B', 'C', 'D','E', 'F', 'G', 'H','I', 'J', 'K', 'L','M', 'N', 'O', 'P','Q', 'R', 'S', 'T','U', 'V', 'W', 'X','Y', 'Z'};
	int cont = 0; //amenta con l'aggiunta delle lettere

	srand ((unsigned) time(NULL));

	//inizializzazione matrice con "."
	for(int i = 0; i < 10; i++){
		for(int j = 0; j < 10; j++){
			mat[i][j] = '.';
		}
	}

	mat[i][j] = lettere[cont];
	cont++;

	while(cont < 26){
		spostamento = rand() % 4;

		if(spostamento == 0){  //SPOSTAMENTO IN ALTO
			
			if(i != 0 && mat[i-1][j] == '.'){
				//mi sposto in su
				i--;
				mat[i][j] = lettere[cont];
				printf("%d-(0)su\n", cont);
			}else if(j != 9 && mat[i][j+1] == '.'){
				//mi sposto a destra
				j++;
				mat[i][j] = lettere[cont];
				printf("%d-(0)dx\n", cont);
			}else if(i != 9 && mat[i+1][j] == '.'){
				//mi sposto in basso
				i++;
				mat[i][j] = lettere[cont];
				printf("%d-(0)gìu\n", cont);
			}else if(j != 0 && mat[i][j-1] == '.'){
				//mi sposto a sinistra
				j--;
				mat[i][j] = lettere[cont];
				printf("%d-(0)sx\n", cont);
			}else{
				printf("STALLO");
				break;
			}

		}else if(spostamento == 1){ //SPOSTAMENTO A DESTRA
			if(j != 9 && mat[i][j+1] == '.'){
				//mi sposto a destra
				j++;
				mat[i][j] = lettere[cont];
				printf("%d-(1)dx\n", cont);
			}else if(i != 9 && mat[i+1][j] == '.'){
				//mi sposto in basso
				i++;
				mat[i][j] = lettere[cont];
				printf("%d-(1)gìu\n", cont);
			}else if(j != 0 && mat[i][j-1] == '.'){
				//mi sposto a sinistra
				j--;
				mat[i][j] = lettere[cont];
				printf("%d-(1)sx\n", cont);
			}else if(i != 0 && mat[i-1][j] == '.'){
				//mi sposto in su
				i--;
				mat[i][j] = lettere[cont];
				printf("%d-(1)su\n", cont);
			}else{
				printf("STALLO");
				break;
			}

		}else if(spostamento == 2){ //SPOSTAMENTO IN BASSO
			if(i != 9 && mat[i+1][j] == '.'){
				//mi sposto in basso
				i++;
				mat[i][j] = lettere[cont];
				printf("%d-(2)gìu\n", cont);
			}else if(j != 0 && mat[i][j-1] == '.'){
				//mi sposto a sinistra
				j--;
				mat[i][j] = lettere[cont];
				printf("%d-(2)sx\n", cont);
			}else if(i != 0 && mat[i-1][j] == '.'){
				//mi sposto in su
				i--;
				mat[i][j] = lettere[cont];
				printf("%d-(2)su\n", cont);
			}else if(j != 9 && mat[i][j+1] == '.'){
				//mi sposto a destra
				j++;
				mat[i][j] = lettere[cont];
				printf("%d-(2)dx\n", cont);
			}else{
				printf("STALLO");
				break;
			}

		}else if(spostamento == 3){  //SPOSTAMENTO A SINISTRA
			if(j != 0 && mat[i][j-1] == '.'){
				//mi sposto a sinistra
				j--;
				mat[i][j] = lettere[cont];
				printf("%d-(2)sx\n", cont);
			}else if(i != 0 && mat[i-1][j] == '.'){
				//mi sposto in su
				i--;
				mat[i][j] = lettere[cont];
				printf("%d-(2)su\n", cont);
			}else if(j != 9 && mat[i][j+1] == '.'){
				//mi sposto a destra
				j++;
				mat[i][j] = lettere[cont];
				printf("%d-(2)dx\n", cont);
			}else if(i != 9 && mat[i+1][j] == '.'){
				//mi sposto in basso
				i++;
				mat[i][j] = lettere[cont];
				printf("%d-(2)gìu\n", cont);
			}else{
				printf("STALLO");
				break;
			}
		}

		cont++;
	}


	//stampa matrice
	for(int i = 0; i < 10; i++){
		for(int j = 0; j < 10; j++){
			printf("%c ", mat[i][j]);
		}
		printf("\n");
	}

	printf("\n");

	return 0;
}