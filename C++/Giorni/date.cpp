#include "date.h"

//costante globale che contiene il n di giorni per mese
static const int giorni_mese[12] = {31,28,31,30,31,30,31,31,30,31,30,31};

int date_difference(int anno1, int mese1, int giorno1, int anno2, int mese2, int giorno2){
	if(anno1 > anno2 || (anno1 == anno2 && (mese1 > mese2 || (mese1 == mese2 && giorno1 > giorno2)))){
		return -date_difference(anno2, mese2, giorno2, anno1, mese1, giorno1);
	}

	if(anno1 < anno2){
		return 365* (anno2 -anno1) + date_difference(anno1, mese1, giorno1, anno1, mese2, giorno2);
	}

	int ret = giorno2 - giorno1;
	for(int i = mese1; i < mese2; ++i){
		ret += giorni_mese[i - 1];
	}

	return ret;
}