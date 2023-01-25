#include<stdio.h>

int main(void){
	int num_oggetti;
	float prezzo_oggetto;
	int mese, giorno, anno;

	printf("Inserisci numero oggetti: ");
	scanf("%d", &num_oggetti);

	printf("Inserisci il prezzo per oggetto: ");
	scanf("%f", &prezzo_oggetto);

	printf("Inserisci la data dell'acquisto (mm/dd/yyyy): ");
	scanf("%d/%d/%d", &mese, &giorno, &anno);

	printf("Oggetti\tPrezzo\tData\n");
	printf("       \toggetto\tacquisto\n");
	printf("%d%10.2f%4.2d/%.2d/%d\n", num_oggetti, prezzo_oggetto, mese, giorno, anno);
        
	return 0;
	
}
