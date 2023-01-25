
public class Array extends ArrayMatrici {
	public static int max (int[]vet){
		int mas=vet[0];
		 for(int i=0; i<vet.length; i++){
			 if(vet[i]>mas){
				 mas=vet[i];
			 }
		 }
		return mas;
	}
	
	public static int min(int[]vet){
		int minimo=vet[0];
		for(int i=0; i<vet.length; i++){
			if(vet[i]<minimo){
				minimo=vet[i];
			}
		}
		return minimo;
	}

	public static int contatore(int[]vet, int m){
		int cont=0;
		for(int i=0; i<vet.length; i++){
			if(vet[i]==m){
				cont++;
			}
		}
		return cont;
	}
	
	public static int somma(int[]vet){
		int sum=0;
		for(int i=0; i<vet.length; i++){
			sum=sum+vet[i];
		}
		return sum;
	}
	
	public static void insertionSort(int[]vet){
		for (int j=1; j<vet.length; j++){
			int key=vet[j];
			int i=j-1;
			
			while(i>0 && vet[i]>key){
				vet[i+1]=vet[i];
				i=i-1;
			}
			vet[i+1]=key;
		}
		
	}
	
	public static void stampa(int [] vet){
		insertionSort(vet);
		for(int i=0; i<vet.length; i++){
			System.out.println(vet[i]);
		}
	}
	
	public static void bubbleSort(int[]vet){
		int temp;
		for (int j=0; j<vet.length; j++){
			for (int i=j; i<vet.length-1;i++){
				if(vet[j]>vet[i]){
					temp=vet[j];
					vet[i]=vet[i+1];
					temp=vet[i];
				}
			}
		}
	}
}
