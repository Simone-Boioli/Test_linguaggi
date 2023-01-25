/**
*	Nome: 36_cap5_es9.c
*	Data: 01/30/2017	
*	Scopo:	Programma che chiede 2 date e indica quale si trova prima nel calendario
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int giorno1 = 0;
	int mese1 = 0;
	int anno1 = 0;

	int giorno2 = 0;
	int mese2 = 0;
	int anno2 = 0;

	printf("Inserisci la prima data (gg/mm/aaaa): ");
	scanf("%d/%d/%d", &giorno1, &mese1, &anno1);

	printf("Inserisci la seconda data (gg/mm/aaaa): ");
	scanf("%d/%d/%d", &giorno2, &mese2, &anno2);	


	if(anno1 < anno2){
		printf("%d/%d/%d è prima di %d/%d/%d\n", giorno1, mese1, anno1, giorno2, mese2, anno2);
	}
	else if(anno1 > anno2){
		printf("%d/%d/%d è prima di %d/%d/%d\n", giorno2, mese2, anno2, giorno1, mese1, anno1);
	} 
	else{
		if(mese1 < mese2){
			printf("%d/%d/%d è prima di %d/%d/%d\n", giorno1, mese1, anno1, giorno2, mese2, anno2);
		}
		else if(mese1 > mese2){
			printf("%d/%d/%d è prima di %d/%d/%d\n", giorno2, mese2, anno2, giorno1, mese1, anno1);
		}
		else{
			if(giorno1 < giorno2){
				printf("%d/%d/%d è prima di %d/%d/%d\n", giorno1, mese1, anno1, giorno2, mese2, anno2);
			}
			else if(giorno1 > giorno2){
				printf("%d/%d/%d è prima di %d/%d/%d\n", giorno2, mese2, anno2, giorno1, mese1, anno1);
			}
			else{
				printf("Le due date sono uguali\n");
			}
		}
	}

	return 0;
}