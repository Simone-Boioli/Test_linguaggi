class Espressione {
 static int funzione (int a, int b){
  int risultato;
  risultato=(13*(a+b)-7*a+12*b)/5;
  return (risultato);
  }
 
 public static void main (String[]args){
  int x=5;
  int y=3;
  int z;
  z=funzione(x,y);
  
  System.out.println (z);
  }
}