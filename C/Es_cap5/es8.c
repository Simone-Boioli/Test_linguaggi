#include<stdio.h>

int main(void){
	int ora; 
	int minuti;	

	int ora_mezz; //minuti dalla mezzanotte

	int h8_00 = 8 * 60;
	int h9_43 = (9 * 60) + 43;
	int h11_19 = (11 * 60) + 19;
	int h12_47 = (12 * 60) + 47;
	int h14_00 = (14 * 60);
	int h15_45 = (15 * 60) + 45;
	int h19_00 = (19 * 60);
	int h21_45 = (21 * 60) + 45;

	printf("Inserisci l'orario di partenza nel formato 24 ore (hh:mm):");
	scanf("%d:%d", &ora, &minuti);	

	ora_mezz = ora * 60 + minuti;

	if(ora_mezz < h8_00 && ora_mezz <= ((h8_00 + h9_43)/2)){
		printf("Orario partenza: 8:00 a.m.;\nOrario Arrivo: 10:16 a.m.\n"); 
	}else if(ora_mezz > ((h8_00 + h9_43)/2) && ora_mezz <= ((h9_43 + h11_19)/2)){
		printf("Orario partenza: 9:43 a.m.;\nOrario Arrivo: 11:52 a.m.\n");
	}else if(ora_mezz > ((h9_43 + h11_19)/2) && ora_mezz <= ((h11_19 + h12_47)/2)){
		printf("Orario partenza: 11:19 a.m.;\nOrario Arrivo: 1:31 p.m.\n");
	}else if(ora_mezz > ((h11_19 + h12_47)/2) && ora_mezz <= ((h12_47 + h14_00)/2)){
		printf("Orario partenza: 12:47 a.m.;\nOrario Arrivo: 3:00  p.m.\n");
	}else if(ora_mezz > ((h12_47 + h14_00)/2) && ora_mezz <= ((h14_00 + h15_45)/2)){
		printf("Orario partenza: 2:00 p.m.;\nOrario Arrivo: 4:08 p.m.\n");
	}else if(ora_mezz > ((h14_00 + h15_45)/2) && ora_mezz <= ((h15_45 + h19_00)/2)){
		printf("Orario partenza: 3:45 p.m.;\nOrario Arrivo: 5:55 p.m.\n");
	}else if(ora_mezz > ((h15_45 + h19_00)/2) && ora_mezz <= ((h19_00 + h21_45)/2)){
		printf("Orario partenza: 7:00 p.m.;\nOrario Arrivo: 9:20 p.m.\n");
	}else if(ora_mezz > ((h19_00 + h21_45)/2) && ora_mezz >= h21_45){
		printf("Orario partenza: 9:45 p.m.;\nOrario Arrivo: 11:58p.m.\b");
	}
		
	return 0;
}
