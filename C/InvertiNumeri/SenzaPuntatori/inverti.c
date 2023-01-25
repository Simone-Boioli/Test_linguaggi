#include<stdio.h>

#define N 4

int main (void){
	int a[N], i;

	printf("Inserisci %d numeri: ", N);
	
	for(i = 0; i < N; i++){

	}

	printf("In ordine inverso: \n");
	for(i = N-1; i >= 0; i--){
		printf(" %d", a[i]);
	}
	printf("\n");

	return 0;
	
}

