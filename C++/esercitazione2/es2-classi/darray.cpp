#include "darray.h"
#include <iostream>
#include <cassert>


//costruttore ---> allocazione memoria
darray::darray(){
    buffer = 0;
    size = 0;

    std::cout << "darray::darray" << std::endl;
}

//costruttore secondario
darray::darray(unsigned int size){
    this->size = 0;
    buffer = 0;
    resize(size);
    
    std::cout << "darray::darray(unsigned int size)" << std::endl;
}

//costruttore secondario
darray::darray(unsigned int size, int value){
    this->size = 0;
    buffer = 0;
    resize(size, value);
    std::cout << "darray::darray(unsigned int size, int value)" << std::endl;
}

//costruttore di copia
darray::darray(const darray &other){
    this->size = 0;
    this->buffer = 0;

    resize(other.size);

    for(unsigned int i = 0; i < other.size; ++i){
	buffer[i] = other.buffer[i];
    }

    std::cout << "darray::darray(const &other)" << std::endl;
    
}


//distruttore ---> dellocazione memoria
darray::~darray(){
    delete[] buffer;
    buffer = 0;
    size = 0;

    std::cout << "darray::~darray" << std::endl;
}



darray& darray::operator=(const darray &other){      //////
    //controllo per l'autoassegnamento... a=a
    if(this != &other){                              /////  DA INSERIRE SEMPRE LE 3 RIGHE
	resize(other.size);

	for(unsigned int i = 0; i < other.size; ++i){
	    buffer[i] = other.buffer[i];
	}
    }

    std::cout<<"darray::operator=(conts darray &other)"<<std::endl;

    return *this;                                    /////
}


void darray::resize(unsigned int size){
    if(buffer != 0){
	delete[] buffer;
	buffer = 0;
	this->size = 0;
    }
	
    buffer = new int[size];
    this->size = size;
}


void darray::resize(unsigned int size, int value){
    resize(size);
    for(unsigned int i = 0; i < size; ++i){
	buffer[i] = value;
    }
}


void darray::print(){
    for(unsigned int i = 0; i < size; ++i){
	std::cout << buffer[i] << std::endl;
    } 
}

unsigned int darray::getSize(){
    return this->size;
}

int darray::getValue(unsigned int index){

    assert(index<size);  //asserzione 
        
    return buffer[index];
}

void darray::setValue(unsigned int index, int value){
    
    assert(index<size);

    buffer[index] = value;
}

