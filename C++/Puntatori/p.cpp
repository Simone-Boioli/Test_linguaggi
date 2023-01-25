#include<iostream>

int main(){
    int v= 100;

    std::cout<<"il valore di c e': " << v << std::endl;

    int *puntatore; //creo il punatore

    puntatore = &v;

    std::cout<<"il valore puntato dal puntatore è: " << *puntatore << std::endl;

    std::cout<<"---------------------------------------------------------------"<<std::endl;
    
    std::cout<<"il valore puntato dal puntatore è: " << puntatore << std::endl;


    int v2 = 1000;

    int *puntatore2;
    puntatore2 = &v2;

    std::cout<<"---------------------------------------------------------------"<<std::endl;
    std::cout<<"la differenza è: "<< puntatore2 - puntatore << std::endl;


    return 0;
}
