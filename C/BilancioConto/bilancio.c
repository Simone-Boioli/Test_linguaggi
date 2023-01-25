#include<stdio.h>

int main(void){
	float conto = 0;
	int scelta; 
	
	float accredito;
	float addebito;

	printf("///////BILANCIO CONTO///////\n");
	printf("Inserisci: 0->cancella conto, 1->accredi, 2->addebita, 3->situazione conto, 4->exit\n\n");
	
	while(1){  //ciclo infinito
		printf("Inserisci la scelta: ");
		scanf("%d", &scelta);

		switch(scelta){
			case 0: 
				conto = 0.0f;
				printf("Conto Azzerato!!!\n");
				break;
			case 1:
				printf("Inserisci quanto vuoi accreditare sul conto: ");
				scanf("%f", &accredito);
				
				conto = conto + accredito;
				break;
			case 2:
				printf("Inserisci quanto vuoi addebitare sul conto: ");
				scanf("%f", &addebito);
				
				conto = conto - addebito;
				break;	
			case 3:
				printf("La situazione del conto e' di: $%.2f\n", conto);
				break;
			case 4:
				goto fine; 

		} 
	}

	fine:
	return 0;

}
