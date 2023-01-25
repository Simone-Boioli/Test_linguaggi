#include<stdio.h>

int main(void){
	int n;
	
	printf("Inserici un numero da 0 a 999: ");
	scanf("%d", &n);

	if(n >= 0 && n <= 9){
		printf("Il numero %d ha 1 cifra\n", n);
	}else if(n >= 10 && n <= 99){
		printf("Il numero %d ha 2 cifre\n", n);
	}else if(n >= 100 && n <= 999){
		printf("Il numero %d ha 3 cifre\n", n);	
	}
		
	return 0;
}
