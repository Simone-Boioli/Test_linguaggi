#include<stdio.h>

int main(void){
		
	int n;
	int q = 0;

	printf("Inserici un numero n: ");
	scanf("%d", &n);

	for(int i = 1; q <= n; i++){
		q = i * i;

		if((i % 2) == 0){
			printf("%d\n", q);
		}
	}

		
	return 0;
}
