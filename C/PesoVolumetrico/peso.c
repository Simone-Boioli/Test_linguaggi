/* 
*	Calacolare il peso volumetrico di un pacco di 12x10x8
*/

#include<stdio.h>

int main(void){
	int lunghezza = 12;
	int altezza = 10;
	int profondita = 8;

	int volume = lunghezza * altezza * profondita;

	int peso = (volume + 165) / 166;

	printf("Le dimensioni del pacco sono: %dx%dx%d\n", lunghezza, altezza, profondita );
	printf("Il volume e': %d\n", volume);
	printf("Il peso è : %d\n", peso);
       	
	return 0;
	
} 
