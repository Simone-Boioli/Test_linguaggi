public class Ricorsione{
		public static void main (String []a){
			System.out.println(Deposito(4,0.025,100));
		}
		public static double Deposito(int anni, double interesse, int deposito){
			if(anni == 0)
				return deposito;
			else{
				return (Deposito(anni-1, interesse, deposito))*(interesse+1);
			}
		}
}