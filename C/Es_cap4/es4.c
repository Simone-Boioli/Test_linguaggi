#include<stdio.h>

int main(void){
	int num; //numero inserito

	printf("Insersci un numero tra 0 e 32767: ");
	scanf("%d", &num);

	int a = num % 8;
	int b = (num/8) % 8;
	int c = ((num/8)/8) % 8;	
	int d = (((num/8)/8)/8) % 8;
	int f = ((((num/8)/8)/8)/8) % 8;

	printf("%d%d%d%d%d\n", f, d, c, b, a);

	return 0;
}
