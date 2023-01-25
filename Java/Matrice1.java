/* Si scriva un programma java composto dai seguenti metodi:
   1)metodo triangolare
     riceve come parametro una matrice di double e restituisce un boolean. Il valore restituito deve essere true se la matrice 
     è triangolare superiore e false altrimenti.
   2)metodo main
     legge il n° di righe e di colonne e poi tutti gli elementi di una matrice tramite savitchin.
     controlla se la matrice letta è triangolare superiore usando il metodo triangolare e stampa il risultato
*/

class Matrice1{
  static boolean triangolare(double[][]mat){
     boolean risultato=true;
      for(int i=0;((i<mat.length)&&(risultato));i++{
        for(int j=0; ((j<mat[i].length)&&(risultato));i++{
          if((i>j)&&(mat[i][j]!=0)) risultato=false;
        }
      }
   return risultato;

  }
          //MANCA MAIN//
}