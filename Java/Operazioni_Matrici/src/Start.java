import java.util.Scanner;

public class Start {

	static int r_a; // n° righe matrice A
	static int c_a; // n* colonne matrice A
	static int r_b; // n° righe matrice B
	static int c_b; // n* colonne matrice B
	
	static int scalare;
	static String matrice;
	
	static int [][]mat1;
	static int [][]mat2;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("|--------------------------------|\n");
		System.out.print("| OPERAZIONI SU MATRICI QUADRATE |\n");
		System.out.print("|--------------------------------|\n");
		
		System.out.print("\nInserisci numero di righe della matrice A: ");
		r_a = scanner.nextInt();
		
		System.out.print("\nInserisci numero di colonne della matrice A: ");
		c_a = scanner.nextInt();
		
		System.out.print("\nInserisci numero di righe della matrice B: ");
		r_b = scanner.nextInt();
		
		System.out.print("\nInserisci numero di colonne della matrice B: ");
		c_b = scanner.nextInt();
		
		
		System.out.print("\nInserisci scalare con cui moltiplicare la matrice (-1 se non lo vuoi): ");
		scalare = scanner.nextInt();
		
		if(scalare != -1){
			System.out.print("\nSu quale matrice lo vuoi moltiplicare (A o B): ");
			matrice = scanner.next();
		}
		
		mat1 = new int[r_a][c_a];
		mat2 = new int[r_b][c_b];
		
		/**
		 * Inserimento valori matrice A
		 */
		System.out.print("\n\n|------------------------------|\n");
		System.out.print("| INSERIMENTO VALORI MATRICE A |\n");
		System.out.print("|------------------------------|\n");
		
		int valore; 
		
		for(int i = 0; i < r_a; i++){
			for(int j = 0; j < c_a; j++){
				System.out.print("\nInserisci valore in posizione " + (i+1) + (j+1) + ": ");
				valore = scanner.nextInt();
				mat1[i][j] = valore;
			}
		}
		
		
		/**
		 * Inserimento valori matrice B
		 */
		System.out.print("\n\n|------------------------------|\n");
		System.out.print("| INSERIMENTO VALORI MATRICE B |\n");
		System.out.print("|------------------------------|\n");
		 
		
		for(int i = 0; i < r_b; i++){
			for(int j = 0; j < c_b; j++){
				System.out.print("\nInserisci valore in posizione " + (i+1) + (j+1) + ": ");
				valore = scanner.nextInt();
				mat2[i][j] = valore;
			}
		}
		
		
		/**
		 * Stampa Matrici
		 */
		System.out.print("\n\n|----------------|\n");
		System.out.print("| STAMPA MATRICI |\n");
		System.out.print("|----------------|\n");
		
		System.out.print("\n-----  Matrice A  -----\n");
		stampaMatriceA(mat1);
		
		System.out.print("\n-----  Matrice B  -----\n");
		stampaMatriceB(mat2);
		
		
		/**
		 * Moltplicazione matrici 
		 */
		Moltiplicazione_Matrici mul = new Moltiplicazione_Matrici(mat1, mat2, r_a, c_a, r_b, c_b);
		
		System.out.print("\n\n|-------------------------|\n");
		System.out.print("| MOLTIPLICAZIONE MATRICI |\n");
		System.out.print("|-------------------------|\n");
		
		mul.matrix_multiplay();
		
		
		/**
		 * Somma matrici 
		 */
		Somma_Matrici sum = new Somma_Matrici(mat1, mat2, r_a, c_a, r_b, c_b);
		
		System.out.print("\n\n|---------------|\n");
		System.out.print("| SOMMA MATRICI |\n");
		System.out.print("|---------------|\n");
		
		sum.matrix_sum();
		
		
		/**
		 * Sottrazione matrici 
		 */
		Sottrazione_Matrici subtraction = new Sottrazione_Matrici(mat1, mat2, r_a, c_a, r_b, c_b);
		
		System.out.print("\n\n|---------------------|\n");
		System.out.print("| SOTTRAZIONE MATRICI |\n");
		System.out.print("|---------------------|\n");
		
		subtraction.matrix_subtraction();
		
		
		/**
		 * Moltiplicazione scalare/matrici 
		 */
		if(scalare != -1){
			if(matrice.equalsIgnoreCase("A")){
				Moltiplicazione_Scalare_Matrice scalare_mat = new Moltiplicazione_Scalare_Matrice(mat1, r_a, c_a, scalare);
			
				System.out.print("\n\n|---------------------------------|\n");
				System.out.print("| MOLTIPLICAZIONE SCALARE/MATRICI |\n");
				System.out.print("|---------------------------------|\n");
				
				scalare_mat.matrix_scalare_multiplay();
			
				
			}else{
				Moltiplicazione_Scalare_Matrice scalare_mat = new Moltiplicazione_Scalare_Matrice(mat2, r_b, c_b, scalare);
				
				System.out.print("\n\n|---------------------------------|\n");
				System.out.print("| MOLTIPLICAZIONE SCALARE/MATRICI |\n");
				System.out.print("|---------------------------------|\n");
				
				scalare_mat.matrix_scalare_multiplay();
			}
		}
	}
	
	
	
	
	
	private static void stampaMatriceA(int [][] mat){
		for (int i = 0; i < r_a ; i++){
			for(int j = 0; j < c_a; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	private static void stampaMatriceB(int [][] mat){
		for (int i = 0; i < r_b ; i++){
			for(int j = 0; j < c_b; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
