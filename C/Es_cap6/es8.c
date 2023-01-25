#include<stdio.h>

int main(void){
	int num_giorni;
	int giorno_partenza; //indica il giorno di partenza (1=lunedi...7=domenica)

	int giorno;

	printf("Inserisci il numero di giorni in un mese: ");
	scanf("%d", &num_giorni);

	printf("Inserisci il giorno di partenza (1->lunedì...7->domenica): ");
	scanf("%d", &giorno_partenza);

	for(giorno = 1; giorno < giorno_partenza; giorno++){
		printf("   ");
	}

	for(int i = 1; i <= num_giorni; i++){
		printf("%3d", i);
		if((giorno_partenza + i - 1) % 7 == 0){
			printf("\n");
		}
	}
	printf("\n");
	
	return 0;	
}
