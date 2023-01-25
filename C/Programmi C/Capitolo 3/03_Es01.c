#include <stdio.h>

int main(void)
{
	int giorno = 0;
	int mese = 0;
	int anno = 0;

	printf("inserisci una data nella forma (gg/mm/aaaa): ");
	scanf("%d/%d/%d", &giorno, &mese, &anno);

	printf("La tua data e': %2d%2d%d\n", giorno, mese, anno);

	return 0;
}