#include "conv.h"
#include <iostream>

//costruttore
Conversione::Conversione (void){
    std::cout << "Inizio Conversione" << std::endl;

    valore_lira = new double (0);  //alloco e inizializzo nello heap la variabile valore_lira
    valore_euro = 0.0; //inizializzo la variabile valore_euro
}

//distruttore
Conversione::~Conversione (void){
    std::cout << "Fine della Conversione" <<std::endl;
    delete valore_lira;
}

//metodo ottieni valore
void Conversione::ottieni_valore(){
    std::cout << "Inserisci il valore in lire: ";
    std::cin >> *valore_lira;
}

double Conversione::converti_lire_in_euro(){
	double ris;
	ris =  *valore_lira / 1936.27;
	return ris;
}

int main(){
    Conversione c;
    c.ottieni_valore();
    c.valore_euro = c.converti_lire_in_euro();

    std::cout << *(c.valore_lira) << " lire = a " << c.valore_euro << " euro." << std::endl;

    return 0;
}
