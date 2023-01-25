/** 
   Implementare un metodo ALTERNA che rieve in ingresso 2 vettori di interi di dimensioni n e ne restituisce
   un terzo di dimensione 2n i cui elementi di posizione pari siano gli elementi del primo vettore e gli elementi di posizione
   dispari siano gli elementi del secondo vettore.
*/

class Vettori{
     static int[]alterna(int[]v1,int[]v2){       //Metodo del vettore int[]-->intero vettore  "NON BISOGNA MAI METTERE VALORI A V1 e V2"
            int[]res=new int[2*v1.length];
            int j=0;
            for(int i=0;i<v1.length;i++){
                res[j]=v1[i];j++;
                res[j]=v2[i];j++;
            }
            return res;
     }
     
     public static void main(String[]args){
            int[]vet1={4,5,7,12};  //inserisco 4 valori in un vettore da 4
            int[]vet2={3,8,10,13};
            int[]risultato=alterna(vet1,vet2);

            for(int i=0;i<risultato.length;i++){       //per stampare un vettore
                    System.out.print(risultato[i]+",");
            }
     }
}