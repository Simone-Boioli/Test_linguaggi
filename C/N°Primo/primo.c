#include<stdio.h>
#include<stdbool.h>


bool primo(int n){
    int divisore;

    if(n <= 1){
	return false;
    }

    for(divisore = 2; divisore*divisore <= n; divisore++){
	if(n % divisore == 0){
	    return false;
	}
    }	

    return true;
}

int main(void){
    int n;

    printf("Inserisci un numero intero: ");
    scanf("%d", &n);

    if(primo(n)){
	printf("Primo\n");
    }else{
	printf("Non Primo\n");
    }	    

    return 0;
}
