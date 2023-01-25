#include "date.h"
#include <iostream>

int main(){
	int giorno1, mese1, anno1;
	int giorno2, mese2, anno2;

	int giorni_trascorsi;
	
	
	///////////prima data/////////////
	//inserimento anno
	std::cout << "Inserisci l'anno della prima data: ";
	std::cin >> anno1;


	//inserimento mese
	std::cout << "Inserisci il mese della prima data: ";
	std::cin >> mese1;

	//controllo sul mese (compreso tra 1 e 12)
	if(mese1 < 1 || mese1 > 12){
		std::cerr << "Errore!!!!" << std::endl;
		
	}


	//inserimento giorno
	std::cout << "Inserisci il giorno della prima data: ";
	std::cin >> giorno1;
	

	//controllo del giorno
	if(giorno1 < 1 || giorno1 > 31){
		std::cerr << "Errore!!!! GIORNO NON VALIDO!!!!" << std::endl;
		return 2;
	}
		

	////////////seconda data////////////
	//inserimento anno
	std::cout << "Inserisci l'anno della seconda data: ";
	std::cin >> anno2;
	
	//inserimento mese
	std::cout << "Inserisci il mese della seconda data: ";
	std::cin >> mese2;

	//controllo sul mese (compreso tra 1 e 12)
	if(mese2 < 1 || mese2 > 12){
		std::cerr << "Errore!!!! MESE NON VALIDO!!!" << std::endl;
		return 2;
	}

	//inserimento del giorno

	std::cout << "Inserisci il giorno della seconda data: ";
	std::cin >> giorno2;

	
	//controllo del giorno
	if(giorno2 < 1 || giorno2 > 31){
		std::cerr << "Errore!!!! GIORNO NON VALIDO!!!!" << std::endl;
		return 2;
	}

	

	giorni_trascorsi = date_difference(anno1, mese1, giorno1, anno2, mese2, giorno2);

	std::cout << "I giorni trascorsi sono:" << giorni_trascorsi << std::endl;

	return 0;
}	