
public class LCS {
	private int m;
	private int n;
	
	private int [][] c;
	private int [][] b;
		
	public int maxLCS(String x, String y){
		m = x.length();
		n = y.length();
		
		c = new int [m+1][n+1];
		b = new int [m+1][n+1];
		
		for(int i = 0; i < m; i++){
			c[i][0] = 0;
			b[i][0] = 0;
		}
		
		for(int j = 0; j < n; j++){
			c[0][j] = 0;
			b[0][j] = 0;
		}
		
		for(int i = 1; i < m+1; i++){
			for(int j = 1; j < n+1; j++){
				if(x.charAt(i-1) == y.charAt(j-1)){
					c[i][j] = c[i-1][j-1] +1;
					b[i][j] = 0;   //freccia alto sin
				}else if(c[i-1][j] >= c[i][j-1]){
					c[i][j] = c[i-1][j];
					b[i][j] = 1;  //freccia in su
				}else{
					c[i][j] = c [i][j-1];
					b[i][j] = 2; //freccia sinistra
				}
			}
		}
		stampaMatrice(c);
		printLCS(b, x, m, n);
		return c[m][n];
		
		
	}
	
	private void stampaMatrice(int [][] mat){
		for (int i = 0; i < mat.length ; i++){
			for(int j = 0; j < mat.length; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	
	private void printLCS (int[][] b, String x, int i, int j){
			if(i == 0 || j == 0){
				System.out.println("");
				return;
			}
			
			if(b[i][j] == 0){
				printLCS(b, x, i-1, j-1);
				System.out.println(x.charAt(i-1) + " ");
			}else if(b[i][j] == 1){
					printLCS(b, x, i-1, j);
			}else{
				printLCS(b, x, i, j-1);
			}
	}
	
	
		
}