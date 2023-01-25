#include <stdio.h>

void overflow_function(char *str){
    char buffer[20];

    strcpy(buffer, str); //funzione che copia str nel buffer
}

int main(){
    char big_string[128];
    int i;

    for(i = 0; i < 128; i++){
	    big_string[i] = 'A';
    }

    overflow_function(big_string);

    return 0;
}
