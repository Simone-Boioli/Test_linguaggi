#include <stdio.h>

int main(void){
	int num1;
	int denom1;
		
	int num2;
	int denom2;

	int ris_num;
	int ris_denom;

	printf("Inserisci la prima frazione: ");	
	scanf("%d/%d", &num1, &denom1);

	printf("Inserisci la seconda frazione: ");
	scanf("%d/%d", &num2, &denom2);

	ris_num = num1 * denom2 + num2 * denom1;
	ris_denom = denom1 * denom2;

	printf("La somma delle frazioni e': %d/%d\n", ris_num, ris_denom);

	return 0;
	
}
