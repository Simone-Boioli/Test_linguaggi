/**
*	Nome: 87_cap11_es2.c
*	Data: 29/11/2017	
*	Scopo:	Programma che chiede un orario di volo e mostra quello più vicino
*	Autore:	Boioli Simone
*/

#include <stdio.h>

//PROTOTIPI
void trova_orario(int orario, int *partenza, int *arrivo);

int main(void){

	int ora = 0;
	int minuti = 0;
	int min_mez = 0; //minuti dalla mezzanotte

	int orario_partenza = 0;
	int orario_arrivo = 0;

	int ora_part, min_part;
	int ora_arr, min_arr;

	printf("Inserisci l'ora nel formato 24ore (hh:mm): ");
	scanf("%d:%d", &ora, &minuti);

	min_mez = (ora * 60) + minuti;

	trova_orario(min_mez, &orario_partenza, &orario_arrivo);

	ora_part = orario_partenza / 60;
	ora_arr = orario_arrivo / 60;

	min_part = orario_partenza - (ora_part * 60);
	min_arr = orario_arrivo - (ora_arr * 60);

	printf("Orario partenza %d:%d - orario arrivo %d:%d\n", ora_part, min_part, ora_arr, min_arr);

	return 0;
}


void trova_orario(int orario, int *partenza, int *arrivo){
	if(orario < 531){
		*partenza = 480; //8:00
		*arrivo = 616; //10:16	
	}
	else if(orario < 631){
		*partenza =  583;//9:43
		*arrivo = 712;//11:52
	}
	else if(orario < 723){
		*partenza =  679;//11:19
		*arrivo = 811;//13:31
	}
	else if(orario < 803){
		*partenza = 767 ;//12:47
		*arrivo = 931;//15:31
	}
	else if(orario < 892){
		*partenza =  840;//14:00
		*arrivo = 968;//16:08
	}
	else if(orario < 1042){
		*partenza =  945;//15:45
		*arrivo = 1075;//17:55
	}
	else if(orario < 1222){
		*partenza =  1140;//19:00
		*arrivo = 1280;//21:20
	}
	else if(orario <= 1305){
		*partenza =  1305;//21:45
		*arrivo = 718;//11:58
	}
	else{
		*partenza =  480;//8:00
		*arrivo = 616;//10:16
	}

}