class Prova3{

	public static double elevazione(double b, int e){
		double a=0;
		if(e>=0){
			a=1;
			for(int i=0; i<e;i++){
				a=a*b;
			}
		}
		return a;
	}
	
	public static void main(String[]args){
			int a=2;
			int b=3;
		
		System.out.println(elevazione(a,b));
	}
	
	
}
