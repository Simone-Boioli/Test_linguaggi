
public class mcm {
	public static long calcolaMcm(long a, long b){
		long mcm = ((a*b)/MCD.calcoloMCD(a,b));
		return mcm;
	}
}
