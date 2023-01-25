/**
   Scrivere un programma che:
   1| legge da inpt una stringa e memorizzarla in una variabile s
   2| .se il primo carattere è una vocale, costruisce una nuova stringa s2 concatenando prima i caratteri di indice pari
       e poi quelli dispari (Es.s=esame" s2="eaesm")
      .se il primo carattere è una consonante costruisce la nuova stringa s2 concatenando prima i caratteri
       dispari e poi i pari
*/

class Esercizio5{
  public static void main(String[]args){
    String s=SavitchIn.readLineWord();            //legge la stringa e la salva in s
  
  if((s.charAt(o)=='a')||(s.charAt(o)=='e')||(s.charAt(o)=='i')||(s.charAt(o)=='o')||(s.charAt(o)=='u')){     //guarda se il primo carattere è una vocale
     for(int i=0;i<s.length();i=i+2){    //cerca i caratteri pari e li concatena a s2
         s2=s2+s.charAt(i);
     }
     for(int i=1;i<s.length();i=i+2){       //concateno i caratteri dispari
         s2=s2+s.charAt(i);
     }
  }else{
        for(int i=1;i<s.length();i=i+2)s2=s2+s.charAt(i);     //in caso che è una consonante la prima lettera
        for(int i=0;i<s.length();i=i+2)s2=s2+s.charAt(i);
  }
  System.out.println(s2);
}