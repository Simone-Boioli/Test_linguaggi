/**
*	Nome: 42_bilancio_conto.c
*	Data: 03/27/2017	
*	Scopo:	Programma interattivo con menu per fare diverse azioni su un conto
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	float bilancio = 0.0f;
	float credito = 0.0f;
	float debito = 0.0f;

	int comando = 100;
	int scelta = 100;

	printf("------ BILANCIO DI UN CONTO ------\n");
	printf("Comandi: 0=azzera conto, 1=credito, 2=debito, 3=bilancio, 4=exit\n\n");

	for(;;){
		printf("Inserisci il comando:\n");
		scanf("%d", &comando);

		switch(comando){
			case 0:
				//azzeramento
				printf("Sei sicuro di voler azzerare il conto?\n");
				printf("0 -> NO,  1 -> SI\n");
				scanf("%d", &scelta);

				if(scelta == 0){
					break;	
				}else if (scelta == 1){
					bilancio = 0.0f;
					printf("Conto Azzerato\n");
					break;	
				}else {
					printf("SCELTA NON VALIDA\n");
					break;
				}
				
			case 1:
				//credito
				printf("Inserisci il credito: \n");
				scanf("%f", &credito);
				bilancio = bilancio + credito; 
				break;

			case 2:
				//debito
				printf("Inserisci il debito: ");
				scanf("%f", &debito);

				if((bilancio - debito) < 0){
					printf("Bilancio negativo. Sei sicuro di voler debitare questa cifra? 0 -> NO, 1 -> SI\n");
					scanf("%d", &scelta);

					if(scelta == 0){
						break;		
					}else if(scelta == 1){
						bilancio = bilancio - debito;
						printf("Valore Addebitato.\n");
						break;
					}else{
						printf("SCELTA NON VALIDA\n");
						break;
					}
				}else{
					bilancio = bilancio - debito;
					printf("Valore Addebitato.\n");
					break;
				}

			case 3:
				//bilancio
				printf("Il bilancio e' di: %.2f€\n", bilancio);
				break;

			case 4:
				//exit
				return 0;
			default:
				printf("COMANDO NON VALIDO\n");

		}

	}
	

	return 0;
}