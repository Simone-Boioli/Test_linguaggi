#include<iostream>  
#include<math.h>      //  librerie C
#include<time.h>      //

int main ()
{        
        int n;                  //numero da calcolare fattoriale
        int i=0;                //variabile contatore fina a n
        int prodotto=1;         //accumulatore
        
        std::cout << "Inserire numero: ";
        std::cin >> n;
        while (i<n){
               prodotto=prodotto*(n-i);
               i++;
               }
        
        std::cout<<"Il fattoriale e': " <<prodotto <<"\n";            //aggiunge 1 alla i
       
		          
	return 0;
}

    
    
