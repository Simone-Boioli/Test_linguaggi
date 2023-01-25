#include "cane.h"
#include <iostream>
#include <string>
#include <cstring>

using namespace std;

cane::cane(){
    cout << "costruito un oggetto cane" << endl;
    strcpy(specie, "cane");   
}

cane::~cane(){
    cout << "distrutto un oggetto cane" <<endl;
}

void cane::abbaia(){
    cout << "invocato il metodo abbaia" << endl;
}

void cane::stampa_dati(){
    cout << "La specie dell'animale è: " << specie << endl;
    cout << "L'età dell'animale è: " << eta << endl;
    cout << "Il sesso dell'animale è: " << sesso << endl;
}

void cane::esegui_azioni(){
    mangia();
    beve();
    abbaia();
}

