#include<stdio.h>

int main(void){
	float max = 0;
	float val;  //valore inserito dall'utente
	
	do{
		printf("Inserisci un numero: ");
		scanf("%f", &val);

		if(val > max){
			max = val;
		}

	}while(val != 0);

	printf("Il valore max e': %.2f\n", max);
		
	return 0;
}
