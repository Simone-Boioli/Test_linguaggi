#include <iostream>


struct dynamic_buffer{
	unsigned int size;
	int *buffer;
};



/**
 *  metodo che stampa i valori nel buffer
 */

void stampa_buffer(const dynamic_buffer &b2){  //il dato passato non è da modificare
	for(unsigned int i = 0; i < b2.size; ++i){
	    std::cout << b2.buffer[i] << std::endl;  //puntatore[i] -> va all'i-esimo el. puntato dal puntatore
	}
}


/**
 *  metodo per inizializzare il buffer
 */

void inizializza_buffer(dynamic_buffer *b2){
    if(b2 != 0){  
	b2->size = 0; 
	b2->buffer = 0;
    }
}


void dealloca_buffer(dynamic_buffer &b2){
    if(b2.buffer != 0){
	delete[] b2.buffer;
	inizializza_buffer(&b2);
    }
}
/**
 *  metodo che alloca il buffer
 */
void alloca_buffer(dynamic_buffer &b2, unsigned int size, int value){
    dealloca_buffer(b2);
	
    b2.buffer = new int[size]; 
    b2.size = size;

    for(int i = 0; i < size; ++i){
	b2.buffer[i] = value;
    }
}


/**
 *  main
 */

int main(){
    dynamic_buffer b;  //allocata nello stack

    inizializza_buffer(&b);  //passo il puntatore a b

    alloca_buffer(b, 10, 123);

    stampa_buffer(b);

    dealloca_buffer(b);

    return 0;
}
