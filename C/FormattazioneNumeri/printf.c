#include <stdio.h>

int main(void){
	int i = 40; 
	float x = 839.21f;

	printf("default:|%d\a|, m=5:|%5d|, m=5 allinamento sx:|%-5d|, m= 5 p = 3:|%5.3d|\n", i, i, i, i);
	printf("virgola fissa: |%10.3f|, formato esponenziale:|%10.3e|, automatico:|%10g|\n", x, x, x);

	return 0;

}
