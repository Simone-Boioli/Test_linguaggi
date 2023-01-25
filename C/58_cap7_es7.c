/**
*	Nome: 58_cap7_es7.c
*	Data: 07/05/2017	
*	Scopo:	modifica del es.6 del cap 3 che prende anche l'operazione tra le 2 frazioni
*	Autore:	Boioli Simone
*/

#include <stdio.h>

int main(void){

	int num1 = 0;  //numeratorore frazione 1
	int denom1 = 0; //denominatore frazione 1
	int num2 = 0; //numeratore frazione 2
	int denom2 = 0; //denominatore frazione 2
	int ris_num = 0;  //risultato numeratori
	int ris_denom = 0; //risultato denominatori

	char ch;  //operazione

	printf("Inserisci le due frazioni (a/bOPc/d): ");
    scanf("%d/%d%c%d/%d", &num1, &denom1, &ch, &num2, &denom2);

    switch(ch){
    	case '+': ris_num = (num1 * denom2) + (denom1 * num2);
    			  ris_denom = (denom2 * denom1);
    			  printf("la somma delle 2 frazioni e': %d/%d\n",ris_num, ris_denom);
    			  break;

    	case '-': ris_num = (num1 * denom2) - (denom1 * num2);
    			  ris_denom = (denom2 * denom1);
    			  printf("la sottrazione delle 2 frazioni e': %d/%d\n",ris_num, ris_denom);
    			  break;

    	case '*': ris_num = num1 * num2;
    			  ris_denom = denom1 * denom2;
    			  printf("La moltiplicazione tra le 2 frazioni e': %d/%d\n", ris_num, ris_denom);
    			  break;

    	case '/': ris_num = num1 * denom2;
    			  ris_denom = denom1 * num2;
    			  printf("La divisione tra le 2 frazioni e': %d/%d\n", ris_num, ris_denom);
    			  break;

    	default: printf("Operazione non valida");
    			 break;
    }

	return 0;
}