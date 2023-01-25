#include<stdio.h>

int main(void){
		
	int cont = 0;

	printf("Inserisci un messaggio: ");
	
	while(getchar() != '\n'){
		cont ++;
	}

	
	printf("Il messaggio è lungo: %d caratteri\n", cont);

	return 0;
}
