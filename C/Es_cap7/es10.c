#include<stdio.h>

int main(void){
	int vocali = 0;
	char c;

	printf("Inserisci una frase: ");

	c = getchar();

	while(c != '\n'){
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
		   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
			vocali ++;
		}
		
		c = getchar();
	}

	printf("Le vocali nella frase sono: %d\n", vocali);

	return 0;
}
