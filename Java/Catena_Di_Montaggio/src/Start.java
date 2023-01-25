
public class Start {
	static int[] entrata;
	static int[] uscita;
	
	static int n_stazioni;
	
	static int[][] f;  //totale costi 
	static int[][] l;  //stazione d'uscita
	
	
	public static void main(String[] args) {
		entrata = new int[2];  //costi di entrata
		
		entrata[0] = 2;
		entrata[1] = 4;
		
		uscita = new int[2];  //costi di uscita
		
		uscita[0] = 3;
		uscita[1] = 2;
		
		int[][] costi_stazione = {  //costi per sigola stazione
				{7,9,3,4,8,4},
				{8,5,6,4,5,7}
		};
		
		int[][] costi_passaggio_stazione = {  //costi da 1 a 2, e viceversa
				{2,3,1,3,4},
				{2,1,2,2,1}
		};
		
		n_stazioni = 6;
		
		fastest_way(entrata, uscita, costi_stazione, costi_passaggio_stazione, n_stazioni);
	}
	
	public static void fastest_way(int e[], int x[], int[][]a, int[][]t, int n){
		f = new int[2][6];
		l = new int[2][5];
		int costo_tot;
		int catena;
		
		f[0][0] = e[0] + a[0][0];  //f1[1]
		f[1][0] = e[1] + a[1][0];  //f2[1]
		
		for(int j = 1; j<n; ++j){
			if(f[0][j-1] + a[0][j] <= f[1][j-1] + t[1][j-1] + a[0][j]){
				f[0][j] = f[0][j-1] + a[0][j];
				l[0][j-1] = 1;
			} else{
				f[0][j] = f[1][j-1] + t[1][j-1] + a[0][j];
				l[0][j-1] = 2;
			}
			
			if(f[1][j-1] + a[1][j] <= f[0][j-1] + t[0][j-1] + a[1][j]){
				f[1][j] = f[1][j-1] + a[1][j];
				l[1][j-1] = 2;
			} else{
				f[1][j] = f[0][j-1] + t[0][j-1] + a[1][j];
				l[1][j-1] = 1;
			}
		}
		
		if(f[0][n-1] + x[0] <= f[1][n-1] + x[1]){
			costo_tot = f[0][n-1] + x[0];
			catena = 1;
		}else{
			costo_tot = f[1][n-1] + x[1];
			catena = 2;
		}
		
		stampa_stazioni(catena, n, l);

	}
	
	public static void stampa_stazioni(int l, int n, int[][]li){
		int i = l-1;
		int j = 5;
		int k = i+1;
		
		System.out.println("Stazione " + n + ", catena " + k); //stazione 6
		
		i = li[i][j-1] - 1;
		k = i + 1;
		System.out.println("Stazione " + j + ", catena " + k); //stazione 5
		
		j--;
		
		i = li[i][j-1] - 1;
		k = i + 1;
		System.out.println("Stazione " + j + ", catena " + k);//stazione 4
		
		j--;
		
		i = li[i][j-1] - 1;
		k = i + 1;
		System.out.println("Stazione " + j + ", catena " + k);//stazione 3
	
		j--;
		
		i = li[i][j-1] - 1;
		k = i + 1;
		System.out.println("Stazione " + j + ", catena " + k);//stazione 2
		
		j--;
		
		i = li[i][j-1] - 1;
		k = i + 1;
		System.out.println("Stazione " + j + ", catena " + k);//stazione 1

	}

}
