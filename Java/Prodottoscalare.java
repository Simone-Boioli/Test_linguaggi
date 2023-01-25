/**
   Implementare un metodo PRODOTTO SCALARE che riceve come parametri 2 vettori di double v e w(monodimensionali)
   e restituisce il loro prodotto scalare: sommatoria v[i]*w[i]
   
   Esempio:  v=2,3,4  w=5,9,10   ==(2*5)+(3*9)+(4*10)
*/

class Prodottoscalare{
      static double prodScal(double[]v,double[]w){
             double prodotto=0;
             for(int i=0;i<v.length;i++){
                     prodotto=prodotto+v[i]*w[i];
             }
             return prodotto;
      }
      
      public static void main(String[]args){
             double [v1]={5,7,9};
             double [v2]={3,2,1};

             System.out.println(prodScal(v1,v2));
      }
}