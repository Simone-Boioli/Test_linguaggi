#include<stdio.h>

int main(void){
	/**
 	* PRIMA VERSIONE 	
 	*
 	*/


	/*int n = -1;
	int sum = 1;
	
	while(n != 0){
		
		sum = sum + n;
		printf("Inserisci un numero: ");
		scanf("%d", &n);
	}

	printf("La somma vale: %d\n", sum);
	*/

	/**
 	*
 	*SECONDA VERSIONE
 	*
 	*/
	int n;
	int sum = 0;

	printf("Inserisci un numero: ");
	scanf("%d", &n);

	while(n!=0){
		sum = sum + n;	
		scanf("%d", &n);
 	}

	printf("La somma e': %d\n", sum);
	
	return 0;
}
