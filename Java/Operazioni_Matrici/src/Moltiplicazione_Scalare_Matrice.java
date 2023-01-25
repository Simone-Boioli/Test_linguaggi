
public class Moltiplicazione_Scalare_Matrice {
	private int[][]A;
	private int r_a;
	private int c_a;
	private int scalare;
	
	private int[][] risultato; 
	
	public Moltiplicazione_Scalare_Matrice(int[][] A, int r_a, int c_a, int scalare){
		this.A = A;
		this.r_a = r_a;
		this.c_a = c_a;
		this.scalare = scalare;
		
		risultato = new int [r_a][c_a];
	}
	
	public void matrix_scalare_multiplay(){
		for(int i = 0; i < r_a; i++){
			for(int j = 0; j < c_a; j++){
				risultato[i][j] = scalare * A[i][j];
			}
		}
		stampaMatrice(risultato);
	}
	
	private void stampaMatrice(int [][] mat){
		for (int i = 0; i < r_a ; i++){
			for(int j = 0; j < c_a; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
