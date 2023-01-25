import java.util.*;

/**

Alcuni algoritmi ricorsivi fatti a lezione.

reverseNum : inverte la rappresentazione di un numero intero 1234 -> 4321 senza
             passare dalle stringhe.
           
radice : calcola la radice di un numero utilizzando l'algoritmo di Newton (o di Erone)

configurazioni: stampa tutte le configurazioni di una stringa di lughezza n dove
                ciascun carattere può assumere i valori 'A', 'B', 'C': 
                AAA AAB AAC ABA ... BCC CCC 

qsort: algoritmo di ordinameto QuickSort

palyndrome: determina se una parola è palindroma o no. 
            "osso" -> palindroma
            "pippo" -> non palindroma

ricercaminimo: determina il valore minimo in un array di interi NON ordinati.

*/

public class ricorsione {
	
	public static void main(String[] args) {
		
		int n = 233765;
		
		int m;
		
		m = reverseNum(n);
		
		System.out.println(n);
		System.out.println(m);
		
		System.out.println("Radice di 0.1="+radice(0.1));
		
		char[] s=new char[3];
		
		configurazioni(s);
		
		int a[] = get_array(10);
		
		stampa(a);
		
		qsort(a);
		
		
		System.out.println(palyndrome("osso"));

		System.out.println(palyndrome("osiso"));

		System.out.println(palyndrome("osiaso"));
	
		System.out.println("capitale 100 dopo 10 anni al 1.5% = "+deposito(100,0.015,10));
	
		int[] b = get_array(10);
		
		stampa(b);
		
		System.out.println("Il valore minimo e' = "+ricercaMinimo1(b));
		System.out.println("Il valore minimo e' = "+ricercaMinimo2(b));
	
	}
	
	static void stampa(int[] a) {
		for(int i = 0; i < a.length; ++i)
			System.out.print(a[i]+" ");
		System.out.println();	
	}
	
	static int[] get_array(int size) {
		Random r = new Random();
		
		int[] a = new int[size];
		
		for(int i = 0 ; i < size; ++i) {
			a[i] = r.nextInt()%100;
		}
		return a;
	}
	
//--------------------------------------------------------------------------

	static int reverseNum(int v) {
		
		int esp = (int) Math.log10(v);

		int num = v-10*(v/10);
		
		if (esp == 0) return num;
		
		return num*(int)Math.pow(10,esp)+reverseNum(v/10);
		
	}
	
//--------------------------------------------------------------------------
	
	static double radice(double val) {
	
		double epsilon=0.0001;
	
		return radiceHelper(val,1.0,epsilon);
	
	}

	static double radiceHelper(double val, double x, double eps) {
	
		if (Math.abs(x-val/x)<eps) return x;
		
		double x2 = (x+val/x)/2;
		
		return radiceHelper(val,x2,eps);
	
	}

//--------------------------------------------------------------------------

	static void configurazioni(char[] s) {
		configurazioniHelper(0,s);	
	}
	
	static void configurazioniHelper(int i, char[] s) {
		if (i == s.length) {
			System.out.println(s);
			return;
		}
		
		for(int j = 0; j < s.length; ++j) {
			s[i] = (char)('A'+ j);
			configurazioniHelper(i+1,s);
		}
	}

//--------------------------------------------------------------------------

	static void qsort(int[] a) {
		
		qsortHelper(a, 0, a.length - 1);
		
	}
	
	static void qsortHelper(int[] a, int left, int right) {
		
		if (left >= right) return;
		
		int i = left;
		int j = right;
		
		int pivot = a[(i+j) / 2];
		
		while (i <= j) {
			while (a[i] < pivot) ++i;
			while (a[j] > pivot) --j;
			
			if (i <= j) {
				int tmp = a[j];
				a[j] = a[i];
				a[i] = tmp;
				--j;
				++i;
			}
		}
		
		if (i-1 > left) qsortHelper(a,left, i-1);
		if (i < right) qsortHelper(a, i, right);
		
	}
	
//--------------------------------------------------------------------------
	
	static boolean palyndrome(String s) {
		return palyndrome(s,0, s.length()-1);
	} 
	
	static boolean palyndrome(String s, int left, int right) {
	
		if (left >= right) return true;
		
		if (s.charAt(left) == s.charAt(right))
			return palyndrome(s, left + 1, right - 1);
		
		return false;
	}
	
//--------------------------------------------------------------------------

	static double deposito(double capitale, double tasso, int anni) {
		if (anni == 0) return capitale;
		
		return deposito(capitale * (1.0 + tasso), tasso, anni-1);
	}
	
//--------------------------------------------------------------------------

	static int ricercaMinimo1(int[] a) {
		//ToDo check di almeno 1 elemento
		return ricercaMinimo1(a,a[0],1);
	}
	
	static int ricercaMinimo1(int[] a, int min, int i) {
		if (i == a.length) return min;
		
		if (a[i] < min) 
			min = a[i];
		
		return ricercaMinimo1(a,min,i+1);
	}
	
	static int ricercaMinimo2(int[] a) {
		//ToDo check di almeno 1 elemento
		
		return ricercaMinimo2(a, 0, a.length-1);
		
	}
	
	static int ricercaMinimo2(int[] a, int left, int right) {
		
		if (left == right) return a[left];
		
		int m = (left+right) / 2;
		
		int min1 = ricercaMinimo2(a,left,m);
		int min2 = ricercaMinimo2(a,m+1,right);
		
		return (min1<min2)?min1:min2;
		
	}
}