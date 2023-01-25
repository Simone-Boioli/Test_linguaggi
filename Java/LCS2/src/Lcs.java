
public class Lcs {
	
	
	public static void main(String[] args) {
		char[] X = {'a','b','c','b','d','a','b'};
		char[] Y = {'b','d','c','a','b','a'};

		trova_lcs(X,Y);
	}
	
	public static void trova_lcs(char[] X, char[] Y){
		int m = X.length; //lunghezza sequenza X
		int n = Y.length; //lunghezza sequenza Y
		
		int[][] c = new int[m+1][n+1];
		int[][] b = new int[m+1][n+1];
		
		//metto 0 nella prima colonna
		for(int i = 0; i < m+1; i++){
			c[i][0] = 0;
			b[i][0] = 0;
		}
		
		//metto 0 nella prima riga
		for(int i = 0; i < n+1; i++){
			c[0][i] = 0;
			b[0][i] = 0;
		}
		
		for(int i = 1; i < m+1; i++){
			for(int j = 1; j < n+1; j++){
				if(X[i-1] == Y[j-1]){
					c[i][j] = c[i-1][j-1] + 1;
					b[i][j] = 1; // trovato uguale
				}
				else if(c[i-1][j] >= c[i][j-1]){
					c[i][j] = c[i-1][j];
					b[i][j] = 2; //freccia su
				}else{
					c[i][j] = c[i][j-1];
					b[i][j] = 3; //freccia sinistra
				}
			}
		}
		
		stampa_matrice(c,m,n);
		
		System.out.println("");
		
		stampa_lcs(b, X, m, n);
	}
	
	public static void stampa_lcs(int[][]b, char[]X, int i, int j){
		if(i==0 || j == 0){
			return;
		}
		
		if(b[i][j] == 1){
			stampa_lcs(b, X, i-1, j-1);
			System.out.print(X[i-1] + " ");
		}else if(b[i][j] == 2){
			stampa_lcs(b, X, i-1, j);
		}else{
			stampa_lcs(b, X, i, j-1);
		}
	}
	
	public static void stampa_matrice(int[][] c, int m, int n){
		for(int i = 0; i < m+1 ; i++){
	    	for(int j = 0; j < n+1; j++){
	    		System. out. print(c[i][j]);
	    		System.out.print(" ");
	    	}
	    	System.out.println(" ");
	    }
	}

}
