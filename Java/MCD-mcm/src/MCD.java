
public class MCD {
	
	public static long calcoloMCD(long a, long b){
		long t;
		while(b != 0){
			t = b;
			b = a%b;
			a = t;
		}
		return a;
	}
}
