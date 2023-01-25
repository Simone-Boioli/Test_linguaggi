#include "animale.h"
#include <iostream>
#include <cstring>

animale::animale(){
    strcpy(specie, " ");
    std::cout << "costruttore classe animale" << std::endl;
}

animale::~animale(){
    std::cout << "distruttore classe animale" << std::endl;
}

void animale::mangia(){
    std::cout << "invocato metodo mangia()" << std::endl;
}

void animale::beve(){
    std::cout << "invocato metodo beve()" <<std::endl;
}

void animale::ottieni_dati(){
    std::cout << "Inserisci l'età dell'animale: " << std::endl;
    std::cin >> animale::eta; 
    std::cout << std::endl;

    std::cout << "Inserisci il sesso dell'animale (M o F): " << std::endl;
    std::cin >> animale::sesso; 
    std::cout << std::endl;
}
