#include<stdio.h>

int main(void){
	int m;
	int n;

	int resto;

	printf("Inserisci due numeri: ");
	scanf("%d %d", &m, &n);

	if(m > n){
		while(n != 0){
			resto = m % n;
			m = n;
			n = resto;
		}
	}
	
	printf("L'MCD e': %d\n", m);
	return 0;
}
