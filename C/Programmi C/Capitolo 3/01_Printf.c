/**
*	Boioli Simone 11/04/16
*	Stampe con la printf (pag 42)
*/

#include <stdio.h>

int main(void)
{
	int i;
	float x;

	i = 40;
	x = 839.21f;

	printf("|%d|%5d|%-5d|%5.3d|\n", i,i,i,i);
	printf("|%10.3f|%10.3e|%-10g|\n", x,x,x);



	return 0;
}