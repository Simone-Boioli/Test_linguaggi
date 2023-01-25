#include<stdio.h>
void stampa_val(int v){
    printf("Il valore e': %d\n", v);
}

int main(void){
    int i;

    for(i = 10; i >= 0; i--){
	stampa_val(i);
    } 

    return 0;

}
