#include <iostream>

int main(int argc, char *argv[]){
    std::cout << "Path eseguibile: " << argv[0] << std::endl;

    for(int i = 1; i < argc; i++){
	std::cout << "Parametro [" << i << "]: " << argv[i] << std::endl;
    }	

    return 0;
}
