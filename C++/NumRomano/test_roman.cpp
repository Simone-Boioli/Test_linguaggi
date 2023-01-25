#include "roman.h"
#include <iostream>

int main(){
	int n;
	std::cout << "Inserisci un numero:"	<< std::endl;
	std::cin >> n;

	if(n > 0 && n <= 3999){
		print_roman(n);
		std::cout << std::endl;
	}else{
		std::cerr <<" Errore!!! numero non valido!!!!" <<std::endl;
		return 2;
	}

	return 0;

}