#include<stdio.h>

int main(void){
	int voto;

	printf("Inserisci il voto in numero: ");
	scanf("%d", &voto);

	if(voto < 0 || voto > 100){
		printf("Voto ERRATO\n");
	}else{
		voto = voto / 10;  //per prendere la decina

		switch(voto){
			case 10:
			case 9:
				printf("Voto in lettera: A\n");
				break;
			case 8:		
				printf("Voto in lettera: B\n");
				break;
			case 7:
				printf("Voto in lettera: C\n");
				break;
			case 6:
				printf("Voto in lettera: D\n");
				break;
			case 5:
			case 4:
			case 3:	
			case 2:
			case 1:
			case 0: printf("Voto in lettera: F\n");	
				break;
		}
	}
	
	return 0;
}
