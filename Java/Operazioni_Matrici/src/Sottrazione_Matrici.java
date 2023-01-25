
public class Sottrazione_Matrici {
	private int[][]A;
	private int[][]B;
	private int r_a;
	private int c_a;
	private int r_b;
	private int c_b;
	
	private int[][] risultato; 
	
	public Sottrazione_Matrici(int[][] A, int[][] B, int r_a, int c_a, int r_b, int c_b){
		this.A = A;
		this.B = B;
		this.r_a = r_a;
		this.c_a = c_a;
		this.r_b = r_b;
		this.c_b = c_b;
		
		risultato = new int [r_a][c_b];
	}
	
	public void matrix_subtraction(){
		for(int i = 0; i < r_a; i++){
			for(int j = 0; j < c_a; j++){
				risultato[i][j] = A[i][j] - B[i][j];
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
