public class Algoritmi{
	
	public static int ricercaSequenziale(int [] vet, int k){
		int pos = -1;
		for(int i = 0; i < vet.length; i++){
			if(vet[i] == k){
				pos = i;
			}
		}
		return pos;
	}

	


	public static int ricercaSequenzialeOttimizzata(int [] vet, int k){
		int i = 0;
		while((vet[i] != k) && (i <= vet.length)){
			i++;	
			System.out.println("i = " + i);
		} 
		if( i > vet.length){
			return(-1);
		}else{
			return i;
		}
	}


	public static int ricercaDicotomica(int [] vet, int k){
		int i = 0;
		int f = vet.length;
		int m = ((i+f)/2)-1;
		System.out.println(i+" "+m+" "+f);
		for(int l = 0; l < 3; l++){
			while(k != vet[m] && i <= f){
				if(vet[m] < k){
					i = m+1;
					m = ((i+f)/2)-1;
					System.out.println("m=" + m);
				}else{
					i = m-1;
					m = ((i+f)/2)-1;
				}
				//System.out.println(i+" "+m+" "+f);
				//System.exit(-1);
				break;
			}
		}

		if(k == vet[m]){
			return m;
		}else{
			return -1;
		}
	}


	public static void  insertionSort(int vet[]){
		for(int i =1; i < vet.length; i++){
			int key = vet[i];
			int j = i-1;  

			while((j>=0) && (key < vet[j])){  
				vet[j+1] = vet[j];   
				j--;
			}
			vet[j+1] = key; 
			
		}
	} 



	public static void main(String args[]){
		int vet [] = {1,2,3,4};
		int k = 4;
		
		//int ricSequenziale = ricercaSequenziale(vet,k);
		int ricSequenzialeOttimizzata = ricercaSequenzialeOttimizzata(vet, k);
		//int ricDicotomica = ricercaDicotomica(vet, k);


		//System.out.println(ricSequenziale); 
		System.out.println(ricSequenzialeOttimizzata);
		//System.out.println(ricDicotomica);
		/*
		insertionSort(vet);
		stampaVet(vet);
		*/
		
		
	}

	public static void stampaVet(int vet[]){
		
		for(int i=0;i<vet.length;i++) System.out.print(vet[i]+" ");
		System.out.println();
	}

}
