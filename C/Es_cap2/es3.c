#include<stdio.h>

int main(void){
	float raggio;
	float volume;

	printf("Inserisci la misura del raggio: ");
	scanf("%f", &raggio);

	volume = (4.0f / 3.0f) * 3.14 * (raggio*raggio*raggio);

	printf("Il volume della sfera di raggio %.2f e': %.2f\n", raggio, volume);

	return 0;
}
