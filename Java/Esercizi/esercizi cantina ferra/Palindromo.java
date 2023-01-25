public class Palindromo{
	public static void main(String args[]){
		System.out.println(pali("avid ?adiva"));
		}
	
	public static boolean pali(String s){
		return pali(s,0,s.length()-1);
	}
		
	public static boolean pali(String s, int inizio, int fine){
			if(inizio>=fine)
				return true;
			else{
				if(isPunteggiatura(s.charAt(inizio))) return(pali(s,inizio+1,fine));
				else if(isPunteggiatura(s.charAt(fine))) return(pali(s,inizio,fine-1));
				else return(s.charAt(inizio)==s.charAt(fine)&&pali(s,inizio+1,fine-1));
			}
	}
	
	public static boolean isPunteggiatura(char lettera){
		if(lettera=='.' || lettera==',' || lettera==' ' || lettera==':' || lettera=='-' || lettera=='?' || lettera=='!' || lettera=='\'') return true;
		else return false;
	}
}