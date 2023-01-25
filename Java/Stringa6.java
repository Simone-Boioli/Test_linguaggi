/*  Scrivere un programma Java che legge due stringhe s e t tramite l'apposito metodo della classe SavitchIn e 
stampa a video una stringa che contiene, in alternanza, un carattere di s e uno t.

Esempio

Se le stringhe lette sono s = "ciao" e t = "mare", occorre stampare "cmiaaroe"

Se le stringhe lette sono s = "ciao" e t = "giornata", occorre stampare "cgiiaoornata"

Se le stringhe lette sono s = "11111111" e t = "cane", occorre stampare "1c1a1n1e1111"

(gli ultimi due esempi ci dicono che se una delle due stringhe è più lunga dell'altra, la parte finale è 
costituita solo dai caratteri di quella più lunga)

*/

class Stringa6{
      public static void main (String[]args){

      System.out.println("Inserisci la prima stringa:");
      String s=SavitchIn.readLine();
      System.out.println("Inserisci la seconda stringa:");
      String t=SavitchIn.readLine();
      String st="";

      if (s.length()<=t.length()){
                for(int i=0;i<s.length();i++){
                        st=st+s.charAt(i)+t.charAt(i);
                }
                for(int j=0;j<t.length();j++){
                        st=st+t.charAt(j);
                }
      }else{
            for(int i=0;i<t.length();i++){
                    st=st+s.charAt(i)+t.charAt(i);
            }
            for(int j=0;j<s.length();j++){
                    st=st+t.charAt(j);
            }
      }


      System.out.println(st);
      }
}






