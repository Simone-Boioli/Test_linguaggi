public class EliminaVocali{
	public static void main(String arg[]){
		System.out.println(eliminaVocali("pippo",4));
	}
	
	public static String eliminaVocali(String str,int cont){
		if(cont==-1){
			return "";
		}
		else{
			if(isVocale(str.charAt(cont))){
				return ""+eliminaVocali(str,cont-1);
			}
			else{
				return str.charAt(cont)+eliminaVocali(str,cont-1);
			}
		}
	}
	
	public static boolean isVocale(char lettera){
		if(lettera=='a' || lettera=='i' || lettera=='e' || lettera=='u' || lettera=='o')
			return true;
		else
			return false;
	}
}