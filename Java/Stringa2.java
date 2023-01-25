/*      Scrivere un programma che:
        -legge una stringa con SavitchIn.readLineWord()
        -cambia il carattere in posizione centrale sostituendolo con il carattere 'k'
         Per posizione centrale si intende la poosizione di indiece (L/2)+1 dove L è la lunghezza della stringa
        -Stampa la riga risultante
*/

public class Stringa2{
       public static void main(String[]args){
              System.out.println("Inserisci una stringa");
              String s=SavitchIn.readLineWord();
              String t="";

              for(int i=0;i<s.length();i++){        //passa l'intera stringa
                    if(i==((s.length()/2)+1)){
                           t=t+'k';
                    }else
                         {
                           t=t+s.charAt(i);
                         }
              }
              
              System.out.println(t);
       }
}