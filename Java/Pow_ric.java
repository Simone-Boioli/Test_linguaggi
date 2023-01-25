public class Pow_ric{
	public static void main(String[]args){
		int n = 2;
		int m = 5;
		
		System.out.println(pow_ricorsiva(n,m));
	}
	
	public static int pow_ricorsiva(int n, int m){  //n ---> base, m---> potenza 
		//caso base
		if(m == 0){
			return 1;  // un numero elevato alla 0 è uguale a 1
		}else{
			return (n*pow_ricorsiva(n, m-1));
		}
	}
}