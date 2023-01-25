#include<stdio.h>

int main(void){
	float euro;
	float importo; //euro inseriti + 5%
	
	printf("Inserisci l'importo: ");
	scanf("%f", &euro);

	importo = euro + ((euro * 5) / 100);

	printf("L'importo totale  è di: %.2f\n", importo);
	
	return 0;
}
