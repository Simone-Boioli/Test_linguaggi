package Algoritmi_Ricerca;

public class BinarySearch {
	private int[]a;
	
	public BinarySearch(int[]array){
		this.a = array;
	}
	
	/**
	 * metodo helper
	 */
	public int findHelper(int target){
		return(find(target , 0, a.length-1));
	}
	
	/**
	 *	Metodo binary search 
	 */
	private int find(int target, int first, int last){
		int result = -1; //ritorna -1 in caso l'elemento non � trovato
		int mid; //variabile che vale la met� dell'array 
		if(first > last){  //elemento crecato non c'� nell'array
			result = -1;
		}
		else{
			mid = (first + last)/2;
			
			if(target == a[mid]){ //elemento a met�
				result = mid;
			}else if(target < a[mid]){
				result = find(target, first, mid-1); //tolgo la seconda met�
			}else{  // target > a[mid]
				result = find(target, mid +1, last); //tolgo la prima met�
			}
		}
		
		return result;
	}
}
