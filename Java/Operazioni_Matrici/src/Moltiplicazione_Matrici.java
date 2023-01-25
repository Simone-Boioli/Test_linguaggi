
public class Moltiplicazione_Matrici {
	private int[][]A;
	private int[][]B;
	private int r_a;
	private int c_a;
	private int r_b;
	private int c_b;
	
	private int[][] risultato; 
	
	public Moltiplicazione_Matrici(int[][] A, int[][] B, int r_a, int c_a, int r_b, int c_b){
		this.A = A;
		this.B = B;
		this.r_a = r_a;
		this.c_a = c_a;
		this.r_b = r_b;
		this.c_b = c_b;
		
		risultato = new int [r_a][c_b];
	}
		
		
		/**
		 * 
		 */
		public void matrix_multiplay(){
			if(c_a != r_b){
				System.out.println("ERRORE!!! Dimensioni non compatibili");
			}else for(int i = 0; i < r_a; i++){
				 		for(int j = 0; j < c_b; j++){
				 			risultato[i][j] = 0;
				 			for(int k = 0; k < c_a; k++){
				 				risultato[i][j] = risultato[i][j] + A[i][k] * B[k][j];
				 			}
				 		}
				  }
			stampaMatrice(risultato);
		}
		
		
		private void stampaMatrice(int [][] mat){
			for (int i = 0; i < r_a ; i++){
				for(int j = 0; j < c_b; j++){
					System.out.print(mat[i][j] + " ");
				}
				System.out.println("");
			}
		}
}


