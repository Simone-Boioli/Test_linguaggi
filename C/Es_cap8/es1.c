#include <stdio.h>

#define NUM 6
#define NUMBER 10

int main(void){
   int n;
   int numeri[NUM];
   int volte[NUMBER];

   printf("Inserisci un numero di 6 cifre: ");
   
   int i;
   for(i = 0; i < NUM; i++){
	scanf("%d", &numeri[i]);
   } 
  /* 
   //riempio il vettore volte
   int a;
   for(i = 0; i < NUM; i++){
	a = numeri[i];
	volte[a] ++;
   } 

   //stampa i valori ripetuti
   for(i = 0; i < NUMBER; i++){
	if(volte[i] != 0){
	    printf("%d, ", volte[i]);
	}
   } 
*/
   return 0;
    
}
     

