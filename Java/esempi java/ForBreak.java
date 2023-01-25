public class ForBreak {
	public static void main(String[] args) {
		int[] elemento = {2, 4, 5, 6, 10};
		int n = 5;
		int i;
		int elementoCercato = 5;
		for (i=0; i<n; i++) 
			if (elemento[i] == elementoCercato)
				break;
		if (i != n)
  			System.out.println("Elemento trovato in pos.: " + i);
		else 
  			System.out.println("Elemento non trovato");
	}
}