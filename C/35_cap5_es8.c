/**
*	Nome: 35_cap5_es8.c
*	Data: 01/30/2017	
*	Scopo:	Programma che chiede un orario di volo e mostra quello più vicino
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int ora = 0;
	int minuti = 0;
	int min_mez = 0; //minuti dalla mezzanotte


	printf("Inserisci l'ora nel formato 24ore (hh:mm): ");
	scanf("%d:%d", &ora, &minuti);

	min_mez = (ora * 60) + minuti;

	if(min_mez < 531){
		printf("Orario partenza 8:00am - orario arrivo 10:16am\n");
	}
	else if(min_mez < 631){
		printf("Orario partenza 9:43am - orario arrivo 11:52am\n");
	}
	else if(min_mez < 723){
		printf("Orario partenza 11:19am - orario arrivo 1:31pm\n");
	}
	else if(min_mez < 803){
		printf("Orario partenza 12:47pm - orario arrivo 3:31pm\n");
	}
	else if(min_mez < 892){
		printf("Orario partenza 2:00pm - orario arrivo 4:08pm\n");
	}
	else if(min_mez < 1042){
		printf("Orario partenza 3:45pm - orario arrivo 5:55pm\n");
	}
	else if(min_mez < 1222){
		printf("Orario partenza 7:00pm - orario arrivo 9:20pm\n");
	}
	else if(min_mez <= 1305){
		printf("Orario partenza 9:45pm - orario arrivo 11:58pm\n");
	}
	else{
		printf("Orario partenza 8:00am - orario arrivo 10:16am\n");
	}



	return 0;
}