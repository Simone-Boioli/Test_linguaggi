
#include<iostream>
#include<math.h>
#include<time.h>

int main ()
{
    int num,d,u;                //d= decine     u=unità

    std::cout << "Inserisci il numero: ";
    std::cin>>num;
    
    u=num%10;
    d=num/10;
    
    switch(d){
    case 1: std::cout<<"X"; break;
    case 2: std::cout<<"XX"; break;
    case 3: std::cout<<"XXX"; break;
    case 4: std::cout<<"XL"; break;
    case 5: std::cout<<"L"; break;
    case 6: std::cout<<"LX"; break;
    case 7: std::cout<<"LXX"; break;
    case 8: std::cout<<"LXXX"; break;
    case 9: std::cout<<"XC"; break;
    }
    
    
    if(u==1) std::cout<<"I";
    if(u==2) std::cout<<"II";
    if(u==3) std::cout<<"III";
    if(u==4) std::cout<<"IV";
    if(u==5) std::cout<<"V";
    if(u==6) std::cout<<"VI";
    if(u==7) std::cout<<"VII";
    if(u==8) std::cout<<"VIII";
    if(u==9) std::cout<<"IX";   


    std::cout<<"\n\n";
	
	return 0;
}

    
    
