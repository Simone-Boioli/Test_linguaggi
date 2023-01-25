#include<stdio.h>

int main(void){
	float valore_prestito;
	float tasso_interesse;
	float pagamento_mensile;

	float fine_primo_mese;
	float fine_secondo_mese;
	float fine_terzo_mese;

	printf("Inserisci il valore del prestito: ");
	scanf("%f", &valore_prestito);

	printf("Inserisci il tasso d'interesse: ");
	scanf("%f", &tasso_interesse);

	printf("Inserisci il pagameto mensile: ");
	scanf("%f", &pagamento_mensile);

	fine_primo_mese = (valore_prestito - pagamento_mensile) + (valore_prestito * ((6 / 100) / 12));

	fine_secondo_mese = (fine_primo_mese - pagamento_mensile) + (valore_prestito * ((6 / 100) / 11));

	fine_terzo_mese = (fine_secondo_mese - pagamento_mensile) + (valore_prestito * ((6 / 100) / 10));

	printf("%.2f\n", fine_primo_mese);
	printf("%.2f\n", fine_secondo_mese);
	printf("%.2f\n", fine_terzo_mese);
	

	return 0;
}
