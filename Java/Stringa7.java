/*
Testo:
Scrivere un programma Java che esegue le seguenti operazioni:
(1) legge da input standard una stringa, usando il metodo opportuno della classe SavitchIn, e la memorizza
    in una variabile s1,
(2) legge da input standard un numero intero n (utilizzando la classe SavitchIn),
(3) costruisce un'altra stringa s2 concatenando i caratteri della stringa s1, ma sostituendo i caratteri
    di indice pari con il carattere di indice n (es. s1="programmazione", n=3, s2="grgggagmgzgoge"),
(4) scrive su output standard il contenuto della variabile s2.
*/


public class Stringa7{
       public static void main(String[]args){
              
              System.out.println("Inserisci una stringa:");           //Legge da imput la stringa e la memorizza in s1
              String s1=SavitchIn.readLine();

              int n=0;
              do{
                 System.out.println("Inserisci un numero intero:");      //Legge da input un intero e cicla finchè n non è sia >0 e < della lunghezza della stringa
                 n=SavitchIn.readLineInt();
              }while(n<0||n>s1.length()-1);

              String s2="";
              for(int i=0;i<s1.length();i++){      //passa l'intera stringa
                      if(i%2==0){
                           s2=s2+s1.charAt(n);      //il carattere in posizione pari viene sostituito con il carattere in posizione n
                      }else{
                            s2=s2+s1.charAt(i);     //il carattere dispari viene stampato cosi come è
                      }
              }

              System.out.println(s2);     //Stampa a video s2
       }

}