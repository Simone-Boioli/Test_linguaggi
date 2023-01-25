public class Start{
	public static void main(String[]args){

		int N = 5;

		Forchetta[] forchette = new Forchetta[N];
		Filosofo[] filosofi = new Filosofo[N]; 

		for(int i = 0; i < N; i++){
			forchette[i] = new Forchetta(i);
		}

		for(int i = 0; i < N; i++){
			filosofi[i] = new Filosofo(i, forchette[(i-1+N)%N], forchette[i]);
			filosofi[i].start();
		}
	}
}
