/**
*	Nome: 17_cap3_es5.c
*	Data: 01/28/2017	
*	Scopo:	Quadrato magico
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int primo = 0;
	int secondo = 0;
	int terzo = 0;
	int quarto = 0;
	int quinto = 0;
	int sesto = 0;
	int settimo = 0;
	int ottavo = 0;
	int nono = 0;
	int decimo = 0;
	int undicesimo = 0;
	int dodicesimo = 0;
	int tredicesimo = 0;
	int quattordicesimo = 0;
	int quindicesimo = 0;
	int sedicesimo = 0;

	int somma_righe_uno = 0;
	int somma_righe_due = 0;
	int somma_righe_tre = 0;
	int somma_righe_quattro = 0;

	int somma_colonne_uno = 0;
	int somma_colonne_due = 0;
	int somma_colonne_tre = 0;
	int somma_colonne_quattro = 0;

	int somma_diagonale_uno = 0;
	int somma_diagonale_due = 0;

	printf("Inserisci i numeri da  a 16 in qualsiasi ordine: \n");
	scanf("%d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d", 
		  &primo, &secondo, &terzo, &quarto, 
		  &quinto, &sesto, &settimo, &ottavo,
		  &nono, &decimo, &undicesimo, &dodicesimo,
		  &tredicesimo, &quattordicesimo, &quindicesimo, &sedicesimo);


	printf("%d\t%d\t%d\t%d\n", primo, secondo, terzo, quarto);
	printf("%d\t%d\t%d\t%d\n", quinto, sesto, settimo, ottavo);
	printf("%d\t%d\t%d\t%d\n", nono, decimo, undicesimo, dodicesimo);
	printf("%d\t%d\t%d\t%d\n", tredicesimo, quattordicesimo, quindicesimo, sedicesimo);

	somma_righe_uno = primo + secondo + terzo + quarto;
	somma_righe_due = quinto + sesto + settimo + ottavo;
	somma_righe_tre = nono + decimo + undicesimo + dodicesimo;
	somma_righe_quattro = tredicesimo + quattordicesimo + quindicesimo + sedicesimo;

	somma_colonne_uno = primo + quinto + nono + tredicesimo;
	somma_colonne_due = secondo + sesto + decimo + quattordicesimo;
	somma_colonne_tre = terzo + settimo + undicesimo + quindicesimo;
	somma_colonne_quattro = quarto + ottavo + dodicesimo + sedicesimo;

	somma_diagonale_uno = primo + sesto + undicesimo + sedicesimo;
	somma_diagonale_due = quarto + settimo + decimo + tredicesimo;


	printf("Somma righe: %d %d %d %d\n", somma_righe_uno, somma_righe_due, somma_righe_tre, somma_righe_quattro);
	printf("Somma colonne: %d %d %d %d\n", somma_colonne_uno, somma_colonne_due, somma_colonne_tre, somma_colonne_quattro);
	printf("Somma diagonali: %d %d\n", somma_diagonale_uno, somma_diagonale_due);

	return 0;
}