#include<stdio.h>

#define N 10 //numeri da ordinare

void quicksort(int a[], int low, int high); //dichiarazione del metodo di ordinamento
int partizionamento(int a[], int low, int high); //dichiarazione del metodo di partizionamento

/**
 *  MAIN
 */
int main(){
    int a[N]; //array elementi
    int i;
    

    printf("Inserisci gli elementi da ordinare: ");
    for(i = 0; i < N; i++){
	scanf("%d", &a[i]);
    }

    quicksort(a, 0, N-1);

    printf("In Ordine: ");
    for(i = 0; i < N; i++){
	printf("%d", a[i]);
    }
    printf("\n");

    return 0;
}


/**
 *  QUICKSORT
 */
void quicksort(int a[], int low, int high){
    int middle;

    if(low >= high){  //quando gli indici si incrociano finisce il metodo
	return;
    }

    middle = partizionamento(a, low, high);
    quicksort(a, low, middle-1);  //chiamata ricorsiva con metà -1 elementi
    quicksort(a, middle, high); //chiamata ricorsiva con la seconda metà

}

/**
 * PARTIZIONAMENTO
 */
int partizionamento(int a[], int low, int high){
    int elemento = a[low]; //prendo il primo elemento

    for(;;){
	while(low < high && elemento <= a[high]){
	    high --;
	}
	if(low >= high){
	    break;
	}
	a[low++] = a[high];



	while(low < high && a[low] <= elemento){
	    low++;
	}
	if(low >= high){
	    break;
	}
	a[high--] = a[low];
    }

    a[high] = elemento;
    return high;
}




