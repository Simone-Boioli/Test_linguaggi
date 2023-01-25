#include<stdio.h>

int main(void){
	int num;

	printf("Insersici il numero a tre cifre: ");
	scanf("%d", &num);

	int a = num/100; //centinaia
	int b = (num/10)%10; //decina
	int c = num%10; // unità

	printf("%d%d%d\n", c, b, a);

	return 0;
}
