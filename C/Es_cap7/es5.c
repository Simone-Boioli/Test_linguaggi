#include<stdio.h>
#include<ctype.h>

int main(void){
	int count = 0;
	char c;

	printf("Inserisci la parola: ");
	c = getchar();

	while(c != '\n'){
		c = toupper(c);

		if(c=='A' || c=='E' || c=='I' || c=='L' || c=='N' || c=='O' || c=='R' || c=='S' || c=='T' || c=='U'){
			count = count++;
		}else if(c=='D' || c=='G'){
			count = count + 2;
		}else if(c=='B' || c=='C' || c=='M' || c=='P'){
			count = count + 3;
		}else if(c=='F' || c=='H' || c=='V' || c=='W' || c=='Y'){
			count = count + 4;
		}else if(c=='K'){
			count = count + 5;
		}else if(c=='J' || c=='X'){
			count = count + 8;
		}else if(c=='Q' || c=='Z'){
			count = count + 10;
		}

		c = getchar();
	}

	printf("Il valore totale e': %d\n", count);

	return 0;
}
