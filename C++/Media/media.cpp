#include<iostream>

int main(){
    int n; //numeri inseriti dall'utente
    int somma = 0;
    int media;

    std::cout << "Inserici con quanti numeri voi fare la media: " << std::endl;
    std::cin >> n;

    std::cout << "Inserici i valori: " << std::endl;
    
    int m = n;
    
    while(m != 0){
	int v;
	std::cin >> v;

	somma = somma + v;

	m--;
    }

    media = somma / n;

    std::cout << "La media e':" << media << std::endl;

    

    return 0;
}
