public class Ricorsione2{
		public static void main(String []a){
		}
		
		public static String eliminaVocali(String str,int cont){
			if(str.lenght==0){
				return "";
			}
			else{
				if(isVocale(str.charAt(cont))){
					return (("") +eliminaVocali(String str, int cont-1));
				}
				else{
					return str.charAt(cont)+eliminaVocali(String str, int cont-1);
				}
			}
		}
		
		public static boolean isVocale(char lettera){
				if(lettera=='a' || lettera =='e'  || lettera == 'i' || lettera == 'o' || lettera == 'u')
					return true;
				else
					return false;
		}
}