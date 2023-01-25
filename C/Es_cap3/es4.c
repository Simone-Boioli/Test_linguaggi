#include<stdio.h>

int main(void){
	int pref;
	int x; 
	int y; 

	printf("Inserisci il numero di cellulare [(xxx) xxx-xxxx]: ");
	scanf("(%d)%d-%d", &pref, &x, &y);

	printf("Il numero e': %.3d.%.3d.%.4d\n", pref, x, y);

	return 0;
}
