public class MetodiRicorsivi{
	public static void main(String[]args){
		int n = 4;
		int m = 2;
		String s = "pippo";
		String t = "osso";
		int [] a = {4,5,3,5,6};
		
		System.out.println("pow = "+pow_ricorsiva(n,m));
		System.out.println("fibonacci = " + fibo_ricorsiva(n));
		System.out.println("senza vocali = " + eliminaVocali(s));
		System.out.println("reverse = " + reverse(s));
		System.out.println("fattoriale = " + fattoriale(n));
		System.out.println("palindroma = " + palindroma(s));
		System.out.println("palindroma = " + palindroma(t));
		System.out.println("somma = " + somma(n));
		System.out.println("op.ternario = " +operatoreTernario(n));
		System.out.println("minimo = " + minDivideAtImpera(a, 0, a.length-1));
		System.out.println("MCD = " + MCD(n, m));
		System.out.println("valore = " + valore(100,2.5,3));
	}
	
	public static int pow_ricorsiva(int n, int m){  //n ---> base, m---> potenza 
		//caso base
		if(m == 0){
			return 1;  // un numero elevato alla 0 è uguale a 1
		}else{
			return (n*pow_ricorsiva(n, m-1));
		}
	}
	
	public static int fibo_ricorsiva(int n){
		if(n == 0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			return fibo_ricorsiva(n-1) + fibo_ricorsiva(n-2);
		}
	}	
	
	public static String eliminaVocali(String s){
		if(s.equals("")){
			return ("");
		}else 
			if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
				return eliminaVocali(s.substring(1));
			}else{
				return s.substring(0,1) + eliminaVocali(s.substring(1));
			}
		
	}
	
	public static String reverse(String s){
		if(s.equals("")){
			return ("");      // caso base
		}else{
			return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
		}
	}
	
	public static int fattoriale(int n){
		if(n ==0){
			return 1;  //caso base
		}else{
			return (n* fattoriale(n-1));
		}
	}
	
	public static boolean palindroma(String s){
		if(s.length() <= 1){
			return true; // una stringa vuota o con una sola lettera è palindroma
		}else{
			return (s.charAt(0) == s.charAt(s.length()-1) && palindroma (s.substring(1, s.length()-1)));
		}
		
	}
	
	public static int somma(int n){
		if(n == 0){
			return 0;
		}else{
			return n + somma(n-1);
		}
	}
	
	public static int operatoreTernario(int n){
		int x;
		x = n < 10 ? 1 : 9;
		return x;
	}
	
	public static int minDivideAtImpera(int [] a, int from, int to){
		if(from == to){
			return a[from];
		}
		int mid = (from+to) /2;
		
		int min1 = minDivideAtImpera(a, from, mid);   //chiamata ricorsiva sulla prima parte
		int min2 = minDivideAtImpera(a, mid+1, to);  //chiamata ricorsiva sulla seconda parte
		
		if(min1 < min2){
			return min1;
		}else{
			return min2;
		}
	}
	
	public static int MCD (int a, int b){
		if(b == 0){
			return a;
		}else{
			return MCD(b, a%b);
		}
	}
	
	public static double valore(double dep, double interesse, double anni){
		if(anni == 0){
			return dep;
		}else{
			return (1+interesse) * valore(dep, interesse, anni -1);
		}
	}
}