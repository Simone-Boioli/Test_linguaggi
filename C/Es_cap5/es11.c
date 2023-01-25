#include<stdio.h>

int main(void){
	int decina;
	int unita;

	printf("Inserisci un numero a due cifre: ");
	scanf("%1d%1d", &decina, &unita);

	if(decina == 1){
		switch(unita){
			case 0: printf("Dieci\n"); break;
			case 1: printf("Undici\n"); break;
			case 2: printf("Dodici\n"); break;
			case 3: printf("Tredici\n"); break;
			case 4: printf("Quattordici\n"); break;
			case 5: printf("Quindici\n"); break;
			case 6: printf("Sedici\n"); break;
			case 7: printf("Diciassette\n"); break;
			case 8: printf("Diciotto\n"); break;
			case 9: printf("Diciannove\n"); break;
		}
	}else{
		switch(decina){
			case 2: printf("Venti"); break;
			case 3: printf("Trenta"); break;
			case 4: printf("Quaranta"); break;
			case 5: printf("Cinquanta"); break;
			case 6: printf("Sessanta"); break;
			case 7: printf("Settanta"); break;
			case 8: printf("Ottanta"); break;
			case 9: printf("Novanta"); break;
		}

		switch(unita){
			case 0: printf("\n"); break;
			case 1: printf("-uno\n"); break;
			case 2: printf("-due\n"); break;
			case 3: printf("-tre\n"); break;
			case 4: printf("-quattro\n"); break;
			case 5: printf("-cinque\n"); break;
			case 6: printf("-sei\n"); break;
			case 7: printf("-sette\n"); break;
			case 8: printf("-otto\n"); break;
			case 9: printf("-nove\n"); break;
		}
	
	}	



	return 0;
}
