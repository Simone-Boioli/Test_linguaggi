#include<stdio.h>
#include<math.h>

int main(void){
	int x;
	double y1 = 1; //vecchio valore di y
	double y2 ; //nuovo valore
	double div;
	double media;

	printf("Inserisci un numero positivo: ");
	scanf("%d", &x);
	
	div = x/y1;
	media = (y1 + div) / 2;
	y2 = media;
	

	while(fabs(y1-y2) > (0.00001 * y2)){
		y1 = y2;
		div = x/y1;
		media = (y1 + div) / 2;
		y2 = media;
	}

	printf("La radice di %d e': %.5lf\n", x, y2);

	return 0;
}
