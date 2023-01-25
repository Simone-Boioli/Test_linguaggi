public class CountingSort{
		public static void main(String[]args){
			int A []= {2,5,3,0,2,3};
			int max=A[0];
			int min=A[0];
			int i=1;
			
			//Cacolo degli elementi max e min
			for(; i<A.length; i++){
				if(A[i]>max) max=A[i];
				else if(A[i]<min) min=A[i];
			}
			
			//Costruzione dell'array C
			int[] C=new int[max-min+1];           //crea l'array C
			
			for(i=0; i<C.length; i++){
				C[i]=0;    //inizializza a zero gli elementi di C
			}
			
			
			for(i=0; i<A.length; i++){
				C[A[i]-min]++; //aumenta il numero di volte che si è incontrato il valore
			}
			
			//Ordinamento in base al contenuto dell'array delle frequenze C
			int k=0;                             //indice per l'array A
			for(i=0; i<C.length; i++){
				while(C[i]>0){                     //scrive C[i] volte il valore (i+min) nell'array A
					A[k]=i+min;
					k++;
					C[i]--;
				}
			}
			
			for(int j= 0; j < A.length; j++){
				System.out.println(A[j]);
			}
			
			
		}
}
