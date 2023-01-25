public class ForBreakEtichettato {
	public static void main(String[] args) {
		int[][] elemento = {{2, 4, 6, 10},
		                                {4, 1, 5, 4},
						{3, 3, 3, 5}};
		int n = 3; int m = 4;
		int i = 0; int j = 0;
		int elementoCercato = 5;
		for_esterno:
		for (i=0; i<n; i++) 
  			for (j=0; j<m; j++) 
    			if (elemento[i][j] == elementoCercato)
      				break for_esterno;	
      				//break; //for_esterno;	
		if ((i != n) && (j != m))
  			System.out.println("Elemento trovato in: "+i+" "+j);
		else 
  			System.out.println("Elemento non trovato");
	}
}
