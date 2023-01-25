#include<stdio.h>

int main(void){
	int prefisso_gs1;
	int id_gruppo;
	int id_editore;
	int num_libro;
	int cifra_controllo;

	printf("Enter ISBN: ");
	scanf("%d-%d-%d-%d-%d", &prefisso_gs1, &id_gruppo, &id_editore, &num_libro, &cifra_controllo);

	printf("\nPrefisso Gs1: %d\n", prefisso_gs1);
	printf("Identificativo gruppo: %d\n", id_gruppo);
	printf("Codice Editore: %d\n", id_editore);
	printf("Libro n°: %d\n", num_libro);
	printf("Cifra controllo: %d\n", cifra_controllo);

	return 0; 
}
