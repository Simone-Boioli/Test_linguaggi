class Somma2 {
  static void somma (int x){
    x=x+4;
  }                                           // Il risultato � 10 perch� non c'� il return!!!!

  public static void main (String[]args){
   int n=10;
   somma (n);

   System.out.print(n);
  }
}