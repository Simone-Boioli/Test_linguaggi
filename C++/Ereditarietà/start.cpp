#include "cane.h"
#include <iostream>

int main(){
    cane c;
    
    c.ottieni_dati();
    
    c.stampa_dati();

    std::cout << std::endl;
    
    c.esegui_azioni();
    
    std::cout << std::endl;

	
    return 1;
}
