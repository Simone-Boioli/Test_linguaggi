#include<stdio.h>

double media(double a, double b){
    return (a+b)/2;
}

int main(void){
    double x, y, z;

    printf("Inserici 3 numeri: ");
    scanf("%lf%lf%lf", &x, &y, & z);

    printf("La media tra %g e %g e': %g\n", x, y, media(x,y));
    printf("La media tra %g e %g e': %g\n", y, z, media(y,z));
    printf("La media tra %g e %g e': %g\n", x, z, media(x,z));

    return 0;

}

