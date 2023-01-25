/* Dato un arrey bi-dimensionale di interi M scrivere un programma che:
*   1) inizializza M, leggendo elemento per elemento tramite savitchIn
*   2) cerca all'interno di M un elemento che valga 0. Se questo elemto esiste, il programma deve stampare
*      a video la posizione (riga e colonna) dell'elemento, altrimenti deve stampare a video il mex "elemento
*      non esistente".
*/

class Matrice {
  public static void main (String[]args){
  
  System.out.println("Inserisci numero di righe: ");
  int N=SavitchIn.readLineInt();
  
  System.out.println("Inserisci numero di colonne: ");
  int K=SavitchIn.readLineInt();

  int[][]mat=new int [N][K];                      //[][]--->vettore bi-dimensionale

  for(int i=0;i<mat.length;i++){                              //
    for(int j=0;j<mat[i].length;j++){                        // Scandisce da sinistra a destra l'intera matrice
      System.out.println("Inserisci elemento"+i+","+j);       //
      mat[i][j]=SavitchIn.readLineInt();                      //
    }
  }

  boolean trovato=false;
   for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[i].length;j++){
      if (mat [i][j]==0){
        System.out.println(i+","+j);
        trovato=true;
      }
    }
   }

   if(!trovato) System.out.println("Non esiste!!");

  }
}