/** ESERCIZIO SIMILE AL COMPITINO
*    Scrivere un programma composto dai seguenti metodi:
*    1) metodo Controlla
*       Riceve come parametro una stringa S e restituisce un booleano. Il valore restituito deve essere true se s contiene
*       almeno un caratterepiù di una volta e false altrimenti Es.pippo--->true, ciao--->false
*    2) metodo Main
*       chiama il metodo controlla su tutte le stringhe inserite al momento dell'esecutore
*/

class Esercizio4{
      static boolean controlla(String s){
             boolean res=false;
             for(int i=0;((i<s.length()-1)&&!res);i++){
                 for(int j=i+1;((j<s.length())&&!res);j++){
                    res=(s.charAt(i)==s.charAt(j));
                 }
             }
             return res;
      }


      public static void main (String[]args){
             for(int i=0; i<args.length;i++){
                 System.out.println(controlla(args[i]));
             }
      }
}