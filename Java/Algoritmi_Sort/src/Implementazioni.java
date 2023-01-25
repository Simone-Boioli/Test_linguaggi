import Sort.MergeSort;


public class Implementazioni {

	public static void main(String[] args) {
			int b[] = {7,5,11,2,16,4,18,14,12,30};
			System.out.println("Array prima del sort");
			for(int i = 0; i < b.length; i++){
				System.out.println(b[i]);
			}
			System.out.println("");
			MergeSort.sort(b);
			System.out.println("Array dopo del sort");
			for(int j = 0; j < b.length; j++){
				System.out.println(b[j]);
			}
	}

}
