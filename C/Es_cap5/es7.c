#include <stdio.h>

int main(void){
	int a, b, c, d;
	int max;
	int min;
	
	printf("Inserisci 4 numeri interi: ");
	scanf("%d %d %d %d", &a, &b, &c, &d);

	if(a < b){
		max = b;
		min = a;
	}else{
		max = a;
		min = b;
	} 
	
	if(c < min){
		min = c;	
	}else if(c > max){
		max = c;
	}

	if(d < min){
		min = d;
	}else if ( d > max){
		max = d;
	}


	printf("il max e': %d, il min e': %d\n", max, min);
	return 0;
}
