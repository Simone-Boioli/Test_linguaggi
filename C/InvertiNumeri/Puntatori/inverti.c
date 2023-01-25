#include <stdio.h>

#define N 5

int main(void){
    int a[N];
    int *p; //puntatore

    printf("Inserisci %d numeri: ", N);
    for(p = a; p < a + N; p++){
	scanf("%d", p);
    }    

    printf("In ordine inverso: ");

    inverti(a);

    printf("\n");

    return 0;
}

void inverti(int v[]){
    int *puntatore;

    for(puntatore = (v+N)-1; puntatore >= v; puntatore--){
	printf("%d ", *puntatore); 
    }
}
