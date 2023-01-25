#include<stdio.h>
#include<stdbool.h>

int main(void){
	bool lista_cifre[10] = {false};  //indica le cifre da 0 a 9
	long n;	//numero passato
	int cifra; //singola cifra del numero

	printf("Inserisci un numero: ");
	scanf("%ld", &n);
	
	while(n > 0){
		cifra = n % 10;

		if(lista_cifre[cifra]){
			break;  //esce dal while
		}

		lista_cifre[cifra] = true;
		n = n/10;
	}

	if(n > 0){
		printf("Cifra ripetuta\n");
	}else{
		printf("Cifra non ripetuta\n");
	}

	return 0;
}
