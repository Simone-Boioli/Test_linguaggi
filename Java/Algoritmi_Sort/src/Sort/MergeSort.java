package Sort;

public class MergeSort{
	
	public static void sort(int a[]){
		
		if(a.length >= 2){
			int halfLength = a.length/2;
			int [] front = new int [halfLength];
			int [] tail = new int [a.length - halfLength];
			
			divide(a, front, tail);
			sort(front);
			sort(tail);
			merge(a, front, tail);
		}
	}
	/**
	 * Metodo divide, che divide in 2 l'array e inserisce gli elementi in 2 array più piccoli
	 */
	private static void divide(int[]a, int[]front,int[] tail){
		
		for(int i=0; i < front.length; i++){
			front[i] = a[i];
		}
		for(int j = 0; j < tail.length; j++){
			tail[j] = a[front.length + j];
		}
	}
	
	private static void merge(int[]a, int[]front, int[]tail){
		int frontIndex = 0;
		int tailIndex = 0; 
		int aIndex = 0;
		
		while((frontIndex < front.length)&&(tailIndex < tail.length)){
			if(front[frontIndex] < tail[tailIndex]){
				a[aIndex] = front[frontIndex];
				aIndex++;
				frontIndex++;
			}else{
				a[aIndex] = tail[tailIndex];
				aIndex++;
				tailIndex++;
			}
		}
		
		while(frontIndex < front.length){  // copia il restante di front in a
			a[aIndex]=front[frontIndex];
			aIndex++;
			frontIndex++;
		}
		while(tailIndex < tail.length){   // copia il restante di tail in a
			a[aIndex] = tail[tailIndex];
			aIndex++;
			tailIndex++;
		}
	}
}
