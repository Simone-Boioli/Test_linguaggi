#include<stdio.h>

int main(void){
	int giorno1, giorno2;
	int mese1, mese2;
	int anno1, anno2;

	printf("Inserisci la prima data (mm/dd/yyyy): ");
	scanf("%d/%d/%d", &mese1, &giorno1, &anno1);

	
	printf("Inserisci la seconda data (mm/dd/yyyy): ");
	scanf("%d/%d/%d", &mese2, &giorno2, &anno2);

	if(anno1 < anno2){
		printf("La data %d/%d/%d si trova prima di %d/%d/%d.\n", mese1, giorno1, anno1, mese2, giorno2, anno2); 
	}else if(anno1 == anno2){
		if(mese1 < mese2){		
			printf("La data %d/%d/%d si trova prima di %d/%d/%d.\n", mese1, giorno1, anno1, mese2, giorno2, anno2); 
		}else if(mese1 == mese2){
			if(giorno1 < giorno2){
				printf("La data %d/%d/%d si trova prima di %d/%d/%d.\n", mese1, giorno1, anno1, mese2, giorno2, anno2); 
			}else if(giorno1 == giorno2){
				printf("Le date sono uguali!!!!!\n");
			}else{
				printf("La data %d/%d/%d si trova prima di %d/%d/%d.\n", mese2, giorno2, anno2, mese1, giorno1, anno1); 
			}
		}else{
			printf("La data %d/%d/%d si trova prima di %d/%d/%d.\n", mese2, giorno2, anno2, mese1, giorno1, anno1); 
		}
	}else{
		printf("La data %d/%d/%d si trova prima di %d/%d/%d.\n", mese2, giorno2, anno2, mese1, giorno1, anno1); 
	}

	return 0;
}
