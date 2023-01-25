/*Scrivere un programma Java che legge una stringa con l'apposito
metodo della classe SavitchIn e conta il numero di caratteri uguali a 'z', stampando a video il risultato.
*/

class Stringa4{
      public static void main (String[]arg){

             System.out.println("Inserisci una stringa");
             String s=SavitchIn.readLine();

             int cont=0;
             for(int i=0;i<s.length();i++){
                        if(s.charAt(i)=='z'){
                                 cont++;
                        }
             }

             System.out.println("Il numero di z contenute nella stringa è:"+cont);

      }
}