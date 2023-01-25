#include<stdio.h>

int main(void){
	int a, b, c, d, e, f, g, h, i, l, m, n, o, p, q, r;
	int somma_riga1, somma_riga2, somma_riga3, somma_riga4;
	int somma_col1, somma_col2, somma_col3, somma_col4; 
	int somma_d1, somma_d2;

	printf("Inserisci i numeri da 1 a 16 in ordine casuale: ");
	scanf("%d%d%d%d%d%d%d%d%d%d%d%d%d%d%d%d", 
		&a, &b, &c, &d, &e, &f, &g, &h, &i, &l, &m, &n, &o, &p, &q, &r);

	printf("%d\t%d\t%d\t%d\n", a, b, c, d);
	printf("%d\t%d\t%d\t%d\n", e, f, g, h);
	printf("%d\t%d\t%d\t%d\n", i, l, m, n);
	printf("%d\t%d\t%d\t%d\n", o, p, q, r);

	somma_riga1 = a + b + c + d;
	somma_riga2 = e + f + g + h;
	somma_riga3 = i + l + m + n;	
	somma_riga4 = o + p + q + r;

	somma_col1 = a + e + i + o; 
	somma_col2 = b + f + l + p;
	somma_col3 = c + g + m + q;
	somma_col4 = d + h + n + r;

	somma_d1 = a + f + m + r;
	somma_d2 = d + g + l + o;

	printf("\nLa somma delle righe e': %d %d %d %d\n", somma_riga1, somma_riga2, somma_riga3, somma_riga4);
	printf("La somma delle colonne e': %d %d %d %d\n", somma_col1, somma_col2, somma_col3, somma_col4);
	printf("La somma delle diagonali e': %d %d\n", somma_d1, somma_d2);

	return 0;
}
