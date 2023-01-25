#include<stdio.h>

int main(void){
	int n;  //numero inserito dall'utente	
	int i;

	printf("Inserisci un numero intero: ");
	scanf("%d", &n);
	
	i = 1;
	
	while(i <= n){
		printf("%10d%10d\n", i, i*i);
		i++;
	}

	return 0;
}
