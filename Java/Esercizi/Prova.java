import java.util.*;
public class Prova{
	public static int div(int a, int b){
			try{
				if(b != 0)
					return (a/b);
				else 
					throw new Exception("divisione per 0");
				        
					
			}
			catch (Exception e){
				System.out.println(e.getMessage());
				return(0);
			}
	}
	
	public static void main(String [] arg){
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int a = scannerObject.nextInt();
		System.out.println("Inserisci un numero");
		int b = scannerObject.nextInt();
		int c=div(a,b);
		System.out.println(c);	
	}
}	