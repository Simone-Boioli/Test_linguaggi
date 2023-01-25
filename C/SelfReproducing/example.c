#include<stdio.h>


char s[] = {
	'\t',
	'0',
	'\n',
	'}',
	';',
	'\n',
	'\n',
	'/',
	'*',
	'\n',
	0
    };


main(void){
    int i;

    printf("char\ts[ ] = {\n");

    for(i = 0; s[i]; i++){
	printf("\t%d,\n", s[i]);
    }

    printf("%s", s);

}
