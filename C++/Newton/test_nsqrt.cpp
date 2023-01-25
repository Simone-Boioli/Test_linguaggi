#include "nsqrt.h"
#include <iostream>
#include <cmath>


int main()
{
  double x;
  
  std::cout << "Inserisci un valore: ";
  std::cin >> x;
    
  if (x < 0) {
    std::cerr << "Negative value!" << std::endl;
    return 2;
  }

  double y = nsqrt(x, 1e-6);
  double z = std::sqrt(x);

  std::cout << y << " " << z << std::endl;

  return 0;
}
