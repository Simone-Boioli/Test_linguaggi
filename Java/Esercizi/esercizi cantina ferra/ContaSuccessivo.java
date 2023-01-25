public class ContaSuccessivo{
	public static void main(String args[]){
			System.out.println(conta(5));
		}
	public static int conta(int n){
		if (n==0)
			return 0;
		else 
			return conta(n-1)+n;
		}
	
	}
	