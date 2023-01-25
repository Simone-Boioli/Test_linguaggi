#include<stdio.h>

int main(void){
	double ris;
	double a;
	char op;
	double b;
	double c;

	printf("Inserisci una espressione: ");
	
	scanf("%lf", &a);	
	op = getchar();	
	scanf("%lf", &b);
	
	if(op == '+'){
		ris = a + b;
	}else if(op == '-'){
		ris = a - b;
	}else if(op == '*'){
		ris = a * b;
	}else if(op == '/'){
		ris = a / b;
	}

	op = getchar();

	while(op != '\n'){
		scanf("%lf", &c);
		
		if(op == '+'){
			ris = ris + c;
		}else if(op == '-'){
			ris = ris - c;
		}else if(op == '*'){
			ris = ris * c;
		}else if(op == '/'){
			ris = ris / c;
		}
		
		op = getchar();
	}

	printf("Il risultato e': %.1lf\n", ris);
	

	return 0;	
}
