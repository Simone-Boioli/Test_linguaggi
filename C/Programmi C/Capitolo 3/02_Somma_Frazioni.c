/*
*	Boioli Simone  11/04/16
*	Sommare frazioni  (pag 48)
*/

#include <stdio.h>

int main(void)
{
	int num1, denom1;
	int num2, denom2;
	int resul_num;
	int resul_denom;

	printf("Inserisci la prima frazione (a/b): ");
	scanf("%d/%d", &num1, &denom1);

	printf("Inserisci la seconda frazione (a/b): ");
	scanf("%d/%d", &num2, &denom2);

	resul_num = num1*denom2 + num2*denom1;
	resul_denom = denom1*denom2;

	printf("La somma e': %d/%d\n", resul_num, resul_denom);

	return 0;
}