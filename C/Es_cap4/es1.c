#include<stdio.h>

int main(void){
	int num;

	printf("Inserisci un numero a due cifre: ");
	scanf("%d", &num);

	int a = num/10; //prima cifra(decine)
	int b = num%10; // seconda cifra(unità)

	printf("%d%d\n", b, a);

	return 0;  	
	
}
