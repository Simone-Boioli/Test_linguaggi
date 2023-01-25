#include <stdio.h>

int day_of_years(int mese, int giorno, int anno);

int main(){
    int giorno;
    int mese;
    int anno;

    printf("Inserisci la data (mese/giorno/anno): ");
    scanf("%d/%d/%d", &mese, &giorno, &anno);

    int day = day_of_years(mese, giorno, anno);

    printf("E' il %d° giorno dell'anno\n", day);

    return 0;
}   


int day_of_years(int mese, int giorno, int anno){
    int g;

    switch(mese){
	case 1:
	    g = giorno;
	    break;
    
	case 2:
	    g = 31 + giorno;
	    break;

	case 3:
	    g = 59 + giorno;
	    break;
	
	case 4:
	    g = 90 + giorno;
	    break;
	
	case 5:
	    g = 120 + giorno;
	    break;
	
	case 6:
	    g = 151 + giorno;
	    break;
	
	case 7:
	    g = 181 + giorno;
	    break;
	
	case 8:
	    g = 212 + giorno;
	    break;
	
	case 9:
	    g = 243 + giorno;
	    break;
	
	case 10:
	    g = 273 + giorno;
	    break;
	
	case 11:
	    g = 304 + giorno;
	    break;
	
	case 12:
	    g = 334 + giorno;
	    break;
    }
    return g;
}
