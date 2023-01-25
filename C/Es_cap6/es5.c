#include<stdio.h>

int main(void){
	int num;
	int resto;

	printf("Inserisci il numero: ");
	scanf("%d", & num);

	do{
		resto = num % 10;
		num = num / 10;

		printf("%d", resto);
		
	}while(num != 0);


	printf("\n");

	return 0;
}
