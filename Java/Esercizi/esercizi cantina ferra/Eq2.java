public class Eq2{
	public static void main(String args[]){
			System.out.println(deposito(5,0.025,100));
		}
		
	public static double deposito(int anni, double interesse,int deposito){
		if(anni==0)
			return deposito;
		else{
			double a= (deposito(anni-1,interesse,deposito))*(interesse+1);
			return a;
		}
	}
	
}