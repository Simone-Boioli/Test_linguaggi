/*      Scrivere un programma composto dai seguenti metodi:
        1)METODO TROVAPARI=riceve in parametro una stringa s e restituisce una stringa contenente tutti i caratteri pari
                           della stringa s
        2)METODO MAIN= chiama il metodo TrovaPari su tutte le stringhe inserite al momento dell'esecuzione e ne stampa 
                       il risultato
*/

public class Stringa3{
       static String trovaPari(String s){
              String t="";
              for(int i=0;i<s.length();i++){
                      if(i%2==0){
                              t=t+s.charAt(i);
                      }
              }
              return t;
       }

       public static void main(String[]args){
              for(int i=0; i<args.length;i++){
                      System.out.println(trovaPari(args [i]));
              }
       }
}