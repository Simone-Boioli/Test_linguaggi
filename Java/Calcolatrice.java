public class Calcolatrice{
	public static void main(String[]args){
		int a = 4;
		int b = 3;
		int test = 4;
		
		switch(test){
			case 1:{
				System.out.println("hai scelto la somma");
				int c= a+b;
				System.out.println(c);
			}
			break;
			
			case 2:{
				System.out.println("hai scelto la sottrazione");
				int d= a-b;
				System.out.println(d);	
			}
			break;
			
			case 3:{
				System.out.println("hai scelto la moltiplicazione");
				int e= a*b;
				System.out.println(e);
			}
			break;
			
			case 4:{
				System.out.println("hai scelto la divisione");
				double f= a/b;
				System.out.println(f);
			}
			break;
			
			case 5:{
				System.out.println("hai scelto il modulo");
				int g= a%b;
				System.out.println(g);
			}
			break;
			
			default:{
				System.out.println("Non hai scelto nessuna operazione");
			}
		}
	}
}