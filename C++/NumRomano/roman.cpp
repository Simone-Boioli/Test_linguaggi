#include "roman.h"
#include <iostream>

/**
* Funzione di supporto
*
* @param digit cifra da codificare
* @param s1 simbolo inferiore
* @param s2 simbolo di mezzo
* @param s3 simbolo superiore
*
*/
static void print_roman_helper(int digit, char s1, char s2, char s3){
	switch(digit){
		case 0:
			break;
		case 1:
			std::cout << s1;
			break;
		case 2:
			std::cout << s1 << s1;
			break;
		case 3:
			std::cout << s1 << s1 << s1;
			break;
		case 4:
			std::cout << s1 << s2;
			break;
		case 9:
			std::cout << s1 << s3;
			break;
		default:
			std::cout << s2;
			print_roman_helper(digit-5, s1, s2, s3);
			
	}
}

void print_roman(int n){
	print_roman_helper(n/1000, 'M', '?', '?');
	n = n%1000;

	print_roman_helper(n/100, 'C', 'D', 'M');  //C=100   D=500  M=1000
	n = n%100;

	print_roman_helper(n/10, 'X', 'L', 'C');  //X=10   L=50   
	n = n%10;

	print_roman_helper(n, 'I', 'V', 'X');
}