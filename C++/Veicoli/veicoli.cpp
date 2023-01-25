#include <iostream>

using namespace std;

class veicolo{
    public:
	    virtual void numRuote() = 0;  //funzione virtuale pura(rende la classe astratta)
};

class automobile : public veicolo{
    public:
	    void numRuote(){
		cout << "Automobile --> 4 ruote" << endl;
	    }
};

class furgone : public veicolo{
    public:
	    void numRuote(){
		cout << "Furgone --> 4 ruote" << endl;
	    }	
};

class moto : public veicolo{
    public:
	    void numRuote(){
		cout << "Moto --> 2 ruote" << endl;
	    }
};

int main(){
    veicolo* veicoli_a_motore[3] = {new automobile, new furgone, new moto};

    for(unsigned int i = 0; i < 3; ++i){
	veicoli_a_motore[i]->numRuote();     
    }
}
