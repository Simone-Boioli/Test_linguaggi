#include<stdio.h>

int main(void){
	int raggio = 10;
	
	float  volume = (4.0f / 3.0f ) * 3.14 * (raggio*raggio*raggio);

	printf("Il volume della sfera di raggio %d e': %.2f\n", raggio, volume);  

	return 0;
}
