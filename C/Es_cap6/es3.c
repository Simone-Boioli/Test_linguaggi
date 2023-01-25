#include<stdio.h>

int main(void){
	int num; // m
	int den; // n 
	
	int resto;
	int MCD;

	printf("Inserisci una frazione: ");
	scanf("%d/%d", &num, &den);	

	if(num > den){
		while(den != 0){
			resto = num % den;
			num = den;
			den = resto;			
		}
		MCD = num;	
	}/*else{
		while(numer != 0){
			resto = denominatore % numeratore;
			denominatore = numeratore;
			numeratore = resto;
		}
		MCD = denominatore;
	}
	*/
	num = num /MCD;
	den = den / MCD;

	printf("La frazione minima e': %d/%d\n", num, den); 
	return 0;
}
