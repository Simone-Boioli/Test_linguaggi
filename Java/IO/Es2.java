public class Es2{
	public static void main(String[] args){
		int [] vet1 = {1,2,3,4};
		int [] vet2 = {1,2,3,4};
		int i = 0;
		int j = (vet1.length)-1;
		
		boolean esito = procedura(vet1, vet2, i, j);
		System.out.println(esito);
	}
	
	public static boolean procedura(int[] a, int []b, int i, int j){
		if(i<j){
			int q = (i+j)/2; // divide
			boolean x = procedura(a, b, i, q);
			
			if(x == true){
				x = procedura(a, b, q+1, j);
			}
			return x;
		}
		else{
			if(a[i] == b[i]){
				return true;
			}else{
				return false;
			}
		}
	}
}