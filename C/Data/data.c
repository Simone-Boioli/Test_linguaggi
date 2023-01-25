#include<stdio.h>

int main(void){
	int mese;
	int giorno;
	int anno;

	printf("Inserisci la data nel formato mese/giorno/anno: ");
	scanf("%d/%d/%d", &mese, &giorno, &anno);

	printf("Il giorno inserito è: %d", giorno);

	switch(mese){
		case 1:
			printf(" Gennaio");
			break;
		case 2:
			printf(" Febbraio");
			break;
		case 3:
			printf(" Marzo");
			break;
		case 4: 
			printf(" Aprile");
			break;
		case 5:
			printf(" Maggio");
			break;
		case 6:
			printf(" Giugno");
			break;
		case 7:
			printf(" Luglio");
			break;
		case 8:
			printf(" Agosto");
			break;
		case 9:
			printf(" Settembre");
			break;
		case 10:
			printf(" Ottobre");
			break;
		case 11:
			printf(" Novembre");
			break;
		case 12:
			printf(" Dicembre");
			break;
	}

	printf(" %d\n", anno);

	return 0;
}
