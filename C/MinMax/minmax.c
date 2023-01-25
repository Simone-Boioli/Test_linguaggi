#include <stdio.h>

#define N 4//numeri nel vettore

void max_min(int a[], int n, int *max, int *min); //prototipo

int main(void){
    int b[N];  //vettore di n elementi
    int big;
    int small;

    printf("Inserisci i %d numeri: ", N);
    for(int i = 0; i < N; i++){
	scanf("%d", &b[i]);
    }

    max_min(b, N, &big, &small);

    printf("il più grande è: %d\n", big);
    printf("il più piccolo e': %d\n", small);

    return 0;
}
    
void max_min(int a[], int n, int *max, int *min){
    *max = *min = a[0]; //inizializzazione puntatori

    for(int i = 1; i < n; i++){
	if(a[i] > *max){
	    *max = a[i];
	}else if(a[i] < *min){
	    *min = a[i];
	}
    } 
}
