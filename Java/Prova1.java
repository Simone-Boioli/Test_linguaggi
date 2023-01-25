public class Prova1{
       public static void main(String[]args){
              
              String s="";
              do{
                 System.out.println("Inserisci una stringa:");
                 s=SavitchIn.readLineWord();
              }while(s.length()%2!=0);

              String t="";
              for(int i=0;i<s.length();i++){
                      if(i%2==0){
                               t=t+s.charAt(i);

                            if(s.charAt(i)=='a'){
                               t=t+'A';
                            }
                      }
              }

              System.out.println(t);
       }
}