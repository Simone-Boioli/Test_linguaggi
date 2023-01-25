public class Ordinamenti{
	
	public static void main(String argv[]){
		int vet[]={9,4,0,3,4,2};
		inserctionSort(vet);
		stampaVet(vet);
	}
	
	public static void inserctionSort(int vet[]){
		
		for(int i=1;i<vet.length;i++){
			int k=vet[i];
			int j=i-1;
			while(j>=0 && k<vet[j] ){
				vet[j+1]=vet[j];
				j--;
			}
			
			vet[j+1]=k;
			
		}
		
	}
	
	public static void stampaVet(int vet[]){
		
		for(int i=0;i<vet.length;i++) System.out.print(vet[i]+" ");
		System.out.println();
	}
}